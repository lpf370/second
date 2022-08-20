package com.itheima.stringmethod;

public class Demo2Substring {

    /*
        截取字符串:

            String substring(int beginIndex) :
                   从传入的索引位置处，向后截取，一直截取到末尾，得到新的字符串并返回

            String substring(int beginIndex, int endIndex) ：
                   从beginIndex索引位置开始截取，截取到endIndex索引位置，得到新字符串并返回（包含头，不包含尾）

     */
    public static void main(String[] args) {

        String s="itheima";
        s.substring(2);
        System.out.println(s);    // 输出 itheima
        System.out.println(s.substring(2));   //输出  heima

        System.out.println(s.substring(0,2));
    }
}
