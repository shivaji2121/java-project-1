package com.GarbageCollection;

public class GarbageCollectionp1 {
    public void  finalize(){
        System.out.println("finalize method is called");
    }
    public  static  void main(String...args){
        GarbageCollectionp1 g1=new GarbageCollectionp1();
        GarbageCollectionp1 g2=new GarbageCollectionp1();
        GarbageCollectionp1 g3=new GarbageCollectionp1();

        new GarbageCollectionp1();
        g1=null;
        g2=g3;
        System.gc();
    }
}
