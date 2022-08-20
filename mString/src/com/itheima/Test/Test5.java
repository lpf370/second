package com.itheima.Test;

import java.util.Scanner;

public class Test5 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入手机号");
        String telString = sc.nextLine();
        System.out.println(telString.substring(0,3)+"****"+telString.substring(7));
    }
}
