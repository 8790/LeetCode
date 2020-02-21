/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
 *
 * https://leetcode-cn.com/problems/reverse-linked-list/description/
 *
 * algorithms
 * Easy (66.17%)
 * Likes:    771
 * Dislikes: 0
 * Total Accepted:    160.4K
 * Total Submissions: 238.9K
 * Testcase Example:  '[1,2,3,4,5]'
 *
 * 反转一个单链表。
 * 
 * 示例:
 * 
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * 
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
    public ListNode reverseList(ListNode head) {
        //迭代解法
        ListNode newHead = new ListNode(-1);    // 仅仅是个假结点，后面那个结点才是要构造的新链表的头结点
        while (head != null) {
            ListNode next = head.next;  // 记录原来的head指针的下一个指针为next
            head.next = newHead.next;   // 把最前面结点之后的结点变成构造的新链表
            newHead.next = head;        // 把最前面结点放在第一个，在随后的循环中会不停往后挤实现逆转
            head = next;                // 通过next指针让head 指针向后移动一位
        }
        return newHead.next;
    }
}
// @lc code=end

