package Q0201;

public class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int value = m;
        int watch = 0;
        for(int i = n; i >= m; i-=test(value)) {
            value = value & i;
        }
        System.out.println(watch);
        return value;
    }

    public int test(int value) {
        int i;
        for(i = 0; i < 31; i++) {
            int temp = (int)Math.pow(2, i+1);
            temp = temp - 1;

            if((value & temp) != 0) {
                break;
            }
        }
        return (int)Math.pow(2, i);
    }
}
