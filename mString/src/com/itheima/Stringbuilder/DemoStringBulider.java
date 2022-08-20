package com.itheima.Stringbuilder;

public class DemoStringBulider {

    public static void main(String[] args) {

        //methon();     //   150

        //   3
        long star=System.currentTimeMillis();//  获取1970年1月1日0时0分0秒，到当前时间所经历的毫秒值

        StringBuffer sb =new StringBuffer();
        for (int i = 0; i < 5000; i++) {
            sb.append(i);
        }
        long end=System.currentTimeMillis();

        System.out.println("上述代码的执行时间为"+(end-star));

    }

    private static void methon() {
        long star=System.currentTimeMillis();//  获取1970年1月1日0时0分0秒，到当前时间所经历的毫秒值
        //System.out.println(star);
        String s="";
        for (int i = 1; i <=5000; i++) {
            s+=i;

        }

        System.out.println(s);

        long end=System.currentTimeMillis();

        System.out.println("上述代码的执行时间为"+(end-star));
    }
}
