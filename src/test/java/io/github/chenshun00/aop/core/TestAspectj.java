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
@Order(100)
public class TestAspectj {

    @Before("public void top.huzhurong.aop.core.Bin info2()")
    public void first() {
        System.out.println("-----# before method in class TestAspectj #-----");
    }

    @After("public void top.huzhurong.aop.core.Bin info2()")
    public void after() {
        System.out.println("-----# after method in class TestAspectj #-----");
    }
}
