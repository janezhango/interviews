package io.janezhango.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by xiaojing on 4/11/2017.
 */
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String name() default "janezhango";
    boolean enabled() default true;
    int[] value() default {};
}
