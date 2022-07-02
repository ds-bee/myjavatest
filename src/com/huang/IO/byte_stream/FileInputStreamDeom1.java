package com.huang.IO.byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDeom1 {
    public static void main(String[] args) throws IOException {
        //创建一个文件字节输入流和管道文件接通
        FileInputStream fileInputStream = new FileInputStream("src/com/huang/IO/helloWorld.txt");//内部封装了new对象
        //读取一个字节返回 read api 读取较慢
        int read = fileInputStream.read();
        System.out.println(read);
        int read1 = fileInputStream.read();
        System.out.println(read1);
        int read2 = fileInputStream.read();
        System.out.println(read2);
        //读取完毕最后返回-1
        //使用循环改进
        //定义变量读取一个字节
        int b;
        while ((b = fileInputStream.read()) != -1){
            System.out.print((char) b);//不能读出爱，中文是三个字节表示的
        }

    }
}
