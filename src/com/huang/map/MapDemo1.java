package com.huang.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
//        HashMap<String, Integer> maps = new HashMap<>(); // 有调整顺序
        Map<String, Integer> maps = new LinkedHashMap<>(); // 无调整顺序 但是有值覆盖
        maps.put("鸿星尔克", 3);
        maps.put("java", 13);
        maps.put("雕刻", 113);
        maps.put("鸿星尔克", 3);
        maps.put(null, null);
        System.out.println(maps);


    }
}
