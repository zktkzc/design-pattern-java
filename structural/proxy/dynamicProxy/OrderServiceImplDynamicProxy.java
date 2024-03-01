package structural.proxy.dynamicProxy;

import structural.proxy.staticProxy.Order;
import structural.proxy.staticProxy.OrderService;
import structural.proxy.staticProxy.OrderServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceImplDynamicProxy implements InvocationHandler {
    private Object orderService;

    public OrderServiceImplDynamicProxy(Object orderService) {
        this.orderService = orderService;
    }

    public Object bind() {
        return Proxy.newProxyInstance(orderService.getClass().getClassLoader(), orderService.getClass().getInterfaces(), this);
    }

    private void before() {
        System.out.println("代理对象，开启事务");
    }

    private void after() {
        System.out.println("代理对象，提交事务");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(orderService, args);
        after();
        return result;
    }
}
