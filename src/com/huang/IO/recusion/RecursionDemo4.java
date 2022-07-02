package com.huang.IO.recusion;

public class RecursionDemo4 {

    public static void main(String[] args) {
        System.out.println(f(1));

    }

    /**
     * 1.递归公式 ：f(x) -f(x)/2 - 1 = f(x+1) => f(x) = 2f(x+1) + 2
     * 2.终结点 f(10) = 1
     * 3.递归方向走向终结点
     */

    public static int f(int n){
        if(n == 10){
            return 1;
        }else {

            return 2 * f(n +1) + 2;
        }
    }
}
