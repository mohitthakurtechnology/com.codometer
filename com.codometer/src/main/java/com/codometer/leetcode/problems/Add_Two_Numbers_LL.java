package com.codometer.leetcode.problems;


public class Add_Two_Numbers_LL {


   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

       ListNode start = new ListNode();
       ListNode node;
       int sumOfNodeValue = 0,carry = 0,l1Value = 0,l2Value = 0;
       node = start;
       while(l1.next != null || l2.next != null)
       {
             l1Value = (l1.next != null) ? l1.val : 0;
             l2Value = (l2.next != null) ? l2.val : 0;
             node.next = new ListNode(0,null);
             node = node.next;
             sumOfNodeValue = l1Value + l2Value + carry;
             node.val = sumOfNodeValue % 10;
             node.next = null;
             carry = sumOfNodeValue / 10;
       }
       return node;
   }
}
