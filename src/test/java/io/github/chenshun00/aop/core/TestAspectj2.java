package io.github.chenshun00.aop.core;

import io.github.chenshun00.aop.annotation.After;
import io.github.chenshun00.aop.annotation.Aspectj;
import io.github.chenshun00.aop.annotation.Before;
import io.github.chenshun00.aop.annotation.Order;

/**
 * @author chenshun00@gmail.com
 * @since 2018/8/26
 */
@Aspectj
@Order(1)
public class TestAspectj2 {
    @Before("public void top.huzhurong.aop.core.Bin info2()")
    public void binfoefore2() {
        System.out.println("-----$ before method in class TestAspectj2 $-----");
    }

    @After("public void top.huzhurong.aop.core.Bin info2()")
    public void after() {
        System.out.println("-----$ after method in class TestAspectj2 $------");
    }

//    /**
//     * 测试带参数 Invocation invocation
//     */
//    @Around("public void top.huzhurong.aop.core.Bin other()")
//    public Object around(Invocation invocation) throws Throwable {
//        System.out.println("around before");
//        Object proceed = invocation.proceed();
//        System.out.println("around after");
//        return proceed;
//    }
}
