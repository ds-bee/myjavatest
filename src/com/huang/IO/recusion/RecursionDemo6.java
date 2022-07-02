package com.huang.IO.recusion;

public class RecursionDemo6 {

    //定义几个静态变量用于存储可以买的数量

    public static void main(String[] args) {
        int buy = buy(10,0,0);
        System.out.println(buy);
    }

    /**
     * 1.递归公式 ：f(x) -f(x)/2 - 1 = f(x+1) => f(x) = 2f(x+1) + 2
     * 2.终结点 f(10) = 1
     * 3.递归方向走向终结点
     */

    public static int buy(int money, int cap ,int bottle){
        int num = 0;
        int num1 = cap;
        int num2 = bottle;
        int sum = 0;

        num = money/2;
        num1 =num1 + money/2;
        num2 =num2 + money/2;

        if(money>1){
            sum = money/2;
            money = money%2;
        }else if(num1 >= 4){
            sum = sum + num1/4;

            num1 = num1/4%4;
        }else if(num2 >= 2){
            sum = sum +num2/2;
            num2 = num2/2%2;
        }else {
            return 0;
        }

        return sum + buy(money,num1,num2);
    }
}
