//package com.huang.leetcode.addTwoNumbers;/* -----------------------------------
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
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//
//class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  }
//
//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        if (l1 == null && l2 == null) {
//            return l1;
//        }
//        if (l2 == null) {
//            return l1;
//        }
//        if (l1 == null) {
//            return l2;
//        }
//        int count = 0;
//        ListNode listNode = l1;
//        ListNode listNode1 = listNode;
//        while (l1 != null && l2 != null) {
//            if (count > 0) {
//                listNode.val = l1.val + l2.val + 1;
//                if (listNode.val > 9) {
//                    listNode.val = listNode.val - 10;
//                }
//                count--;
//            } else {
//                listNode.val = l1.val + l2.val;
//                if (listNode.val > 9) {
//                    listNode.val = listNode.val - 10;
//                    count++;
//                }
//            }
//            l1 = l1.next;
//            l2 = l2.next;
//            listNode = listNode.next;
//        }
//        if (l1 == null) {
//            while (l2 != null) {
//                listNode = l2;
//                listNode.val = l2.val + count;
//                if (listNode.val > 9) {
//                    count++;
//                    listNode.val = listNode.val - 10;
//                    count--;
//                }
//                l2 = l2.next;
//                listNode = listNode.next;
//            }
//        }
//        if (l2 == null) {
//            while (l1 != null) {
//                listNode = l1;
//                listNode.val = l1.val + count;
//                if (listNode.val > 9) {
//                    count++;
//                    listNode.val = listNode.val - 10;
//                    count--;
//                }
//                l1 = l1.next;
//                listNode = listNode.next;
//            }
//        }
//        return listNode1;
//    }
////        这是前面做的，好像还没做起
////        int flag;
////        reverse3(l1);
////        while (l1.next != null){
////            l1 = l1.next;
////            System.out.println(l1.val);
////        }
////        reverse3(l2);
////
////        return null;
////    }
//
////    private void reverse3(ListNode head) {
////        if (head == null || head.next == null) {
////            return;
////        }
////        ListNode cur = null;
////        ListNode next = null;
////        // 当前从第二个开始 2
////        cur = head.next.next;
////        // 第一个节点变为尾
////        head.next.next = null;
////        while (cur != null) {
////            next = cur.next;
////            cur.next = head.next;
////            head.next = cur;
////            cur = next;
////        }
////    }
//
//public class MainClass {
//        public static int[] stringToIntegerArray(String input) {
//            input = input.trim();
//            input = input.substring(1, input.length() - 1);
//            if (input.length() == 0) {
//                return new int[0];
//            }
//
//            String[] parts = input.split(",");
//            int[] output = new int[parts.length];
//            for (int index = 0; index < parts.length; index++) {
//                String part = parts[index].trim();
//                output[index] = Integer.parseInt(part);
//            }
//            return output;
//        }
//
//        public static ListNode stringToListNode(String input) {
//            // Generate array from the input
//            int[] nodeValues = stringToIntegerArray(input);
//
//            // Now convert that list into linked list
//            ListNode dummyRoot = new ListNode(0);
//            ListNode ptr = dummyRoot;
//            for (int item : nodeValues) {
//                ptr.next = new ListNode(item);
//                ptr = ptr.next;
//            }
//            return dummyRoot.next;
//        }
//
//        public static String listNodeToString(ListNode node) {
//            if (node == null) {
//                return "[]";
//            }
//
//            String result = "";
//            while (node != null) {
//                result += Integer.toString(node.val) + ", ";
//                node = node.next;
//            }
//            return "[" + result.substring(0, result.length() - 2) + "]";
//        }
//
//        public static void main(String[] args) throws IOException {
//            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//            String line;
//            while ((line = in.readLine()) != null) {
//                ListNode l1 = stringToListNode(line);
//                line = in.readLine();
//                ListNode l2 = stringToListNode(line);
//
//                ListNode ret = new Solution().addTwoNumbers(l1, l2);
//
//                String out = listNodeToString(ret);
//
//                System.out.print(out);
//            }
//        }
//    }
//}
