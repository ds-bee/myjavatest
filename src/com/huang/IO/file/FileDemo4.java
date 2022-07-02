package com.huang.IO.file;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo4 {

    //学会创建file对象
    public static void main(String[] args) {
        //反斜杠是转义字符\ \ceshitupian这是路径
        //路径有很多写法D:\\测试图片\\OIP-C.jpg
        //           D:/测试图片/OIP-C.jpg(正斜杠)
        File file = new File("D:\\测试图片\\OIP-C.jpg");
        long length = file.length();
        System.out.println(length);
        //获取绝对路径
        System.out.println(file.getAbsolutePath());
        //获取相对路径
        System.out.println(file.getPath());
        //获取文件的名称，带后缀
        System.out.println(file.getName());
        //获取文件大小，字节个数
        System.out.println(file.length());
        System.out.println(file.lastModified());
        System.out.println("最后修改时间：" + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(file.lastModified()));

        //判断文件是文件夹还是文件
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        System.out.println("-------------");
        File file1 = new File("ceshi");
        //这个只能说多测一下
        long length1 = file1.length();
        System.out.println(length1);
        //获取绝对路径
        System.out.println(file1.getAbsolutePath());
        //获取相对路径
        System.out.println(file1.getPath());
        //获取文件的名称，带后缀
        System.out.println(file1.getName());
        //获取文件大小，字节个数
        System.out.println(file1.length());
        System.out.println(file1.lastModified());
        System.out.println("最后修改时间：" + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(file1.lastModified()));


    }

}
