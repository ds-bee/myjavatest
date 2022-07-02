package com.huang.IO.charstream;

import java.io.FileReader;

public class FileReaderDeom2 {
    public static void main(String[] args) {
        //目标：每次读取一个字符
        //创建一个字符输入流管道与源文件接通
        try {

            FileReader fileReader = new FileReader("src/com/huang/IO/helloWorld1.txt");
            //读取一个字符返回，没有可读字符返回-1
            char[] read  = new char[1024]; // 1k
            int len;
            while ((len = fileReader.read(read)) != -1){
                String s = new String(read,0,len);
                System.out.print(s);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
