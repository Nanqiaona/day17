package com.zhangnan.utils;

import java.io.File;
/**
 * 
 * @ClassName: FileUtil 
 * @Description: TODO
 * @author:张楠
 * @date: 2019年9月20日 上午8:38:08
 */
public class FileUtil {
	public static void main(String[] args) {
		File file = new File("D:\\pic\\");
		System.out.println(file);
		File[] listFiles = file.listFiles();
		System.out.println(listFiles);
		for (File file2 : listFiles) {
			String name = file2.getName();
			System.out.println(name);
			String string = name.substring(name.lastIndexOf("."));
			System.out.println(string);
		}
	}
}
