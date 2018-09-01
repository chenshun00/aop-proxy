package top.huzhurong.aop.other;

import lombok.Builder;
import lombok.Data;

/**
 * @author luobo.cs@raycloud.com
 * @since 2018/9/1
 */
@Data
@Builder
public class Test {
    private Integer id;
    private String name;
    private Integer age;
}