package com.wg.reschain;

public class ConsoleLog extends AbstractLog {

	   public ConsoleLog(int level){
	      this.level = level;
	   }

	   @Override
	   protected void write(String message) {		
	      System.out.println("Standard Console::Logger: " + message);
	   }
	}