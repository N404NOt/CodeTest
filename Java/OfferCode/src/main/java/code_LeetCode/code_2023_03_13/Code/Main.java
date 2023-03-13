package code_LeetCode.code_2023_03_13.Code;

import java.util.*;
public class Main{
    public static final int arr[] = {31,28,31,30,31,30,31,31,30,31,30,31};
    //判断是否为闰年
    public static boolean isLeap(int n){
        return (((n % 4 == 0 && n % 100 != 0) || n % 400 == 0));
    }
    //给定M-Y-D，返回这一年一共过了多少天
    public static int nDays(int y,int m,int d){
        int n = d;
        for(int i = 0;i < m - 1;i++){
            n += arr[i];
        }
        if(m > 2 && isLeap(y)){
            n++;
        }
        return n;
    }
    //给定M-Y-D，找到从公元前1年12月31日开始过了过久。就出它%7得t同余数

    public static int diff(int y,int m,int d){
        return (y - 1)+(y - 1)/4 - (y - 1)/100 + (y -1)/400 + nDays(y,m,d);
    }
    //根据y-m-d,求出星期几
    public static int week(int y,int m,int d){
        int w = diff(y, m, d) % 7;
        if(w == 0){
            return 7;
        }
        return w;
    }
    //根据1号是星期几，求第n个星期e是几号
    public static int m1(int w,int n,int e){
        return 1 + (n - 1) * 7 + (7 - w + e) % 7;
    }
    //根据6月1号星期w,求5月的最后一个星期一
     public static int m2(int w){
         int d = (w == 1 ? 7 : w - 1);
        return 32 - d;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int y = sc.nextInt();
        /*
        1月1日：元旦
        * 1月的第三个星期一：马丁·路德·金纪念日
        * 2月的第三个星期一：总统节
        * 5月的最后一个星期一：阵亡将士纪念日
        * 7月4日：美国国庆
        * 9月的第一个星期一：劳动节
        * 11月的第四个星期四：感恩节
        * 12月25日：圣诞节
         */
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