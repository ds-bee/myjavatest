package com.huang.collection_set.d1_collection_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo4 {
    public static void main(String[] args) {
        Set<String> sets = new LinkedHashSet<>(); //不重复有序
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
    }
}
