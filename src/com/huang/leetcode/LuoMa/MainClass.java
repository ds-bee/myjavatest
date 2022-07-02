//package com.huang.leetcode.LuoMa;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//class Solution {
//    public int romanToInt(String s) {
//        HashMap<Character, Integer> sites = new HashMap<>();
//        sites.put('I',1);
//        sites.put('V',5);
//        sites.put('X',10);
//        sites.put('L',50);
//        sites.put('C',100);
//        sites.put('D',500);
//        sites.put('M',1000);
//
//        int value = 0;
//
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            int a = sites.get(chars[i]);
//
//
//            if(a >sites.get(chars[i+1]) && sites.get(chars[i+1])!=null){
//                value = value+a;
//            }else if(a <sites.get(chars[i+1]) && sites.get(chars[i+1])!=null){
//                value = value +a;
//            }
//
//        }
//        return value;
//
//
//
//    }
//}
//
//public class MainClass {
//    public static String stringToString(String input) {
//        return JsonArray.readFrom("[" + input + "]").get(0).asString();
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String line;
//        while ((line = in.readLine()) != null) {
//            String s = stringToString(line);
//
//            int ret = new Solution().romanToInt(s);
//
//            String out = String.valueOf(ret);
//
//            System.out.print(out);
//        }
//    }
//}