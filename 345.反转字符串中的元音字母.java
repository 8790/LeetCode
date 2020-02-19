/*
 * @lc app=leetcode.cn id=345 lang=java
 *
 * [345] 反转字符串中的元音字母
 *
 * https://leetcode-cn.com/problems/reverse-vowels-of-a-string/description/
 *
 * algorithms
 * Easy (48.49%)
 * Likes:    76
 * Dislikes: 0
 * Total Accepted:    24.7K
 * Total Submissions: 50.3K
 * Testcase Example:  '"hello"'
 *
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 * 
 * 示例 1:
 * 
 * 输入: "hello"
 * 输出: "holle"
 * 
 * 
 * 示例 2:
 * 
 * 输入: "leetcode"
 * 输出: "leotcede"
 * 
 * 说明:
 * 元音字母不包含字母"y"。
 * 
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        if (s == null) { return null; };
        final HashSet<Character> set = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        );
        
        int frontIndex = 0;
        int afterIndex = s.length() - 1;
        char[] result = new char[s.length()];
        while(frontIndex <= afterIndex) {
            char frontValue = s.charAt(frontIndex);
            char afterValue = s.charAt(afterIndex);
            if(!set.contains(frontValue)) {
                result[frontIndex++] = frontValue;
            } else if (!set.contains(afterValue)) {
                result[afterIndex--] = afterValue;
            } else {
                result[frontIndex++] = afterValue;
                result[afterIndex--] = frontValue;
            }
        }

        return new String(result);
    }
}
// @lc code=end

