package io.github.chenshun00.web.support.impl;

import java.util.Enumeration;

/**
 * @author chenshun00@gmail.com
 * @since 2018/10/27
 */
public interface HttpSession {

    long getCreationTime();

    String getId();

    Object getAttribute(String name);

    Enumeration<String> getAttributeNames();

    void setAttribute(String name, Object value);

    void removeAttribute(String name);

    boolean isNew();
}
