package com.huang.IO.byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDeom3 {
    public static void main(String[] args) throws IOException {
        //定义一个和文件一样大的字节数组，但是容易爆掉内存，但是能解决字节乱码的问题
        FileInputStream fileInputStream = new FileInputStream("src/com/huang/IO/helloWorld.txt");//内部封装了new对象
        //定义一个字节数组
        File file = new File("src/com/huang/IO/helloWorld.txt");
        byte[] bytes = new byte[(int) file.length()];
        int len = fileInputStream.read(bytes);
        System.out.println(new String(bytes));

        //jdk9有个api可以直接读
//        fileInputStream.readAllBytes();
    }
}
