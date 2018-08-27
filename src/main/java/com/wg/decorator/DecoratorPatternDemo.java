package com.wg.decorator;

import java.io.File;



/**
 * @author Administrator
 * 装饰者设计模式 ： 通过对原有类的功能进行加强
 */
public class DecoratorPatternDemo {
	
	public static void main(String[] args) {
		ReadFile singleFileRead = new SingleFileRead();
		ReadFile batchFileRead = new BatchFileRead(singleFileRead);
		batchFileRead.read(new File(
				"D:\\eclipse-jee-indigo-SR2-win32-x86_64\\eclipse"));

	}

}
