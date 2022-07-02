package com.huang.collection_set.d1_collection_set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo3 {
    public static void main(String[] args) {
        Set<Student> sets = new HashSet<>();

        Student s1 = new Student("无恙",20,'男');
        Student s2 = new Student("无恙",20,'男');
        Student s3 = new Student("周兄",30,'男');
        System.out.println(s1.getName());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        sets.add(s1);
        sets.add(s2);
        sets.add(s3);
        System.out.println(sets);



    }
}
