package io.github.chenshun00.web.support.http;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenshun00@gmail.com
 * @since 2018/9/18
 */
public enum HttpMethod {
    GET,
    HEAD,
    POST,
    PUT,
    PATCH,
    DELETE,
    OPTIONS,
    TRACE;

    private static final Map<String, HttpMethod> mappings = new HashMap<>(8);

    static {
        HttpMethod[] values = values();
        for (HttpMethod httpMethod : values) {
            mappings.put(httpMethod.name(), httpMethod);
        }
    }

    HttpMethod() {
    }

    public static HttpMethod resolve(String method) {
        return method != null ? mappings.get(method) : null;
    }

    public boolean matches(String method) {
        return this == resolve(method);
    }
}
