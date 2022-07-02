package com.huang.collection_set.d1_collection_set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<String> sets = new HashSet<>(); // 一行经典代码S  无序不重复，无索引 使用了多态Set

        sets.add("MySql");
        System.out.println(sets);

    }
}
