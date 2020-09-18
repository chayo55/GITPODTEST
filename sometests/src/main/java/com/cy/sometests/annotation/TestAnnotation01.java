package com.cy.sometests.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Mapper{}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Select{
    String value() default "";
}



@Mapper
interface GoodsDao{
    @Select("select * from tb_goods")
    void listObjects();
}

public class TestAnnotation01 {

    public static void main(String[] args) throws NoSuchMethodException {
        System.out.println(GoodsDao.class.getAnnotation(Mapper.class));
        System.out.println(GoodsDao.class.isAnnotationPresent(Mapper.class));

        System.out.println(GoodsDao.class.getMethod("listObjects").getAnnotation(Select.class).value());
    }
}
