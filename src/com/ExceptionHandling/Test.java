package com.ExceptionHandling;
class Test {

    static {
        System.out.println("Static block executed");
    }

    {
        System.out.println("Instance initializer executed");
    }

    Test() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        System.out.println("Main started");

        Test t1 = new Test();
        Test t2 = new Test();
    }
}

