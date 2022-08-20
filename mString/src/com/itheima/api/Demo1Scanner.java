package com.itheima.api;
import java.util.Scanner;

public class Demo1Scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入");
        // 调用nextline 方法接收字符串12
        //ctrl +Alt+V
        String s1 = sc.nextLine();
        String s2 = sc.next();
        System.out.println(s1);
        System.out.println(s2);


    }
}
