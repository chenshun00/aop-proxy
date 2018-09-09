package top.huzhurong.ioc.bean;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luobo.cs@raycloud.com
 * @since 2018/9/9
 */
public class DefaultIocContainerTest {
    @Test
    public void testIsAssignableFrom() {
        Class<?> aClass = List.class;
        Assert.assertTrue(aClass.isAssignableFrom(ArrayList.class));
    }

}