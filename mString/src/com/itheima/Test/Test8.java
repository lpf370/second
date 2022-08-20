package com.itheima.Test;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入对称字符串");
        String s=sc.nextLine();
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        //  s ： string
        //  sb  st123
        //  ringBuffer;
        String str=sb.toString();
        if(s.equals(str))
        {
            System.out.println("是对称字符串");
        }
        else
        {
            System.out.println("不是对称字符串");
        }

    }
}
