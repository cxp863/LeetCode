package Q0017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private static List<List<String>> list = new ArrayList<>();

    static {
        List<String> two = new ArrayList<>();
        two.add("a"); two.add("b"); two.add("c");

        List<String> three = new ArrayList<>();
        three.add("d"); three.add("e"); three.add("f");

        List<String> four = new ArrayList<>();
        four.add("g"); four.add("h"); four.add("i");

        List<String> five = new ArrayList<>();
        five.add("j"); five.add("k"); five.add("l");

        List<String> six = new ArrayList<>();
        six.add("m"); six.add("n"); six.add("o");

        List<String> seven = new ArrayList<>();
        seven.add("p"); seven.add("q"); seven.add("r"); seven.add("s");

        List<String> eight = new ArrayList<>();
        eight.add("t"); eight.add("u"); eight.add("v");

        List<String> nine = new ArrayList<>();
        nine.add("w"); nine.add("x"); nine.add("y"); nine.add("z");

        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.add(two);
        list.add(three);
        list.add(four);
        list.add(five);
        list.add(six);
        list.add(seven);
        list.add(eight);
        list.add(nine);
    }
/*
    public List<String> letterCombinations(String digits) {

    }

    public List<String> letterCombinations(String leftDigits, List<String> strings) {
        String single = leftDigits.substring(0,1);
        String left = leftDigits.substring(1);

        List<String> value = letterCombinations(left, null);



        if(left.length() == 0) {
            return strings;
        }

        return null;
    }
    */

}
