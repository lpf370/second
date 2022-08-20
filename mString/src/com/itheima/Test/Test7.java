package com.itheima.Test;

import com.itheima.domain.Student;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("请输入学生信息");
        String stuInfor=sc.nextLine();
        String []  sArr= stuInfor.split(",");
        System.out.println(sArr[0]);
        System.out.println(sArr[1]);

        Student stu =new Student(sArr[0],sArr[1]);

        System.out.println(stu.getName()+"......."+stu.getAge());
    }
}
