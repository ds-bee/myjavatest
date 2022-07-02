package com.huang.leetcode.climbStairs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public int climbStairs(int n) {
        long tem = (long)n;
        long a = 1;
        if(n % 2 == 1){
            for (long i = 1; i < n-i ; i++) {
                a = a + jisuan(n-i,i);
            }
        }
        if(n % 2 == 0){
            for (long i = 1; i <= n-i ; i++) {
                a = a + jisuan(n-i,i);
            }
        }
        return (int)a;
    }

    long jisuan(long n ,long i ){
        long a;
        long b =1;
        long c = 1;
        for (long i1 = 1; i1 <= i; i1++) {
            c = c *i1;
            b = b * n ;
            n--;
        }
        a = b/c;
        return a;
    }
}




public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);

            int ret = new Solution().climbStairs(n);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}