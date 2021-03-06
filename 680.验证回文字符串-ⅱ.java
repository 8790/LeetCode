/*
 * @lc app=leetcode.cn id=680 lang=java
 *
 * [680] 验证回文字符串 Ⅱ
 *
 * https://leetcode-cn.com/problems/valid-palindrome-ii/description/
 *
 * algorithms
 * Easy (34.27%)
 * Likes:    120
 * Dislikes: 0
 * Total Accepted:    13.2K
 * Total Submissions: 37.3K
 * Testcase Example:  '"aba"'
 *
 * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 * 
 * 示例 1:
 * 
 * 
 * 输入: "aba"
 * 输出: True
 * 
 * 
 * 示例 2:
 * 
 * 
 * 输入: "abca"
 * 输出: True
 * 解释: 你可以删除c字符。
 * 
 * 
 * 注意:
 * 
 * 
 * 字符串只包含从 a-z 的小写字母。字符串的最大长度是50000。
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean validPalindrome(String s) {
        if(s == null) { return false; }
        
        for( int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if(s.charAt(i) != s.charAt(j)) {
                return isValid(s, i + 1, j) || isValid(s, i, j - 1);
            }
        }
        return true;
    }

    private boolean isValid(String s, int i, int j) {
        while(i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

