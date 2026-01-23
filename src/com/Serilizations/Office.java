package com.Serilizations;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Office {
    static void main(String[] args) {
        try{
            Employee emp1=new Employee(1,"shivaji");
            FileOutputStream fout=new FileOutputStream("emp.txt");
            ObjectOutputStream objout=new ObjectOutputStream(fout);
            objout.writeObject(emp1);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
