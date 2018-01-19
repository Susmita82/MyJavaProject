package com.singleton;

public class Logger {
	
	private static Logger myInstance;
	
	private Logger(){
		
	}
	
	public static synchronized Logger getLogger(){
		
		if (myInstance == null){
			myInstance = new Logger();
		}
		return myInstance;
	}
	
	public void log(String s){
		System.err.println(s);
	}
}
