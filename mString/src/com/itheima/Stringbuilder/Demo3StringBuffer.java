package com.itheima.Stringbuilder;

public class Demo3StringBuffer
{
    /*
      成员方法:
            public StringBuilder append(任意类型) : 添加数据，并返回对象本身
            public StringBuilder reverse() : 返回相反的字符序列
            public int length​() : 返回长度 (字符出现的个数)
            public String toString() : 通过toString()就可以实现把StringBuilder转换为String
   */
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
       // sb.append(123);
       // System.out.println(sb.append(123));
//        sb.append("abc");
//        sb.append(true);
//        System.out.println(sb);
//        sb.append("红色");
//        System.out.println(sb);
//        sb.append("蓝色");
//        System.out.println(sb);

//          StringBuffer  sb1=sb.append("红色");
//          StringBuffer sb2=sb1.append("蓝色");
//        System.out.println(sb==sb1);
//        System.out.println(sb1==sb2);
//        System.out.println(sb2==sb);
        System.out.println(sb.append("红色").append("蓝色"));
        System.out.println(sb.reverse());
        System.out.println(sb.length());
        String s=sb.toString();
        System.out.println(s);


    }
}
