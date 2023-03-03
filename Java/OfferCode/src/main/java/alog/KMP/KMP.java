package alog.KMP;

public class KMP {

    public static int KMP(String str, String sub, int pos) {

        int strLength = str.length();
        int subLength = sub.length();

        if (subLength > strLength - pos) return -1;
        int[] next = new int[subLength];

        getNext(sub, next);

        int i = pos;
        int j = 0;

        while (i < strLength && j < subLength) {
            //这里就是母串不会往回返只会勇往直前或者稍微停留
            //j==-1是子串第一个字符都与母串无法匹配所以母串向后走，子串走到0的位置
            if (j == -1 || str.charAt(i) == sub.charAt(j)) {
                i++;
                j++;
                //这块代码等看了第五部分再看
                //这里的子串回到对应的重复位置上减少重复匹配次数
            } else {
                j = next[j];

            }
        }
        if (subLength == j) {
            return i - j;
        }
        return -1;
    }

    public static void getNext(String sub, int[] next) {
        next[0] = -1;
        next[1] = 0;
        int k = 0;
        int i = 2;
        int subLength = sub.length();
        while (i < subLength) {
            if (k == -1 || sub.charAt(i - 1) == sub.charAt(k)) {
                next[i] = k + 1;
                i++;
                k++;
            } else {
                k = next[k];
            }
        }
    }


    public static void main(String[] args) {
        String str = "1234567";
        String sub = "56";
        int index = KMP(str, sub, 0);
        System.out.println(index);
    }
}
