package com.huang.IO.byte_stream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDeom2 {
    public static void main(String[] args) throws IOException {
        //创建一个文件字节输入流管道和电脑文件接通
        FileInputStream fileInputStream = new FileInputStream("src/com/huang/IO/helloWorld.txt");//内部封装了new对象
        //定义一个字节数组，用于读取字节数组
//        byte[] bytes = new byte[3];
//
//        int len = fileInputStream.read(bytes);
//
//        System.out.println(len); //读取字节
//
//        String s = new String(bytes, 0, len);// 读多少，写多少
//        System.out.println(s);
//
//        int len1 = fileInputStream.read(bytes);
//
//        System.out.println(len1); //读取字节
//
//        String s1 = new String(bytes);
//        System.out.println(s1);

        //一直使用bytes来装字符流，如果最后只有两个字符，bytes容器中就会将上一次中的一个字符留下

        //读取完毕就会返回-1

        //使用循环改进
        //定义变量读取一个字节
        byte[] bytes1 = new byte[3];
        int lens;
        while ((lens = fileInputStream.read(bytes1)) != -1){
            System.out.print(new String(bytes1, 0, lens));//不能解决中文乱码的问题
        }

    }
}
