package com.huang.IO.byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileInputStreamDeom4 {
    public static void main(String[] args) throws IOException {
        //定义一个输出流，不用创建，但是名字一定要写对
        //写数据会将原来的数据清空，写新数据上去在，在下面的代码中添加ture
        FileOutputStream outputStream = new FileOutputStream("src/com/huang/IO/helloWorld1.txt",true);//内部封装了new对象
        //定义一个字节数组
        File file = new File("src/com/huang/IO/helloWorld.txt");
//        String c = "c"; //返回java.lang.NumberFormatException代表c不是一个数字，故不能解析
//        System.out.printf("输出为：%d",Integer.parseInt(c));
//        System.out.println(Integer.parseInt(c.trim()));
//        outputStream.write(Integer.parseInt("c"));
//        outputStream.write('a');
        //写数据必须刷新数据，不然容易写不进去
        byte[] buffer = {'a', 'b', 'c'};
        outputStream.write(buffer);
        //关闭流就是释放资源
        byte[] buffer2 = "我是中国人".getBytes(StandardCharsets.UTF_8);
        outputStream.write(buffer2);
        outputStream.flush();
        outputStream.close();

    }
}
