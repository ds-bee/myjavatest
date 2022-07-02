package com.huang.ArrayTest1;

public class ArrayTest01 {
    public static void main(String[] args) {
        int[][] arr = {{11 ,22} ,{33, 44}};  //数组中要是想嵌套数组就是需要创建二维数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        printArray(new int[]{3, 1, 2, 6, 4, 2}); //数组是一个特殊的对象，在调用方法外没有定义时，里面要使用new
        //new 这个关键字使用来创建对象的，直接进行数组的传参是需要加上new的
    }
    public static void printArray(int[] array) { //作为传入变量就不需要new了，因为已经存在了
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
