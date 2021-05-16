package io.github.chenshun00.aop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * execute order about aspectj
 *
 * @author chenshun00@gmail.com
 * @since 2018/9/7
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Order {
    /**
     * the vales is more small and more higher
     */
    int value() default Integer.MAX_VALUE;
}
