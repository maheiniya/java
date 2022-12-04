package com.oopsConcepts;

import java.util.Properties;

class config {
	static Properties props;
	static {
		System.out.println("loading the properties from configuration file");
		props = new Properties();
		
	}
	
}
class DatabaseDriver {       //one time activity that can be puch in to the static initiliazers
	static {
		
	}
}
public class InitializersEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
