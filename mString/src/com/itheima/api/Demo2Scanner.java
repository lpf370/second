package com.itheima.api;


import java.util.Scanner;

public class Demo2Scanner {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入整数");
        int i = sc.nextInt();  //  10 回车换行
        System.out.println("请输入字符串");
        String s = sc.next();

        System.out.println(i);
        System.out.println(s);

    }
}
