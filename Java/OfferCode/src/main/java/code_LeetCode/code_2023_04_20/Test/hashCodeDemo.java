package code_LeetCode.code_2023_04_20.Test;

import java.util.HashSet;
import java.util.Set;

public class hashCodeDemo {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("小红");
        set.add("小红");

        set.add("小明");
        set.add("小明");

        set.add("老六");
        System.out.println("Set 集合长度为： " + set.size());

        for (String s : set) {
            System.out.println(s);
        }
    }
}
