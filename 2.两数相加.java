/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public class ListNode {
        int val;
        ListNode next;
    
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);

        boolean flag = false;
        int add = l1.val + l2.val;
        l1 = l1.next;
        l2 = l2.next;
        flag = (add / 10 == 1);
        result.val += add;
        result.next = new ListNode(0);


        return result;
    }
}
// @lc code=end

