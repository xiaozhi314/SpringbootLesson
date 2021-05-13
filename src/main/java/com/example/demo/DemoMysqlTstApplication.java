package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")//添加mapper扫描
public class DemoMysqlTstApplication {

	public static void main(String[] args) {   
		SpringApplication.run(DemoMysqlTstApplication.class, args);
	}

}
