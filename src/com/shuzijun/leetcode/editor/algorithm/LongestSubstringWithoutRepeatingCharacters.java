//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
//
// 示例 1: 
//
// 输入: "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 输入: "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 输入: "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
// Related Topics 哈希表 双指针 字符串 Sliding Window 
// 👍 4309 👎 0


package com.shuzijun.leetcode.editor.algorithm;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
        String s = "asldfjlsfjldjfl";
        System.out.println(solution.lengthOfLongestSubstring(s));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            //1.0
//            Set<Character> set = new HashSet<>();
//            int rk = -1, ans = 0;
//            //计算每个位置的最长字符
//            for (int i = 0; i < s.length(); i++) {
//                if (i != 0) {
//                    //移除前一位字符
//                    set.remove(s.charAt(i - 1));
//                }
//                while ((rk + 1) < s.length() && !(set.contains(s.charAt(rk + 1)))) {
//                    set.add(s.charAt(rk + 1));
//                    ++rk;
//
//                }
//                //头节点为i时,不重复字符串的最长长度
//                ans = Math.max(ans,rk - i + 1);
//            }
//            return ans;
            //2.0
            int n = s.length(), ans = 0;
            Map<Character, Integer> map = new HashMap<>();
            for (int end = 0, start = 0; end < n; end++) {
                char alpha = s.charAt(end);
                if (map.containsKey(alpha)) {
                    start = Math.max(map.get(alpha), start);
                }
                ans = Math.max(ans, end - start + 1);
                map.put(s.charAt(end), end + 1);
            }
            return ans;
        }
//leetcode submit region end(Prohibit modification and deletion)

    }
}