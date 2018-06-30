package com.chrisjansen.FileUploadApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@ServletComponentScan
@SpringBootApplication
public class FileUploadAppApplication  {

	public static void main(String[] args) {
		SpringApplication.run(FileUploadAppApplication.class, args);
	}
}
