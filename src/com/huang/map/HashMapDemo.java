package com.huang.map;

import com.huang.collection_set.d1_collection_set.Student;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Student, String> maps = new HashMap<>();
        Student stu1 = new Student("无恙", 100, '男');
        Student stu2 = new Student("无恙", 100, '男');
        Student stu3 = new Student("天啊吗", 300, '男');

        maps.put(stu1,"上海");
        maps.put(stu2,"台湾");
        maps.put(stu3,"香港");
        System.out.println(maps);



    }
}
