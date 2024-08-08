package com.example.bookTest.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class CoffeeConfig {

	@Bean
	public DataSource cdataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUsername("chanmi");
		ds.setPassword("123456");
		ds.setUrl("jdbc:mysql://localhost:3306/chanmi");
		return ds;
	}
	
}
