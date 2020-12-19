package Q0007;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Q0007 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int nums = 1534236469;

        System.out.println(solution.reverse(nums));
    }



    private static class Solution {
        public int reverse(int x) {
            boolean flag = false;
            if(x < 0) {
                x = -x;
                flag = true;
            }

            char[] chars = String.valueOf(x).toCharArray();
            reverseChar(chars);
            String reverseString = new String(chars);
            if(reverseString.length() == 10) {
                if(reverseString.compareTo(String.valueOf(Integer.MAX_VALUE)) > 0) {

                }
            }

            StringBuilder stringBuilder = new StringBuilder(String.valueOf(x));

            try {
                int ret = Integer.parseInt(stringBuilder.reverse().toString());
                if (flag) {
                    return -ret;
                } else {
                    return ret;
                }
            } catch (Exception e) {
                return 0;
            }
        }

        private void reverseChar(char[] chars) {
            for (int i = 0; i < chars.length / 2; i++) {
                char temp = chars[i];
                chars[i] = chars[chars.length - 1 - i];
                chars[chars.length - 1 - i] = temp;
            }
        }

    }
}


