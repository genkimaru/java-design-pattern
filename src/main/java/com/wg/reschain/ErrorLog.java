package com.wg.reschain;

public class ErrorLog extends AbstractLog {

	   public ErrorLog(int level){
	      this.level = level;
	   }

	   @Override
	   protected void write(String message) {		
	      System.out.println("Error Console::Logger: " + message);
	   }
	}