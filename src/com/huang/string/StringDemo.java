package com.huang.string;

public class StringDemo {
    public static void main(String[] args) {
        String name = "船长";
        name += "教育";
        name += "中心";
        System.out.println(name);

        //创建空白字符串的两种方式
        String s1 = new String();
        String s11 = "外中国";

        char[] char1 = {'a', 'b','c'};
        String s3 = new String(char1);
        System.out.println(s3);


        byte[] bytes ={91 ,9 , 12, 21};
        String s4 = new String(bytes);
        System.out.println(s4);//根据字符数组,创建字符串对象
        byte[] bytes1 = {97, 98, 99, 65, 66, 67};
        String s41 = new String(bytes1);
        System.out.println(s41);
        System.out.println("---------------------------------------");
        String ss1 = "abc";
        String ss2 = "abc";
        System.out.println(ss1 == ss2);

        char[] chars1 = {'a' , 'b' , 'c'};
        String ss3 = new String(chars1);
        String ss4 = new String(chars1);
        System.out.println(ss3 == ss4); //使用字符创建的是不相等的

        String ss = "abc";
        String ss11 = "a" + "b" + "c";
        System.out.println(ss == ss11);





    }
}
