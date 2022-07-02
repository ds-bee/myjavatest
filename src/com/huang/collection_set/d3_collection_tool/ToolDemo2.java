package com.huang.collection_set.d3_collection_tool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 目标：引用数据类型的排序。

 字符串按照首字符的编号升序排序！

 自定义类型的比较方法API:Collections
 - public static <T> void sort(List<T> list):
 将集合中元素按照默认规则排序。
 对于自定义的引用类型的排序人家根本不知道怎么排，直接报错！

 - public static <T> void sort(List<T> list，Comparator<? super T> c):
 将集合中元素按照指定规则排序,自带比较器
 */

public class ToolDemo2 {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>(); // 可以重复！
        apples.add(new Apple("红富士", "红色", 9.9, 500));
        apples.add(new Apple("青苹果", "绿色", 15.9, 300));
        apples.add(new Apple("绿苹果", "青色L", 29.9, 400));
        apples.add(new Apple("黄苹果", "黄色", 9.8, 500));

        //方法一：使用sort方法，但是要在apple类中重写方法 ，不然直接报错， 这里是为什么呀
        Collections.sort(apples); //

//         方式二：sort方法自带比较器对象 使用就近的比较器
        Collections.sort(apples, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return Double.compare(o1.getPrice() , o2.getPrice()); // 按照价格排序！！
            }
        });
        System.out.println(apples);

        Collections.sort(apples, ( o1,  o2) ->  Double.compare(o1.getPrice() , o2.getPrice()) );//使用比较器对象来排序，treeset自动排序
        //这个是上面代码的简写
        System.out.println(apples);
    }


}
