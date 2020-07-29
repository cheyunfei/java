package Reflect_Annotation;
/**
*@author:cloud<br>
*@date:2019年5月27日下午1:53:41<br>
*@class:reflect.myAnnotation.java<br><br>
*/

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;


@Target(value={ElementType.METHOD})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface myAnnotation {
	String str();
	int para();
}
