package code_LeetCode.code_2023_03_05.Test;

class Base {
    public Base(String s) {
        System.out.print("B");
    }
}

public class Derived extends Base {
    public Derived(String s) {
     super("C");
     System.out.print("D");
    }

    public static void main(String[] args) {
        new Derived("C");
    }
}