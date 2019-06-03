package com.design.pattern.decorator;

import java.io.File;

public class BatchFileRead implements ReadFile {

	
	private ReadFile singleFileReader ;

	public BatchFileRead(ReadFile singleFileReader) {
		super();
		this.singleFileReader = singleFileReader;
	}

	@Override
	public void read(File path) {
		if(path.isDirectory()){
			File[] listFiles = path.listFiles();
			for(File f : listFiles){
				
				read(f);
			}
			
		}else{
			singleFileReader.read(path);
			
		}

	}


}
