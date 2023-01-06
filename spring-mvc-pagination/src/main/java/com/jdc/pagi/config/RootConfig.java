package com.jdc.pagi.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

@Configuration
@ComponentScan("com.jdc.pagi.root")
public class RootConfig {
	
	@Bean
	public DataSource dataSource() {
		var ds = new MysqlConnectionPoolDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/spring_pagination_db");
		ds.setUser("pgusr");
		ds.setPassword("pgpwd");
		
		return ds;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource ds) {
		return new JdbcTemplate(ds);
	}

}
