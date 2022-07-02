package com.huang.map;

import com.huang.collection_set.d3_collection_tool.Apple;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        // TreeMap集合自带排序。  可排序 不重复（只要大小规则一样就认为重复）  无索引
        treeMap.put(13,"网满足");
        treeMap.put(12,"张三");
        treeMap.put(1,"网满足");
        System.out.println(treeMap);

        TreeMap<Apple, String> maps = new TreeMap<>(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2){
                return Double.compare(o2.getPrice() , o1.getPrice()); //降序排列
            }
        });
        maps.put(new Apple("红富士", "红色", 9.9, 500), "山东" );
        maps.put(new Apple("青苹果", "绿色", 15.9, 300), "广州");
        maps.put(new Apple("绿苹果", "青色", 29.9, 400), "江西");
        maps.put(new Apple("黄苹果", "黄色", 9.8, 500), "湖北");

        System.out.println(maps);


    }
}
