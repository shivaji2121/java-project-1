package com.oops.in.Interface;

public interface Inter2 {
    void m1();
}
interface  inter3{
    void m1();
    void m2();
}

class Hello implements Inter2,inter3{
    @Override
    public void m2() {
        System.out.println("overirdden the m2 from inter-3");
    }

    @Override
    public void m1() {
        System.out.println("overirdden the m1 from inter-2");
    }
}