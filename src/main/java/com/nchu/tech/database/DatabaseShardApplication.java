package com.nchu.tech.database;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.nchu.tech.database.mapper"})
public class DatabaseShardApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseShardApplication.class, args);
	}
}
