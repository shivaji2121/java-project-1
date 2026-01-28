package com.collections.TestPractise;
import java.util.*;

public class ListPractise1 {
    static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("list size : "+list.size());
        Integer count=0;
      for (Integer x:list){
          count+=x;
      }
     int x= list.get(0);
        System.out.println("x--->"+x);
        System.out.println("sum: "+count);

        System.out.println("list: "+list.toString());
        list.remove(1);
        System.out.println("list: "+list.toString());
        list.add(1,5);
        System.out.println("list: "+list.toString());

        for (int i = 0; i < list.size(); i++) {
            System.out.println("ele: "+list.get(i));
        }

        int firstele=list.get(0);
        System.out.println("first ele: "+firstele);
        list.set(0,1000);//for updating ele in spefic index
        System.out.println("list: "+list.toString());
        list.add(0,200);
        System.out.println("list: "+list.toString());
        list.remove(0);
        System.out.println("list: "+list.toString());

        list.remove(Integer.valueOf(1000));
        System.out.println("removal of ele directly: "+list.toString());

//        for (Integer y:list){
//            list.remove(Integer.valueOf(y));
//        }

        System.out.println("list: "+list.toString());

        //max ele
//        int max=list.get(0);
//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i) > max){
//                max=list.get(i);
//            }
//
//        }

        int min=list.get(0);
        int max=list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<min){
                min=list.get(i);

            }
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        System.out.println("max ele: "+max);
        System.out.println("min ele: "+min);

//        List<Integer> list=new ArrayList<>();
//
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        list.add(60);
//        list.add(70);
//        list.add(80);
//        list.add(90);
//        list.add(100);

        //remove the even number from the list
//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i)%2==0){
//                list.remove(i);
//            }
//        } so here it will not work okay so loop in reverse and do operations

//        for (int i = list.size()-1; i >=0 ; i--) {
//            if (list.get(i)%2==0){
//                list.remove(i);
//            }
//        }

//        System.out.println("list: "+list.toString());
//
//       if(list.isEmpty()){
//           System.out.println("yes list is empty");
//       }
//       list.add(null);
//       list.add(null);
//       list.add(null);
//        System.out.println("list: "+list.toString());
//
//        for (Integer xx:list){
//            System.out.println(" : "+xx);
//        }

        //arry to li st
//        List<Integer> list1= Arrays.asList(5,55,6,6,66,6,7,1,2,3,4,4,7,7); //this will fail to add the bcoz
        //arrays.asList()--->having fixed size okay
//        List<Integer> list1=new ArrayList<>( Arrays.asList(5,55,6,6,66,6,7));
//        System.out.println("list: "+list1.toString());
//        list1.add(123);
//        list1.add(345);
//        System.out.println("this will fail "+list1.toString());


        //remove the duplicates using

//        List<Integer> list=new ArrayList<>();
//
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);


//        Iterator<Integer> it=list.iterator();
//        while (it.hasNext()){
//            Integer x=it.next();
//            if(x%2==0){
//                it.remove();
//            }
//        }

//        Iterator<Integer> it=list.iterator();
//        while (it.hasNext()){
//            it.next();
//            it.remove();
//        }
//        System.out.println("moified list: "+list);
//        list.remove(Integer.valueOf(10));
//        list.remove(Integer.valueOf(20));
//        list.remove(Integer.valueOf(30));
//        list.remove(Integer.valueOf(40));
//        System.out.println("moified list: "+list);
//        Iterator<Integer>  itr=list.listIterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
//        System.out.println(list.hashCode());
//        System.out.println(list.addAll());

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(3);
            System.out.println("index of: "+list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(3);

        list1.addAll(list2);
        System.out.println(list1.toString());
        list2.clear();
        System.out.println(list2.toString());
        list1.clear();
        System.out.println(list1.toString());


        List<Integer> list3=new ArrayList<>();
        list3.add(10);
        list3.add(20);
        list3.add(30);
        list3.add(10);
        list3.add(20);
        list3.add(30);
        list3.add(40);
        System.out.println("list: "+list3.toString());
        List<Integer> list4=new ArrayList<>();

        for (Integer ele:list3){
            if(!list4.contains(ele)){
                list4.add(ele);
            }
        }
        System.out.println("duplicates removed: "+list4);

        List<String> cityList = new ArrayList<String>();
        cityList.add("Delhi");
        cityList.add("Mumbai");
        cityList.add("Kolkata");
        List<String> anotherCityList = new ArrayList<String>();
        anotherCityList.add("Hyderabad");
        anotherCityList.add("Bangalore");
        anotherCityList.add("Mumbai");

        cityList.addAll(anotherCityList);

//        for (int i = cityList.size()-1; i >=0 ; i--) {
//            cityList.remove(i);
//        }
        Iterator<String> it=cityList.iterator();

        while (it.hasNext()){
            it.next();
            it.remove();
        }
//        System.out.println("city list: "+cityList.toString());
//        list3.sort(null);
//        System.out.println("sortred order: "+list3.toString());
//        list3.sort(Comparator.naturalOrder());
//        System.out.println("sortred order: "+list3.toString());
//        list3.sort(Comparator.reverseOrder());
//        System.out.println("reverse sorted order: "+list3.toString());
//        Collections.sort(list3);
//        System.out.println("sortred using collectionsm order: "+list3.toString());
        Collections.sort(list3,(a,b)->a-b);
        System.out.println("sortred using collectionsm order: "+list3.toString());

        ListIterator<Integer> itt=list3.listIterator();
        while (itt.hasPrevious()){
            System.out.println(itt.previous());
        }

        List<Integer> numberList = new ArrayList<Integer>();
        ListIterator<Integer> ltr = null;
        numberList.add(25);
        numberList.add(17);
        numberList.add(108);
        numberList.add(76);
        numberList.add(2);
        numberList.add(36);
        ltr = numberList.listIterator();
        System.out.println("Iterating list in forward direction");
        while(ltr.hasNext()){
            System.out.println(ltr.next());
        }

        while (ltr.hasPrevious()){
            System.out.println("-->"+ltr.previous());
        }


    }
}
