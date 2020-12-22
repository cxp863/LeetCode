package Q0012;

public class Solution {
    private static String[] qian = new String[] {"", "M", "MM", "MMM"};
    private static String[] bai = new String[] {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static String[] shi = new String[] {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static String[] ge = new String[] {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

    public String intToRoman(int num) {
        int q = num / 1000;
        int b = (num % 1000) / 100;
        int s = (num % 100) / 10;
        int g = num % 10;

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(qian[q]);
        stringBuilder.append(bai[b]);
        stringBuilder.append(shi[s]);
        stringBuilder.append(ge[g]);

        return stringBuilder.toString();
    }
}
