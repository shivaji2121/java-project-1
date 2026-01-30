package com.ReflectionApi;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    static void main(String[] args) throws Exception{
        Cat c1 = new Cat(1, "meow", "meow@gamil.com", "lsjdfksccccdlfja");
        Field[] fields=c1.getClass().getDeclaredFields();
        for (Field field:fields){
         if(field.getName().equals("name")){
          field.setAccessible(true);
          field.set(c1,"jimmy kill");
         }
        }
        System.out.println(c1.getName());

        System.out.println("----------------");
        Method[] methods= c1.getClass().getDeclaredMethods();
        for (Method method:methods){
            if(method.getName().equals("hello")){
                method.setAccessible(true);
                method.invoke(c1);
            };
        }
    }
}
