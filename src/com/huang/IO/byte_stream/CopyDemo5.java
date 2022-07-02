package com.huang.IO.byte_stream;

import java.io.*;

public class CopyDemo5 {

    public static void main(String[] args) throws IOException {
        //学会字节流完成文件的复制
        //创建一个字节输入流管道与视频建立连接
        InputStream is = new FileInputStream("file-io-app/src/out04.txt");
        //创建一个输出管道和目标文件建立连接
        OutputStream os = new FileOutputStream("file-io-app/src/out05.txt");
        //定义一个字节数组转移数据
        byte[] buffer = new byte[1024];
        int len; // 记录每次读取的字节数。
        while ((len = is.read(buffer)) != -1){
            os.write(buffer, 0 , len);
        }
        System.out.println("复制完成了！");
        //关闭流
        os.close();
        is.close();

    }

}
