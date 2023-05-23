package cn.thinkinjava.design.pattern.struct.proxy.frame;

/**
 * 代理主题
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class ProxySubject extends Subject{
    private Subject subject;

    @Override
    public void request() {
        if (subject == null) {
            subject = new RealSubject();
        }

        preRequest();
        subject.request();
        afterRequest();
    }

    private void preRequest() {

    }

    private void afterRequest() {

    }
}
