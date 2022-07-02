package com.huang.leetcode.mySqrt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public int mySqrt(int x) {
        long y = 0 ;
        long z = 0 ;
        int tem = 0 ;
        int tem1 = x;
        do{
            tem1 = tem1 / 10;
            tem++;
        }while(tem1 > 10);
        for(int i = 0 ; i < (tem/2) ; i++){
            y = y*10;
        }

        do{
            y += 1;
            z= y * y;
        }while(z<=x);
        y = y -1 ;

        return (int)y;
    }
}

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);

            int ret = new Solution().mySqrt(x);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}