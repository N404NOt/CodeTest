package code_LeetCode.code_2023_03_28.Blog.Test;

public class Demo1 {
    public static void main(String[] args) {
        String s1 = "asdasd";
        String s2 = new String("asdasd");
        String s3 = new String();
        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        StringBuilder stb = new StringBuilder();
        stb.append("");
        System.out.println(stb);
    }
}
