package com.huang.IO.charstream;

import java.io.FileReader;

public class FileReaderDeom1 {
    public static void main(String[] args) {
        //目标：每次读取一个字符
        //创建一个字符输入流管道与源文件接通
        try {

            FileReader fileReader = new FileReader("src/com/huang/IO/helloWorld1.txt");
            //读取一个字符返回，没有可读字符返回-1
            int read ;
//            int read = fileReader.read();
//            System.out.println((char) read);
//            int read1 = fileReader.read();
//            System.out.println((char) read1);
//            int read2 = fileReader.read();
//            System.out.println((char) read2);
            //一次读入一个字符，读取速度较慢
            while ((read = fileReader.read()) != -1){

            System.out.print((char) read);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
