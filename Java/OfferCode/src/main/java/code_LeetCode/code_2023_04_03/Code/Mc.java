package code_LeetCode.code_2023_04_03.Code;

import java.util.Scanner;
import java.util.TreeMap;
 
public class Mc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        TreeMap<Character, Integer> map=new TreeMap<>();
        long len=s.length();
        char[] ch=s.toCharArray();
        int max=1;
        for (int i = 0; i < len; i++) {
            if (map.containsKey(ch[i])) {
                int v=map.get(ch[i])+1;
                map.put(ch[i], v);
                if (v>max) {
                    max=v;
               }
            }
            else map.put(ch[i], 1);
        }
        for (char c : map.keySet()) {
            if (max==map.get(c)) {
                System.out.print(c);
            }
        }
    }
}