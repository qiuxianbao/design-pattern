package cn.thinkinjava.design.pattern.struct.proxy.demo.cphs.registry;

import cn.thinkinjava.design.pattern.struct.proxy.demo.cphs.annotation.CustomFeignClient;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author qiuxianbao
 * @date 2024/01/10
 */
@Component
public class ServiceBeanDefinitionRegistry implements BeanDefinitionRegistryPostProcessor, ResourceLoaderAware, ApplicationContextAware, InitializingBean {
    private static final String DEFAULT_RESOURCE_PATTERN = "**/*.class";
    private static final String CUSTOM_FEIGN_CLIENT_PACKAGE = "cn.thinkinjava.design.pattern.struct.proxy.demo.cphs";

    private ApplicationContext applicationContext;
    private MetadataReaderFactory metadataReaderFactory;
    private ResourcePatternResolver resourcePatternResolver;

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        Set<Class<?>> clazzSet = scannerPackages(CUSTOM_FEIGN_CLIENT_PACKAGE);
        clazzSet.stream().filter(Class::isInterface).forEach(x -> registerBean(registry, x));
    }

    /**
     * 修改bean的class类型为代理
     *
     * @param registry
     * @param clazz
     */
    private void registerBean(BeanDefinitionRegistry registry, Class<?> clazz) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(clazz);
        GenericBeanDefinition definition = (GenericBeanDefinition) builder.getRawBeanDefinition();
        // 构造方式注入
        definition.getConstructorArgumentValues().addGenericArgumentValue(clazz);
        definition.setBeanClass(ServiceFactory.class);
        definition.setAutowireMode(GenericBeanDefinition.AUTOWIRE_BY_TYPE);
        registry.registerBeanDefinition(clazz.getSimpleName(), definition);
    }

    /**
     * 获取指定路径及子路径下的所有类
     */
    private Set<Class<?>> scannerPackages(String basePackage) {
        Set<Class<?>> set = new LinkedHashSet<>();
        String basePackageName = ClassUtils.convertClassNameToResourcePath(applicationContext.getEnvironment().resolveRequiredPlaceholders(basePackage));

        String packageSearchPath = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX +
                basePackageName + '/' + DEFAULT_RESOURCE_PATTERN;
        try {
            Resource[] resources = this.resourcePatternResolver.getResources(packageSearchPath);
            for (Resource resource : resources) {
                if (resource.isReadable()) {
                    MetadataReader metadataReader = this.metadataReaderFactory.getMetadataReader(resource);
                    String className = metadataReader.getClassMetadata().getClassName();
                    Class<?> clazz;
                    try {
                        clazz = Class.forName(className);
                        if(clazz.isAnnotationPresent(CustomFeignClient.class)){
                            set.add(clazz);
                        }
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return set;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourcePatternResolver = ResourcePatternUtils.getResourcePatternResolver(resourceLoader);
        this.metadataReaderFactory = new CachingMetadataReaderFactory(resourceLoader);
    }

}
