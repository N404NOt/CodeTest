package code_LeetCode.code_2023_04_20.Test;

public class Demo2 {
    public static void main(String[] args) {
        Integer i = new Integer(127); // 装箱
        Integer i1 = Integer.valueOf(127); // 装箱
        Integer i2 = 127; // 装箱
 
        System.out.println("i: " +i.hashCode()); // 127
        System.out.println("i1: " +i1.hashCode()); //127
        System.out.println("i3: " + i2.hashCode()); //127
        System.out.println(i1 == i); // false
        System.out.println(i == i2); // false
        System.out.println(i2 == i1); //true
    }
}