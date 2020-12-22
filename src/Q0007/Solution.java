package Q0007;

public class Solution {
    public int reverse(int x) {
        boolean notNag = false;
        if (x == 0) {
            return 0;
        }

        if (x > 0) {
            x = -x;
            notNag = true;
        }

        String string = String.valueOf(x);
        char[] chars = string.substring(1).toCharArray();
        reverseChar(chars);
        String reverseString = new String(chars);
        if (reverseString.length() == 10) {
            if (reverseString.compareTo(String.valueOf(Integer.MIN_VALUE).substring(1)) > 0) {
                return 0;
            }
        }
        int ret = Integer.parseInt("-" + reverseString);
        if (notNag) {
            return -ret;
        } else {
            return ret;
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
