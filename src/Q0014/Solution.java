package Q0014;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int miniLen = Integer.MAX_VALUE;


        if(strs.length == 0) {
            return "";
        }
        if(strs.length == 1) {
            return strs[0];
        }

        for(String str : strs) {
            miniLen = Math.min(miniLen, str.length());
        }

        StringBuilder value = new StringBuilder();
        for(int i = 0; i < miniLen; i++) {
            boolean flag = true;
            char c = strs[0].charAt(i);
            for(int j = 1; j< strs.length; j++) {
                if(c != strs[j].charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                value.append(strs[0].charAt(i));
            } else {
                break;
            }
        }

        return value.toString();
    }
}