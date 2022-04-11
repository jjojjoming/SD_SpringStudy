package kr.co.soft.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages = {"kr.co.soft.beans","kr.co.soft.db"})
public class BeanConfigClass {
	
	//DataSource
	@Bean
	public BasicDataSource source() {
		BasicDataSource source=new BasicDataSource();
		source.setDriverClassName("oracle.jdbc.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		source.setUsername("system");
		source.setPassword("12341234");
		return source;
	}
	
	//DataSource를 가지고 데이터베이스에 접속하여 전달
	@Bean
	public JdbcTemplate db(BasicDataSource source) {	
		JdbcTemplate db=new JdbcTemplate(source);
		return db;
	}
	

}
