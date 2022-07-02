//package com.huang.leetcode.isValid;
//
//import javax.xml.ws.EndpointReference;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//class Solution {
//    public boolean isValid(String s) {
//        char[] chars = s.toCharArray();
//
//        for (int i = 0; i < chars.length - 1; i++) {
//            char aChar = chars[i];
//            switch (aChar){//()[]{}
//                case '(' : if(chars[i +1] ==')'){
//                    return true;
//                }
//                case '[' : if(chars[i +1] == ']'){
//                    return true;
//                }
//                case '{': if(chars[i + 1] == '}'){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//}
//
///**
// * @author 86157
// */
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
//            boolean ret = new Solution().isValid(s);
//
//            String out = booleanToString(ret);
//
//            System.out.print(out);
//        }
//    }
//}