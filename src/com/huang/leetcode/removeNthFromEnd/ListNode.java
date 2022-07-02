package com.huang.leetcode.removeNthFromEnd;/* -----------------------------------
 *  WARNING:
 * -----------------------------------
 *  Your code may fail to compile
 *  because it contains public class
 *  declarations.
 *  To fix this, please remove the
 *  "public" keyword from your class
 *  declarations.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class ListNode {
    public int val;
    public ListNode next;
    ListNode() {}
    public ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode listNode ,listNode1;
        listNode = head;
        listNode1 = head;
        int first = 0 , second = 0;
        while (head.next != null ){
            second++;
        }
        while (first < n+1 ){
            if(first == n){
                listNode = listNode.next.next;
                break;
            }
            listNode = listNode.next;
            first++;
            }
        listNode1 =listNode;

        return listNode1;
    }
}

