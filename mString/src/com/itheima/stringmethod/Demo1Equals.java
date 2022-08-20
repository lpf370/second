package com.itheima.stringmethod;

public class Demo1Equals {
    public static void main(String[] args) {

        String s1="abc";
        String s2="ABC";
        String s3="abc";
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equals(s3));
    }
}
