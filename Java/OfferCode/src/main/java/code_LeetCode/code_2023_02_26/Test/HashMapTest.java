package code_LeetCode.code_2023_02_26.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(234242, "bbb");

        map1.put(123, "aaa");

        System.out.println("map1的循环遍历");
        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            System.out.println(entry.getKey());
        }

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(123, "aaa");
        map2.put(234242, "bbb");

        System.out.println("map2的循环遍历");
        for (Map.Entry<Integer, String> entry : map2.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
