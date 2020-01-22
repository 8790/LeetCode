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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        int carry = 0;
        while(l1 != null || l2 != null || carry == 1) {
            int add = 0;
            if(l1 == null && l2 != null) {
                add = l2.val + carry;
                l2 = l2.next;
            } else if (l2 == null && l1 != null) {
                add = l1.val + carry;
                l1 = l1.next;
            } else if (l1 == null && l2 == null) {
                add = carry;
            } else {
                add = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            }
            // 进位判断
            if (add > 9) {
                carry = 1;
                add = add % 10;
            } else {
                carry = 0;
            }
            //新建结点，计算高位
            p.next = new ListNode(add);
            p = p.next;          
        }
        
        return head.next;
    }
}
// @lc code=end

