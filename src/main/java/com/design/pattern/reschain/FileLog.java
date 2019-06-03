package com.design.pattern.reschain;

public class FileLog extends AbstractLog {

	   public FileLog(int level){
	      this.level = level;
	   }

	   @Override
	   protected void write(String message) {		
	      System.out.println("File::Logger: " + message);
	   }
	}
