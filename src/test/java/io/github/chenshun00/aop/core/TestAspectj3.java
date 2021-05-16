package io.github.chenshun00.aop.core;

import io.github.chenshun00.aop.annotation.After;
import io.github.chenshun00.aop.annotation.Around;
import io.github.chenshun00.aop.annotation.Aspectj;
import io.github.chenshun00.aop.annotation.Before;
import io.github.chenshun00.aop.invocation.Invocation;

/**
 * @author chenshun00@gmail.com
 * @since 2018/8/27
 */
@Aspectj
public class TestAspectj3 {
    @Before("public String top.huzhurong.aop.core.TestInImpl doInfo()")
    public void before() {
        System.out.println("jdk 动态代理前置拦截");
    }

    @After("public String top.huzhurong.aop.core.TestInImpl doInfo()")
    public void after() {
        System.out.println("jdk 动态代理后置拦截");
    }

    @Around("public String top.huzhurong.aop.core.TestInImpl doInfo()")
    public Object around(Invocation invocation) {
        System.out.println("jdk 环绕拦截前");
        try {
            Object proceed = invocation.proceed();
            System.out.println("jdk 环绕拦截后");
            return proceed;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
