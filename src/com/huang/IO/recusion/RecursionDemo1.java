package com.huang.IO.recusion;

public class RecursionDemo1 {

    public static void main(String[] args) {
        System.out.println(f(5));

    }

    /**
     * 1.递归公式
     * 2.终结点
     * 3.递归方向走向终结点
     */

    public static int f(int n){
        if(n == 1){
            return 1;
        }else {

            return f(n-1) * n;
        }
    }
}
