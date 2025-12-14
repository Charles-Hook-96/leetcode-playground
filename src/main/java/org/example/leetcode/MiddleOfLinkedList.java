package org.example.leetcode;

import org.example.models.ListNode;

//876. Middle of the Linked List
/*
* Test Data:
* MiddleOfLinkedList.ListNode list = new MiddleOfLinkedList.ListNode(5, new MiddleOfLinkedList.ListNode(4, new MiddleOfLinkedList.ListNode(3, new MiddleOfLinkedList.ListNode(2, new MiddleOfLinkedList.ListNode(1)))));
* */
public class MiddleOfLinkedList {

    public static ListNode middleNode(ListNode head) {
        ListNode node1 = head;
        ListNode node2 = head;

        while (node2 != null && node2.next != null) {
            node1 = node1.next;
            node2 = node2.next.next;
        }

        return node1;

    }
}