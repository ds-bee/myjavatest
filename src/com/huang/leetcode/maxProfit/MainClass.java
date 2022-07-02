package com.huang.leetcode.maxProfit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public int maxProfit(int[] prices) {
        int tem = 0;
        int best = 0;
        int t3 = 0;
        int t4 = 0 ;
        for (int i = 0; i < prices.length; i++) {
            int t1 = prices[i];
            if(tem > best){
                best = tem;
            }
            for (int j = i + 1; j < prices.length; j++) {
                int t2 = prices[j];

                t3 = t2 - t1;
                if (tem < t3) {
                    tem = t3;
                }
            }
        }
        return best;
    }
}

public class MainClass {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] prices = stringToIntegerArray(line);

            int ret = new Solution().maxProfit(prices);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}