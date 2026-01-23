package com.Serilizations;

import java.io.*;
import java.util.Iterator;

class  Person implements Serializable{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class Serilizaation {
    static void main(String[] args) throws FileNotFoundException {
    Person p1=new Person(397,"shivaji");
        try{
//        FileOutputStream fout=new FileOutputStream("");
//            ObjectOutputStream out=new ObjectOutputStream(fout);
//            out.writeObject(p1);
//            out.close();
//            fout.close();
            FileInputStream fin=new FileInputStream("Documents");
            ObjectInputStream oin=new ObjectInputStream(fin);
            Person p=(Person) oin.readObject();
            System.out.println(p.id+"---"+p.name);


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
