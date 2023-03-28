package code_LeetCode.code_2023_03_28.Code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String boxA = in.next();
            String boxB = in.next();

            Map<Character,Integer> mapA = new HashMap<>();
            for(int i = 0;i < boxA.length();i++){
                char a = boxA.charAt(i);
                if(mapA.containsKey(a)){
                    mapA.replace(a,mapA.get(a) + 1);
                }else {
                    mapA.put(a,1);
                }
            }

            Map<Character,Integer> mapB = new HashMap<>();
            for(int i = 0;i < boxB.length();i++){
                char a = boxB.charAt(i);
                if(mapB.containsKey(a)){
                    mapB.replace(a,mapB.get(a) + 1);
                }else {
                    mapB.put(a,1);
                }
            }

            boolean flag = true;
            for(int i = 0;i < boxB.length();i++){
                char a = boxB.charAt(i);
                if(!(mapA.containsKey(a) && mapA.get(a) >= mapB.get(a))){
                    flag = false;
                }
            }
            System.out.println(flag == true ? "Yes" : "No");
        }
    }
}