package com.huang.string;

import java.util.Scanner;

public class StringExec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的手机号");
        String tel = scanner.next();

        String before = tel.substring(0, 3);
        String after = tel.substring(7);

        String s = before + "***" + after;
        System.out.println(s);

    }
}
