package org.example.leetcode;

import org.example.models.ListNode;

import java.util.LinkedList;

//TEST DATA:  head = new ListNode(1, new ListNode(1, new ListNode(2, null)));
public class RemoveDuplicatesFromSortedList {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

}