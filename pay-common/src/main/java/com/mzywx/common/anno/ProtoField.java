package com.mzywx.common.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName ProtoField
 * @Description TODO
 * @Author hankangli
 * @Date 2020/3/16 14:54
 * @Version 1.0
 **/

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
public @interface ProtoField {
    boolean Ignore() default false;
    Class TargetClass() default Void.class;
    String TargetName() default ""; //非基础类型可以省略
    String Function() default ""; //针对某个特定属性优先执行的方法
}