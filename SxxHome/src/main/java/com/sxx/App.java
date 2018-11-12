package com.sxx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.sxx.mapper")//启动扫描mapper包和xml文件
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
