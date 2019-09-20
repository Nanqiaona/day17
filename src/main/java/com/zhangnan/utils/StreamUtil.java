package com.zhangnan.utils;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 
 * @ClassName: StreamUtil 
 * @Description: TODO
 * @author:张楠
 * @date: 2019年9月20日 上午8:38:12
 */
public class StreamUtil {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream("D:\\pic\\aaa.txt");
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\\\pic\\\\aaa.txt");
		Byte[] b=new Byte[1024];
		int a=1024;
		while(fileInputStream.read()!=-1) {
			fileOutputStream.write(a);
		}
		
	}
}
