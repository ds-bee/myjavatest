package com.huang.IO.file;

import java.io.File;

public class FileDemo2 {

    //学会创建file对象
    public static void main(String[] args) {
        //反斜杠是转义字符\ \ceshitupian这是路径
        //路径有很多写法D:\\测试图片\\OIP-C.jpg
        //           D:/测试图片/OIP-C.jpg(正斜杠)
        File file = new File("D:\\测试图片\\OIP-C.jpg");
        long length = file.length();
        System.out.println(length);

        //File创建对象，支持绝对路径也支持相对路径
        new File("D:\\测试图片\\OIP-C.jpg");//绝对路径

        //相对路径 相对到工程下
        File file1 = new File("../myjavatest/src/com/huang/ceshi.txt");
        File file2 = new File("../myjavatest/src/ceshi");
        //加了myjavatest就是不能获得正确的目录,
        //加入../后，能获得正确的目录，这个是返回当前运行文件的上上级找文件
        //这里应该是新建工程的问题
//        File file1 = new File("myjavatest/src/com/huang/ceshi.txt");
        System.out.println(file1.length());
        System.out.println(file2.length());

        //File创建对象，可以是文件夹
        File file3 = new File("D:\\测试图片");
        System.out.println(file3.exists());

    }

}
