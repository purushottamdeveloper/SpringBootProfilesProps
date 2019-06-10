package com.app.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {
	
	@Value("${my.message}")
	private String msg;
	
	@Value("${my.mode}")
	private String mode;
	
	@Value("${my.code}")
	private String code;
	

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(this);
		
		

	}


	@Override
	public String toString() {
		return "AppRunner [msg=" + msg + ", mode=" + mode + ", code=" + code + "]";
	}
	

}
