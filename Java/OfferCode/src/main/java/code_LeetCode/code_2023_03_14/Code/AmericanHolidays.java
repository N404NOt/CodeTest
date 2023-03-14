package code_LeetCode.code_2023_03_14.Code;

import java.util.Scanner;

public class AmericanHolidays {

    public static final int arr[] = {31,28,31,30,31,30,31,31,30,31,30,31};


    public static int m1(int w,int n,int e) {
        return 1 + (n - 1) * 7 + (7 - w +e) % 7;
    }

    public static int m2(int w) {
        int d = (w == 1? 7 : w -1);
        return 32 -d;
    }

    public static int week(int y,int m,int n) {
        int w = allDay(y,m,n) % 7;
        if(w == 0) {
            w = 7;
        }
        return w;
    }

    public static int allDay(int y,int m,int n) {
        return (y - 1) + (y - 1)/4 - (y - 1)/100 + (y - 1)/400 + nDay(y,m,n);
    }

    public static int nDay(int y,int m,int n) {
        int day = n;
        for(int i = 0;i < m-1;i++) {
            day = day + arr[i];
        }
        if(m > 2 && isLeap(y)) {
            day++;
        }
        return day;
    }

    public static boolean isLeap(int y) {
        return ((y%4 ==0 && y%100 !=0) || y%400 == 0);
    }


    /*
    * 链接：https://www.nowcoder.com/questionTerminal/d95d98a2f96e49078cd7df84ba0c9d79
来源：牛客网

        * 1月1日：元旦
        * 1月的第三个星期一：马丁·路德·金纪念日
        * 2月的第三个星期一：总统节
        * 5月的最后一个星期一：阵亡将士纪念日
        * 7月4日：美国国庆
        * 9月的第一个星期一：劳动节
        * 11月的第四个星期四：感恩节
        * 12月25日：圣诞节
* */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y,m,d;

        while(sc.hasNext()) {
            y = sc.nextInt();
            System.out.printf("%d-01-01\n",y);
            int w;
            w = week(y,1,1);
            System.out.printf("%d-01-%02d\n",y,m1(w,3,1));

            w = week(y,2,1);
            System.out.printf("%d-02-%02d\n",y,m1(w,3,1));

            w = week(y,6,1);
            System.out.printf("%d-05-%02d\n",y,m2(w));

            System.out.printf("%d-07-04\n",y);

            w = week(y,9,1);
            System.out.printf("%d-09-%02d\n",y,m1(w,1,1));

            w = week(y,11,1);
            System.out.printf("%d-11-%02d\n",y,m1(w,4,4));

            System.out.printf("%d-12-25\n",y);

            System.out.println();
        }
    }
}
