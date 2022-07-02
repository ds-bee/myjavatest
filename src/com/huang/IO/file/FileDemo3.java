package com.huang.IO.file;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {

    //学会创建file对象
    public static void main(String[] args) throws IOException {
        //反斜杠是转义字符\ \ceshitupian这是路径
        //路径有很多写法D:\\测试图片\\OIP-C.jpg
        //           D:/测试图片/OIP-C.jpg(正斜杠)
        File file = new File("src/data.txt");
        //创建文件，成功返回true
        System.out.println(file.createNewFile());
        File file1 = new File("src/data1.txt");
        //创建文件，成功返回true
        System.out.println(file1.createNewFile());

        //这个只能创建一级目录
        File file2 = new File("D:/测试图片/aa");
        System.out.println(file2.mkdir());

        //mkdirs创建多级目录
        File file3 = new File("D:/测试图片/aaa/ddd/ccc");
//        File file3 = new File("D:/测试图片/aaa/ddd/ccc");
        System.out.println(file3.mkdirs());

        //删除文件或者空文件夹,即使被占用也能删除，应该就是打开了
        System.out.println(file.delete());
        File file4 = new File("D:\\测试图片\\OIP-C.jpg");
        System.out.println(file4.delete());

        //只能删除空文件夹，不能删除非空文件夹
        File file5 = new File("D:/测试图片/aaa");
        System.out.println(file5.delete());
        System.out.println(file3.delete());//只能删除一个文件
        System.out.println(file2.delete());


    }

}
