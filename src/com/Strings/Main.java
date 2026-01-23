//package com.Strings;
//
//public class Main {
//    static void main(StringBuffer[] args) {
////        String s1="jlc";
////        String s2="jlc";
//
////        String s1=new String("jlc");
////        String s2=new String("jlc");
////        String s3=new String("jlc");
////        String s4=s3.intern();
//        StringBuffer s1="this is test string ";
//        StringBuffer s2=s1.substring(0,4);
//        System.out.println(s2.equals("This"));//false
//        System.out.println(s2.equalsIgnoreCase("This"));
//
//        StringBuffer str1 = "run";
//        StringBuffer str2 = new StringBuffer("run");
//        StringBuffer str3 = "gun";
//        StringBuffer str4 = "sun";
//
//        System.out.println(str1.compareTo(str2));
//
//        if(str1.compareTo(str2)==0){
//            System.out.println("both are equal");
//        }
//        else {
//            System.out.println("both are not equal");
//        }
//        System.out.println(str1.charAt(0));
//        System.out.println(str1.substring(0,3));
//
//        StringBuffer date = "12/01/2016";
//        System.out.println("index " + date.indexOf("0"));
//        System.out.println("last index: "+date.lastIndexOf("1"));
//
//        StringBuffer ss1= " Contains example nodejs";
//        StringBuffer ss2 = "Example";
//        System.out.println(ss1);
//        System.out.println("is ss1 contians ss2: "+ss1.toLowerCase().contains(ss2.toLowerCase()));
//        System.out.println(ss1.strip());
//
//        StringBuffer st1 = "split example program";
//        StringBuffer st2[]=st1.split("\\s");
//        System.out.println(str1.length());
//        for(StringBuffer w:st2){
//            System.out.println("word: "+w);
//        }
//
//
//
//
//    }
//
//    static  boolean isStringEmpty(StringBuffer str){
//        if(str==null || str.isEmpty()){
//            return true;
//        }
//        else {
//            return false;
//        }
//
//    }
//}
