//package com.huang.leetcode.isPalindrome;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//class Solution {
//    public boolean isPalindrome(String s) {
//        StringBuilder str0 = new StringBuilder();
//        s = s.replaceAll("[^a-zA-Z0-9]", "");
//        char[] chars1 = s.toCharArray();
//        System.out.println(chars1);
//        str0.append(s);
//        str0.reverse();
//        char[] chars = str0.toString().toCharArray();
//        System.out.println(chars);
//        for (int i = 0; i < chars.length; i++) {
//            if((chars[i] == chars1[i]) || (chars[i] == chars1[i] + 32) || (chars[i] == chars1[i] - 32)){
//                return false;
//            }
//        }
//        return true;
//    }
//}
//
//public class MainClass {
//    public static String stringToString(String input) {
//        return JsonArray.readFrom("[" + input + "]").get(0).asString();
//    }
//
//    public static String booleanToString(boolean input) {
//        return input ? "True" : "False";
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String line;
//        while ((line = in.readLine()) != null) {
//            String s = stringToString(line);
//
//            boolean ret = new Solution().isPalindrome(s);
//
//            String out = booleanToString(ret);
//
//            System.out.print(out);
//        }
//    }
//}