package com.design.pattern.decorator;

import java.io.File;

public class SingleFileRead implements ReadFile{

	@Override
	public void read(File file) {
		
		System.out.println(file.getName());
	}

}
