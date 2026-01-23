package com.oops.in;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Maths {
    static void main(String[] args) {
        bigDecimal();
    }
    static void bigDecimal(){
//        double d1=374.56;
//        double d2=374.26;
//        System.out.println("diff"+(d1-d2));

        BigDecimal b1=new BigDecimal("374.56");
        BigDecimal b2=new BigDecimal("374.26");
        System.out.println("diff: "+b1.subtract(b2));

        BigDecimal b3=new BigDecimal(123.12);
        System.out.println(" "+b3.toString());
        System.out.println("scaled value: "+b3.setScale(1, RoundingMode.HALF_DOWN).toString());
    }

    static  void bigInteger(){

    }


}
