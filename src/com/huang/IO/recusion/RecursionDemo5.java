package com.huang.IO.recusion;

import java.io.File;

public class RecursionDemo5 {

    public static void main(String[] args) {
        searchFile(new File("D:/"), "SpaceSniffer.exe");

    }
    public static void searchFile(File dir , String fileNname){
        //3. 判断dir是否是目录
        if(dir != null && dir.isDirectory()){
            File[] files = dir.listFiles();
            //判断是否是一级文件对象，存在才能遍历
            if (files != null && files.length >0){
                for (File file : files) {
                    if(file.isFile()){
                        if(file.getName().contains(fileNname)){
                            System.out.println("找到了" + file.getAbsolutePath());
                        }
                    }else {
                        //是文件夹，需要递归寻找
                        searchFile(file,fileNname);//这里else放错位置了，放到19行的if条件中了，就会输出两次，而且找不到
                }
            }
            }
        }else {
            System.out.println("没有找到");
        }
    }
}
