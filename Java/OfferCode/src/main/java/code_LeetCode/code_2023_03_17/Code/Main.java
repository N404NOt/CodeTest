package code_LeetCode.code_2023_03_17.Code;

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String name = scan.nextLine();
            int pos = 0;
            Set<String> s = new HashSet<>();
            while(pos < name.length()){
                if(name.charAt(pos) == '\"'){
                    int end = name.indexOf('\"',pos+1); //从pos+1位置往后查找第一个"
                    String tmp = name.substring(pos+1,end); //截取[pos,end)之间的字符串
                    s.add(tmp);
                    pos = end + 2;  //到下一个名字的开头首字符
                }else{
                    int end = name.indexOf(',',pos+1);
                    //已经查到了最后一个名字，不是以，结尾
                    if(end == -1){
                        end = name.length()-1;
                        s.add(name.substring(pos,end+1));
                        break;
                    }
                    String tmp = name.substring(pos,end);
                    s.add(tmp);
                    pos = end + 1;
                }
            }
            name = scan.nextLine();
            if(s.contains(name) == true){
                System.out.println("Ignore");
            }else{
                System.out.println("Important!");
            }
        }
    }
}