package com.itheima.Test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s=sc.nextLine();
        //System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            char c= s.charAt(i);

            System.out.println(c);
        }



    }
}
