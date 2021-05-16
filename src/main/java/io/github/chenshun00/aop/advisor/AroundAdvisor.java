package io.github.chenshun00.aop.advisor;

import io.github.chenshun00.aop.invocation.CglibInvocation;
import io.github.chenshun00.aop.invocation.Invocation;
import io.github.chenshun00.aop.invocation.JdkInvocation;
import io.github.chenshun00.aop.advisor.pointcut.Pointcut;

import java.lang.reflect.Method;

/**
 * 环绕增强
 *
 * @author chenshun00@gmail.com
 * @since 2018/8/26
 */
public class AroundAdvisor extends AbstractAdvisor implements MethodInterceptor {

    public AroundAdvisor(Method advisorMethod, Object proxy, Object[] args, Pointcut pointcut) {
        super(advisorMethod, proxy, args, pointcut);
    }

    @Override
    public Object invoke(Invocation invocation) throws Throwable {
        if (invocation instanceof CglibInvocation || invocation instanceof JdkInvocation) {
            Method method = getAdvisorMethod();
            return handle(method, getProxy(), invocation);
        } else {
            throw new IllegalAccessException("参数非法!");
        }
    }

    private Object handle(Method method, Object target, Invocation invocation) throws Throwable {
        method.setAccessible(true);
        if (getArgs().length == 0) {
            return method.invoke(target);
        } else {
            if (invocation == null) {
                throw new IllegalStateException("切面处理状态异常，可能是个bug");
            }
            return method.invoke(target, invocation);
        }
    }

}
