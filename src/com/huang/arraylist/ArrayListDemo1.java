package com.huang.arraylist;


import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("java");
        arrayList.add("java");
        arrayList.add("mysql");
        arrayList.add("黑马");
        arrayList.add(23);
        arrayList.add(null);
        System.out.println(arrayList);

        //给指定索引位置插入元素
        arrayList.add(2,"huang");
        System.out.println(arrayList);

        //使用泛型约束集合
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("huangyane");
//        list1.add(1); 报错
        ArrayList<Integer> list2 = new ArrayList<>();

        //获得某个索引位置的元素
        System.out.println(arrayList.get(3));


        System.out.println(arrayList.size());
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.print(arrayList.get(i));
//        }

        System.out.println(arrayList);

        arrayList.remove("java");

        System.out.println(arrayList);

        arrayList.set(1,"的咖啡机");

        System.out.println(arrayList);






    }
}
