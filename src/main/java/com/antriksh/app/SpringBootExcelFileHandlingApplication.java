package com.antriksh.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootExcelFileHandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExcelFileHandlingApplication.class, args);
		//new ExcelFileWriting().writingFile();
		new ReadExxcelFile().readFile();
		System.out.println("working fine");
	}

}
