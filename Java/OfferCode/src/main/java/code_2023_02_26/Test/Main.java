package code_2023_02_26.Test;

import java.util.*;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character,Integer> map = new HashMap();
        String s = scanner.next();
        int max = 0;
        for(int i = 0; i < s.length();i++) {
            if(map.get(s.charAt(i)) == null) {
                map.put(s.charAt(i),1);
            } else {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            if(map.get(s.charAt(i)) > max) {
                max = map.get(s.charAt(i));
            }
        }

        Set<Character> set = set = new TreeSet<>();
        for(Map.Entry<Character,Integer> entry : map.entrySet()) {
            if(entry.getValue() == max) {
                set.add(entry.getKey());
            }
        }
        for(Character c : set) {
            System.out.print(c);
        }
    }
}
/*
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);//输入的前提条件
        String st=in.nextLine();//输入字符串
        long[] a=new long [26];//对应26个字母
        for(int i=0;i<st.length();i++) {//暴力
        	a[st.charAt(i)-'A']++;
        }
        long max=0;
        for(int i=0;i<26;i++) {//找出出现次数最大的数值
        	max=Math.max(max, a[i]);
        }
        for(int i=0;i<26;i++) {//只要是次数最大的数值，就输出。可能有多个
        	if(a[i]==max) {
        		System.out.print( (char) ('A'+i));//用char来转换
        	}
        }
    }
 
}
*/
