package cn.thinkinjava.design.pattern.struct.proxy.demo.cphs;

import cn.thinkinjava.design.pattern.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 客户端测试
 *
 * @author qiuxianbao
 * @date 2024/01/11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ProxyCphsClientTest {

    @Autowired
    private HttpCloudService httpCloudService;

    @Test
    public void testHttpCloudService() {
        System.out.println(httpCloudService.test1("test1"));
//        path is /test1 | addToken is true | body is "test1"

        System.out.println(httpCloudService.test2("test2"));
//        path is /test2 | addToken is false | body is "test2"
    }

}
