/*

class Solution {
    public int strToInt(String str) {
        String Tstr = str.trim();
        int len = str.length();

        int i = 0;
        int num = 0;

        int sign = 0;
        if(Tstr.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if(Tstr.charAt(i) == '+') {
            sign = 1;
            i++;
        }

        while(Character.isDigit(Tstr.charAt(i)) && i < len) {
            num = num*10 + (Tstr.charAt(i) - '0');

            long result = num * sign;
            if(result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if(result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }
        return 1;
    }
}*/
