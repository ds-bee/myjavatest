//package com.huang.leetcode.addBinary;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//class Solution {
//    public String addBinary(String a, String b) {
//        int a1 = a.length();
//        int b1 = b.length();
//        int tem = Math.min(a1,b1);
//        int tem2 = Math.max(a1,b1);
//        String s1 = "";
//        char c1 = '0';
//        if(tem!=tem2){
//            for (int i = 0; i < tem2-tem; i++) {
//                s1 +="0";
//            }
//            b = b+s1;
//        }
//
//
//        for (int i = tem-1; i >0 ; i--) {
//            int c = 0;
//            if( b.charAt(i) == '1' && a.charAt(i) == '1' && c1 == '0'){
//                a.charAt(i) = '0';
//                c1 = '1';
//            }
//            if( b.charAt(i) == '1' && a.charAt(i) == '1' && c1 == '1'){
//                a.charAt(i) = '1';
//                c1 = '1';
//            }
//            if(b.charAt(0) == '1' && a.charAt(0) == '1' ){
//                a = "1"+a;
//            }
//            return a;
//        }
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
//            String a = stringToString(line);
//            line = in.readLine();
//            String b = stringToString(line);
//
//            String ret = new Solution().addBinary(a, b);
//
//            String out = (ret);
//
//            System.out.print(out);
//        }
//    }
//}