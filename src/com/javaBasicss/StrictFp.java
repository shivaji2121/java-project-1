package com.javaBasicss;

strictfp class StrictFp {
    float f=123.3948908f;
    strictfp void calc(){
        System.out.println(f);
    }
    static void main(String[] args) {
    StrictFp obj=new StrictFp();
    obj.calc();

    TypeCasting obj2=new TypeCasting();
    obj2.Print();

    B obj3=new B();
    A obj4=obj3;
    obj4.Print();
    obj4.hello();

    int i;
    float ff=123.47f;
    i=(int)ff;
    System.out.println(i);

     A a;
     B bb=new B();
     bb=(B) bb;

        System.out.println("hello"+bb);
    }
}
