package com.huang.collection_set.d1_collection_set;

import com.huang.collection_set.d1_collection_set.Apple;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo5 {
    public static void main(String[] args) {
        Set<String> sets = new TreeSet<>();//不重复 无索引 可排序
        sets.add("MySQL"); //api就是collection的常用api
        sets.add("MySQL");
        sets.add("Java");
        sets.add("Java");
        sets.add("HTML");
        sets.add("HTML");
        sets.add("SpringBoot");
        sets.add("SpringBoot");
//        sets.gen(); 报错，因为set不支持索引
        System.out.println(sets);

        Set<Integer> sets1 = new TreeSet<>(); // 不重复 无索引 可排序
        sets1.add(23);
        sets1.add(24);
        sets1.add(12);
        sets1.add(8);
        System.out.println(sets1);

// 方式二：集合自带比较器对象进行规则定制  （优先使用集合自带的比较强，因为能够简写为一行）
        //
//        Set<Apple> apples = new TreeSet<>(new Comparator<Apple>() {
//            @Override
//            public int compare(Apple o1, Apple o2) {
//                // return o1.getWeight() - o2.getWeight(); // 升序
//                // return o2.getWeight() - o1.getWeight(); // 降序
//                // 注意：浮点型建议直接使用Double.compare进行比较
//                // return Double.compare(o1.getPrice() , o2.getPrice()); // 升序
//                return Double.compare(o2.getPrice() , o1.getPrice()); // 降序
//            }
//        });

        Set<Apple> apples = new TreeSet<>((o1, o2) ->  Double.compare(o2.getPrice() , o1.getPrice())  ); //这种写法属于匿名对象，是上面的方法的简写
        //匿名对象复习一下
        apples.add(new Apple("红富士", "红色", 9.9, 500));
        apples.add(new Apple("青苹果", "绿色", 15.9, 300));
        apples.add(new Apple("绿苹果", "青色", 29.9, 400));
        apples.add(new Apple("黄苹果", "黄色", 9.8, 500));
        System.out.println(apples);  // 这里类里面进行比较的方法：是treeset自带的正数是前一个比后一个大的意思
    }

}

