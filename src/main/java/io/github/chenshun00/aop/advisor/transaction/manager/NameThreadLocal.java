package io.github.chenshun00.aop.advisor.transaction.manager;

/**
 * @author chenshun00@gmail.com
 * @since 2018/8/29
 */
public class NameThreadLocal<T> extends ThreadLocal<T> {
    private final String name;

    public NameThreadLocal(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
