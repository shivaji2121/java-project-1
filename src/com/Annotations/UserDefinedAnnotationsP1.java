package com.Annotations;

interface GrapndParent{
    public abstract void car();
}
class Parent implements GrapndParent{

    @Override
    public void car() {
        System.out.println("i have car and bike");
    }
    @Deprecated
    public void telephone(){
        System.out.println("this is depricated okay");
    }
}
@SuppressWarnings({"unused","deprecation"})
public class UserDefinedAnnotationsP1 {
    static void main(String[] args) {
        int a=10;
        Parent parent=new Parent();
        parent.telephone();
        System.out.println("welcome to spring boot");
    }
}
