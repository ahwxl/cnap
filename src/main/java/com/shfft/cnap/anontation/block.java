/**
 * www.bplow.com
 */
package com.shfft.cnap.anontation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.shfft.cnap.enums.Type;

/**
 * @desc
 * @author wangxiaolei
 * @date 2018年11月4日 上午11:58:07
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface block {
	
	String value() default "";

	int index() default 0;

	int lenght() default 0;

	Type type() default Type.STRING;

	String offset() default "L";

}
