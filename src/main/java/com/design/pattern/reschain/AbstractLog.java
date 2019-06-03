package com.design.pattern.reschain;

public abstract class AbstractLog {
	
	   public static int DEBUG = 1;
	   public static int INFO = 2;
	   public static int ERROR = 3;
	
	protected int level;
	
	abstract void write(String msg);
	
	AbstractLog nextLog;
	
	public void setNextLog(AbstractLog log){
		this.nextLog = log;
	}
	
	public void logMessage(String msg , int level)
	{
		if (level <= this.level) {
			write(msg);
		} 
		if(nextLog != null){
			nextLog.logMessage(msg, level);
		}
		
	}
	

	
}
