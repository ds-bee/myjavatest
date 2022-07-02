package com.huang.collection_set.d4_collections;

import java.util.ArrayList;
import java.util.List;

public class GameDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String arr[] = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String arr1[] = {"♠", "♥", "♣", "♦"};
        String arr2[] = {"👲" , "🃏"};
        String var[] = {};

        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 4; j++) {
                list.add(arr[i] + arr1[j]);
            }


        }
    }

}
