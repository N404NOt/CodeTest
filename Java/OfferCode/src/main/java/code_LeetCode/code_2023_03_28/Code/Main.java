package code_LeetCode.code_2023_03_28.Code;

import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext()){
      String str=sc.nextLine();
//      String []strArray=str.split("[^a-zA-Z]+");
      String[] strArray = str.split("[\\W]");
      System.out.println(strArray.length);
      for(int i=strArray.length-1;i>=2;i--){
        System.out.print(strArray[i]+' ');
      }
      if(strArray[0].length()==0)//如果字符串数组的第一个元素是空串，那么下标为1的元素就是最后一个要输出的元素，末尾不要再加空格
        System.out.println(strArray[1]);
      else
        System.out.println(strArray[1]+' '+strArray[0]);
    }
  }
}