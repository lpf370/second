package com.itheima.Test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s=sc.nextLine();
       char [] chars =s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        System.out.println("123");
    }
}
