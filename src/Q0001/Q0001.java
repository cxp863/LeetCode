package Q0001;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Q0001 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = new int[]{3, 2, 4, 0};
        int target = 6;

        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }



    private static class Solution {
        public int[] twoSum(int[] nums, int target) {
            Set<Integer> existedSet =
                    Arrays.stream(nums)
                            .boxed()
                            .collect(Collectors.toSet());

            for (int i = 0; i< nums.length; i++) {
                if (existedSet.contains(target - nums[i])) {
                    for (int j = i + 1; j < nums.length; j++) {
                        if (nums[j] == target - nums[i]) {
                            return new int[]{i, j};
                        }
                    }
                }
            }
            return null;
        }
    }
}


