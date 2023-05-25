package code_LeetCode.code_2023_05_06.Test;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<String, Integer> numbers = new Hashtable<String, Integer>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);

        Integer value = numbers.get("two");
        System.out.println("Value for key 'two': " + value);
    }
}
