package alog.BF;

public class BF {

    public static int BF(String str,String sub,int index) {
        int strLength = str.length();
        int subLength = sub.length();

        if(index < 0 || index > str.length()) {
            return -1;
        }

        int i = index;
        int j = 0;
        while (i < strLength && j < subLength) {
            if(str.charAt(i) == sub.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j >= sub.length()) {
            return i - j ;
        } else {
            return -1;
        }
    }


    public static void main(String[] args) {
        String str = "1234567";
        String sub = "56";
        int index = BF(str,sub,0);
        System.out.println(index);

    }
}
