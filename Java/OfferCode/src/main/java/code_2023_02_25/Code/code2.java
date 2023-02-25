package code_2023_02_25.Code;

import java.util.Collection;
import java.util.Collections;

public class code2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        char[] ss = new char[]{'a','b','c'};
        char demo = '你';
        System.out.println(ss);
        int c =1;
        System.out.println(++c);

        String gre = "help";
        gre = gre.substring(0,2) +"p!!!!";
        System.out.println(gre);

    }
}
/*

class Solution {
    public String reverseLeftWords(String s, int n) {
        char[] ch = s.toCharArray();
        char[] ch1 = new char[s.length()*2];
        char[] ch2 = new char[s.length()];
        System.arraycopy(ch,0,ch1,0,s.length());
        System.arraycopy(ch,0,ch1,s.length(),ch1.length-ch.length);
        System.arraycopy(ch1,n,ch2,0,s.length());
        return String.valueOf(ch2);


    }
}
*/
