package Proxy_Factory;

/**
 * 定义了AopProxyFactory的方法：获取AopProxy
 * Created by Lfc on 2017/6/7.
 */
public interface AopProxyFactory {

    AopProxy createAopProxy(AdvisedSupport advisedSupport);
}
