package com.huang.MenthodDemo;

public class ArgsDemo01 {

        public static void main(String[] args) {
            int number = 100;
            System.out.println("调用change方法前：" + number);
            change(number);
            System.out.println("调用change方法后：" + number);
        }

        public static void change(int number) {
            number = 200;

            //调用change方法前：100，
            //调用change方法后：100
            //
        }
    }

