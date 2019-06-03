package com.design.pattern.reschain;

public class ChainPatternDemo {
	
	   private static AbstractLog getChainOfLoggers(){

		   AbstractLog errorLogger = new ErrorLog(AbstractLog.ERROR);
		   AbstractLog consoleLogger = new ConsoleLog(AbstractLog.INFO);
		   AbstractLog fileLogger = new FileLog(AbstractLog.DEBUG);

	      errorLogger.setNextLog(consoleLogger);
	      consoleLogger.setNextLog(fileLogger);

	      return consoleLogger;	
	   }
	   

	   public static void main(String[] args) {
		   AbstractLog loggerChain = getChainOfLoggers();

	      loggerChain.logMessage(
	         "This is an information.",AbstractLog.DEBUG);

/*	      loggerChain.logMessage(
	         "This is an debug level information.",AbstractLog.DEBUG);

	      loggerChain.logMessage( 
	         "This is an error AbstractLog." , AbstractLog.ERROR);*/
	   }
	}