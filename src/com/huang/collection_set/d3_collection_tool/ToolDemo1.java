package com.huang.collection_set.d3_collection_tool;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 目标：Collections工具类的使用。

 java.utils.Collections:是集合工具类
 Collections并不属于集合，是用来操作集合的工具类。
 Collections有几个常用的API:
 - public static <T> boolean addAll(Collection<? super T> c, T... elements)
 给集合对象批量添加元素！
 - public static void shuffle(List<?> list) :打乱集合顺序。
 - public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。
 - public static <T> void sort(List<T> list，Comparator<? super T> c):将集合中元素按照指定规则排序。
 */

public class ToolDemo1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        //names.add("楚留香"); 之前给这个集合加内容
        //names.add("胡铁花");
        //names.add("张无忌");
        //names.add("陆小凤");
        Collections.addAll(names,"楚留香","胡铁花", "张无忌","陆小凤");

        Collections.shuffle(names);



    }

}
