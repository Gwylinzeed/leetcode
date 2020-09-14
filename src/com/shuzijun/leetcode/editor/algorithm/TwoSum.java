//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表 
// 👍 9092 👎 0


package com.shuzijun.leetcode.editor.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
        int[] nums = new int[]{3, 3};
        int target = 6;
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            //1.一边hash表  (当数组中存在两个相同数时，无法找到)
            Map<Integer, Integer> numMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (numMap.containsKey(complement) && numMap.get(complement) != i) {

                    return new int[]{numMap.get(target - nums[i]), i};
                }
                //put操作必须放在后面，否则数组出现两个x，target为2x时候会报错
                numMap.put(nums[i], i);

            }

            //2O(n2)
//            for (int i = 0; i < nums.length; i++) {
//                for (int j = i + 1; j < nums.length; j++) {
//                    if (nums[j] == target - nums[i]) {
//                        return new int[]{i, j};
//                    }
//                }
//            }

            throw new IllegalArgumentException("No two sum solution");
        }
//leetcode submit region end(Prohibit modification and deletion)

    }
}