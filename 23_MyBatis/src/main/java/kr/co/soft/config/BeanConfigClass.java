package kr.co.soft.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.soft.mapper.MapperInterface;

@Configuration
@ComponentScan(basePackages = {"kr.co.soft.beans"})
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
	//SqlSessionFactory : jdbc를 처리하는 객체
	@Bean
	public SqlSessionFactory factory(BasicDataSource source) throws Exception{
		
		SqlSessionFactoryBean factoryBean= new SqlSessionFactoryBean();
		factoryBean.setDataSource(source); //jdbc를 처리하는 객체 생성하여 연결 완료
		SqlSessionFactory factory=factoryBean.getObject();
		
		return factory;
	}
	
	//===================================================================================
	
	//Mapper (test_mapper로 정의함)
	@Bean
	public MapperFactoryBean<MapperInterface> test_mapper(SqlSessionFactory factory)  throws Exception{
		//매핑 클래스 객체 생성
		MapperFactoryBean<MapperInterface> factoryBean=new MapperFactoryBean<MapperInterface>(MapperInterface.class);
		//접속정보와 sql쿼리문 매핑
		factoryBean.setSqlSessionFactory(factory);	
		return  factoryBean;
		
	}
	
	

}





