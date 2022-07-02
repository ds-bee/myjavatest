package com.huang.leetcode.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public boolean isPalindrome(int x) {
        String a = String.valueOf(x);
        StringBuilder b = new StringBuilder();

        StringBuilder c = b.append(x);
        c = c.reverse();
        String d = c.toString();
        if(a.equals(d)){
            return true;
        }else{
            return false;
        }

    }
}

public class MainClass {
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);

            boolean ret = new Solution().isPalindrome(x);

            String out = booleanToString(ret);

            System.out.print(out);
        }
    }
}