package com.huang.MenthodDemo;

public class MethodDemo {
    public static void main(String[] args) {
        System.out.println(compare(10,20));
        System.out.println(compare((byte) 10,(byte)20)); //强制转换
    }

    private static boolean compare(int i, int i1) {
        System.out.println("int");
        return i == i1;
    }

    private static boolean compare(byte i, byte i1) {
        System.out.println("byte");
        return i == i1;
    }
}
