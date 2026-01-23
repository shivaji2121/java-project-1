package com.oops.in;

import java.math.BigInteger;

public class BigInt {
    static void main(String[] args) {
        fact(25);

    }

    static  void fact(int count){
        BigInteger fact= BigInteger.ONE;
        for (int i = 2; i <= count ; i++) {
        fact=fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }

}
