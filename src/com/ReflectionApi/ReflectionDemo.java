package com.ReflectionApi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
class Student {
    private String name;
    private int age;
    public void sayhello(){
        System.out.println("hello--->");
    }
}
class ClassA {
    private int i;
    private int j;
    // Constructor
    public ClassA(int i, int j){
        this.i = i;
        this.j = j;
    }
    public void setI(int i) {
        this.i = i;
    }
    public void setJ(int j) {
        this.j = j;
    }
    public int getI() {
        return i;
    }
    public int getJ() {
        return j;
    }
}
public class ReflectionDemo {
    static void main(String[] args) {
        try {
            Class<?> c = Class.forName("com.ReflectionApi.ClassA");
            // Getting constructors of the class
            Constructor<?>[] constructors = c.getConstructors();
            System.out.println("Constructors - " + Arrays.toString(constructors));

            // Getting all methods (even inherited) of the class
            Method[] methods = c.getMethods();
            System.out.println("All Methods - " + Arrays.toString(methods));

            // Getting methods of the class
            methods = c.getDeclaredMethods();
            System.out.println("Class Methods - " + Arrays.toString(methods));

            // Getting fields of the class
            Field[] fields = c.getDeclaredFields();
            System.out.println("Fields - " + Arrays.toString(fields));


            Class<?> clazz=String.class;
            System.out.println("Class Name: " + clazz.getName());
            System.out.println("Simple Name: " + clazz.getSimpleName());

            System.out.println("fields");
            for (var f:clazz.getDeclaredFields()){
                System.out.println("-->"+f);
            }

            System.out.println("methods");

            for (var x:clazz.getDeclaredMethods()){
                System.out.println("methods-->"+x);
            }



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
