package com.huang.leetcode.zichushu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l1 = new ArrayList<>();
        int a = left;
        int b = right;
        for(a=left ; a<=right ; a++){
            if(left<10){
                l1.add(left);
            }else if((a>10) && (a<100) && (a%(a/10)==0) && (a%(a%10)==0)){
                l1.add(a);
            }else if((a>100) && (a<1000) && (a%(a/100))==0 && (a%((a%10)%10)==0)
                    && (a%(a%10)/10)==0){
                l1.add(a);
            }else if((a>1000) && (a<10000) && (a%(a/1000)==0) && (a%(a%10%10%10)==0)
                    && (a%(a%10%10/10)==0) && (a%(a%10/10%10)==0)){
                l1.add(a);
            }
        }
        return l1;
    }
}

public class MainClass {
    public static String integerArrayListToString(List<Integer> nums, int length) {
        if (length == 0) {
            return "[]";
        }

        String result = "";
        for(int index = 0; index < length; index++) {
            Integer number = nums.get(index);
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static String integerArrayListToString(List<Integer> nums) {
        return integerArrayListToString(nums, nums.size());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int left = Integer.parseInt(line);
            line = in.readLine();
            int right = Integer.parseInt(line);

            List<Integer> ret = new Solution().selfDividingNumbers(left, right);

            String out = integerArrayListToString(ret);

            System.out.print(out);
        }
    }
}