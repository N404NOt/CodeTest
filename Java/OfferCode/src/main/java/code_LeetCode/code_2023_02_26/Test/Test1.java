package code_LeetCode.code_2023_02_26.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Test1 {

    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('A',2);
        map.put('B',1);
        map.put('D',-2);

        map.put('C',9);
        System.out.println(map);

        Set set =  map.keySet();
        Object[] arr = set.toArray();
        Arrays.sort(arr);
        for(Object key : arr) {
            System.out.println(key);
        }

    }
}
