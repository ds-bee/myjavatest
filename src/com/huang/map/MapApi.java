package com.huang.map;

import java.util.HashMap;
import java.util.Set;

public class MapApi {
    /**
     目标：Map集合的常用API(重点中的重点)
     - public V put(K key, V value):  把指定的键与指定的值添加到Map集合中。
     - public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
     - public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
     - public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中。
     - public Set<Map.Entry<K,V>> entrySet(): 获取到Map集合中所有的键值对对象的集合(Set集合)。
     - public boolean containKey(Object key):判断该集合中是否有此键。
     - public boolean containValue(Object value):判断该集合中是否有此值。
     */
    public static void main(String[] args) {
        // 1.添加元素: 无序，不重复，无索引。
        HashMap<String, Integer> maps = new HashMap<>();

        maps.put("iphoneX",10);
        maps.put("娃娃",20);
        maps.put("iphoneX",100);//  Map集合后面重复的键对应的元素会覆盖前面重复的整个元素！
        maps.put("huawei",100);
        maps.put("生活用品",10);
        maps.put("手表",10);

        System.out.println(maps); //map自己写了同string方法

//        maps.clear();
//        System.out.println(maps); //map自己写了同string方法
        System.out.println(maps.get("huawei"));
        System.out.println(maps.get("iphoneX"));

//        System.out.println(maps.remove("iphoneX"));
        System.out.println(maps.containsKey("adfad"));
        System.out.println(maps.containsKey("huawei"));
        System.out.println(maps.containsValue(100));

        Set<String> mapsset = maps.keySet();

        System.out.println(mapsset);



    }
}
