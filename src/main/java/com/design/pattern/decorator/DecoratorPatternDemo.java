package com.design.pattern.decorator;

import java.io.File;



/**
 * @author Administrator
 * װ�������ģʽ �� ͨ����ԭ����Ĺ��ܽ��м�ǿ
 */
public class DecoratorPatternDemo {
	
	public static void main(String[] args) {
		ReadFile singleFileRead = new SingleFileRead();
		ReadFile batchFileRead = new BatchFileRead(singleFileRead);
		batchFileRead.read(new File(
				"D:\\eclipse-jee-indigo-SR2-win32-x86_64\\eclipse"));

	}

}
