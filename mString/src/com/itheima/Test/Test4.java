package com.itheima.Test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("请输入");
        String s = sc.nextLine();
        int smallcount=0;
        int bigcount=0;
        int numcount=0;
        char [] chas=s.toCharArray();
        for (int i = 0; i < chas.length; i++) {

             char c=chas[i];
             if(c>='A'&&c<='Z')
                bigcount++;
             if(c>='a'&&c<='z')
                smallcount++;
             if(c>='0'&&c<='9')
                numcount++;

        }
        System.out.println("大写字母字符个数为"+bigcount);
        System.out.println("小写字母字符个数为"+smallcount);
        System.out.println("数字字符个数为"+numcount);
    }
}
