package code_LeetCode.code_2023_03_02.Test;

public class Test {
 static int i = 0;

 public int aMethod(){
     i++;
     return i;
 }
public static void main(String args[]){
       Test test = new Test();
       test.aMethod();
       int j = test.aMethod();
       System.out.println(j);
 }
}
