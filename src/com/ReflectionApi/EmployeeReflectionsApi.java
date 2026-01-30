package com.ReflectionApi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Employee{
    private int id;
    private String name;

    void printEmployeeData(){
        System.out.printf("This is employee");
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class EmployeeReflectionsApi {

    static void main(String[] args) {
        Employee employee=new Employee(101,"himanshu");
        Field[] empFields=employee.getClass().getDeclaredFields();

        for (Field field:empFields){
            System.out.println(field.getName());
        }

       Method[] empMethods=employee.getClass().getDeclaredMethods();
        for (Method method:empMethods){
            System.out.println(method.getName());
        }

        Constructor<?>[] empConstr=employee.getClass().getConstructors();

        for (Constructor<?> constructor:empConstr){
            System.out.println("-->"+constructor.getName());
        }
    }
}
