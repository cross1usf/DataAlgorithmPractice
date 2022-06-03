package com.company.linkedlist;

public class MiddleOfList {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode middleNode(ListNode head) {
        ListNode a = head;
        ListNode b = head;

      while (b != null && b.next != null) {
        a = a.next;
        b = b.next.next;
      }
      return a;
    }

}
