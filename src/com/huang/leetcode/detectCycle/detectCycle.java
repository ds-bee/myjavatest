//package com.huang.leetcode.hasCycle;/* -----------------------------------
// *  WARNING:
// * -----------------------------------
// *  Your code may fail to compile
// *  because it contains public class
// *  declarations.
// *  To fix this, please remove the
// *  "public" keyword from your class
// *  declarations.
// */
//
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.HashMap;
//
//
//
//public class Solution {
//    public ListNode detectCycle(ListNode head) {
//
//        int pos = 0;
//        if(head == null || head.next == null ){
//            return head;
//        }
//        HashMap<ListNode, Integer> nodeHashMap = new HashMap<>();
//        ListNode listNode = head;
//        while (head.next != null){
//            nodeHashMap.put(listNode.next , pos);
//            listNode = listNode.next;
//            pos++;
//
//            for (int i = 0; i < nodeHashMap.keySet().size(); i++) {
//                if(head.next == nodeHashMap.keySet()){
//                    pos = nodeHashMap.get(head.next);
//                    return head;
//                }
//            }
//        }
//        return null;
//    }
//}
//
//public class MainClass {
//    public static int[] stringToIntegerArray(String input) {
//        input = input.trim();
//        input = input.substring(1, input.length() - 1);
//        if (input.length() == 0) {
//            return new int[0];
//        }
//
//        String[] parts = input.split(",");
//        int[] output = new int[parts.length];
//        for(int index = 0; index < parts.length; index++) {
//            String part = parts[index].trim();
//            output[index] = Integer.parseInt(part);
//        }
//        return output;
//    }
//
//    public static ListNode stringToListNode(String input) {
//        // Generate array from the input
//        int[] nodeValues = stringToIntegerArray(input);
//
//        // Now convert that list into linked list
//        ListNode dummyRoot = new ListNode(0);
//        ListNode ptr = dummyRoot;
//        for(int item : nodeValues) {
//            ptr.next = new ListNode(item);
//            ptr = ptr.next;
//        }
//        return dummyRoot.next;
//    }
//
//    public static String booleanToString(boolean input) {
//        return input ? "True" : "False";
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String line;
//        while ((line = in.readLine()) != null) {
//            ListNode head = stringToListNode(line);
//            line = in.readLine();
//            int pos = Integer.parseInt(line);
//
//            boolean ret = new Solution().hasCycle(head, pos);
//
//            String out = booleanToString(ret);
//
//            System.out.print(out);
//        }
//    }
//}