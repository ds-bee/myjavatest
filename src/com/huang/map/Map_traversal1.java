package com.huang.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_traversal1 {
    //将map的键和值放入一个map集合中去 调用的maps.entrySet();这个api
    public static void main(String[] args) {
        Map<String , Integer> maps = new HashMap<>();
        // 1.添加元素: 无序，不重复，无索引。
        maps.put("娃娃",30);
        maps.put("iphoneX",100);
        maps.put("huawei",1000);
        maps.put("生活用品",10);
        maps.put("手表",10);
        System.out.println(maps);

        Set<Map.Entry<String, Integer>> entries = maps.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.print(entry.getKey() + "===>");
            System.out.println(entry.getValue());
        }


    }
}
