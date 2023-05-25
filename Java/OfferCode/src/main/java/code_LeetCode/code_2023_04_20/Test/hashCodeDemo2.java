package code_LeetCode.code_2023_04_20.Test;

public class hashCodeDemo2 {
    public static void main(String[] args) {
        Object obj = new Object();
        int hashCode = obj.hashCode();
        System.out.println(hashCode);

        String s = "asdasdasd";
        System.out.println(s.hashCode());
    }
}
