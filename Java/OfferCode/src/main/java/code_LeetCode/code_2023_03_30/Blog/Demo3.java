package code_LeetCode.code_2023_03_30.Blog;

public class Demo3 {
    public static void main(String[] args) {
        Integer it = 127;
        int i1 = it;
        int i2 = it.intValue();

        System.out.println(it == i1); // true
        System.out.println(it == i2); // true
        System.out.println(i1 == i2); // true
    }
}
