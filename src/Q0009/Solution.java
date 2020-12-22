package Q0009;

public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder(Integer.toString(x));
        if(stringBuilder.length() == 1) {
            return true;
        }
        String value = stringBuilder.toString();
        String valueReverse = stringBuilder.reverse().toString();
        if(value.equals(valueReverse)) {
            return true;
        }
        return false;
    }
}
