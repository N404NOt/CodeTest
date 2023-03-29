package code_LeetCode.code_2023_03_29.Blog;

public class Demo1 {


    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");
        String s3 = "he" + "llo";
        String s4 = new String("he") + "llo";
        String s5 = new String("he") + new String("llo");
        String s6 = new String(s2);
        String s7 = new String(s6).intern();

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s4 == s1);
        System.out.println(s4 == s2);
        System.out.println(s5 == s2);
        System.out.println(s6 == s2);
        System.out.println(s7 == s1);
    }
}
