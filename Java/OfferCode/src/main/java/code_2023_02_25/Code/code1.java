package code_2023_02_25.Code;

public class code1 {

    public static String replaceSpace(String s) {
        char[] ch = s.toCharArray();
        s.charAt(1);
        int size = 1;
        char[] result = new char[s.length()*3];
        for(int i =0;i<ch.length;i++) {
            if(ch[i] == ' '){
                result[size++] = '%';
                result[size++] = '2';
                result[size++] = '0';
                continue;
            }
            result[size++] = ch[i];
        }
        char[] ch2 = new char[size-1];
        System.arraycopy(result,0,ch2,0,size-1);
        return String.valueOf(ch2);
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("We%20are%20happy."));
    }
}

/*
class Solution {
    public static String replaceSpace(String s) {
        char[] ch = s.toCharArray();
        int size = 0;
        char[] result = new char[s.length()*3];
        for(int i =0;i<ch.length;i++) {
            if(ch[i] == ' '){
                result[size++] = '%';
                result[size++] = '2';
                result[size++] = '0';
                continue;
            }
            result[size++] = ch[i];
        }
        char[] ch2 = new char[size];
        System.arraycopy(result,0,ch2,0,size);
        return String.valueOf(ch2);
    }
}

*/

/*
class Solution {
    public String replaceSpace(String s) {
        StringBuilder br = new StringBuilder();
        int len = s.length();
        for(int i =0;i<len;i++) {
            if(s.charAt(i) == ' ') {
                br.append("%20");
            } else {
                br.append(s.charAt(i));
            }
        }
        return String.valueOf(br);
    }


}*/
