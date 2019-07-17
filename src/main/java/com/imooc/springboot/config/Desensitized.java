package com.imooc.springboot.config;


import com.imooc.springboot.enums.SensitiveTypeEnum;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Desensitized {

    /**脱敏类型（规则）**/
    SensitiveTypeEnum type();

    /**判断直接是否生效的方法**/
    String isEffictiveMethod() default "";

}
