package kr.co.soft.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import kr.co.soft.database.MapperInterface;


//<annotation-driven/>와 같음
@Configuration
//controller어노테이션이 셋팅되어 있는 클래스 로드
@EnableWebMvc 
@ComponentScan("kr.co.soft.controller")
@PropertySource("/WEB-INF/properties/db.properties")
public class ServletAppContext implements WebMvcConfigurer{
	
	@Value("${db.classname}")
	private String db_classname;
	
	@Value("${db.url}")
	private String db_url;
	
	@Value("${db.username}")
	private String db_username;
	
	@Value("${db.password}")
	private String db_password;
	

	//jsp의 파일이름 앞 뒤 생략
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/", ".jsp");	
	}

	//정적 파일의 경로를 매핑
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**").addResourceLocations("/resource/");
	}

	
    @Bean
    public BasicDataSource dataSource() {
    	BasicDataSource source=new BasicDataSource();
    	source.setDriverClassName(db_classname);
    	source.setUrl(db_url);
    	source.setUsername(db_username);
    	source.setPassword(db_password);
    	
    	return source;
	}
    
    @Bean
    public SqlSessionFactory factory(BasicDataSource source) throws Exception {
    	SqlSessionFactoryBean factoryBean=new SqlSessionFactoryBean();
    	factoryBean.setDataSource(source);
    	SqlSessionFactory factory=factoryBean.getObject();
    	return factory;
	}
    
    @Bean
    public MapperFactoryBean<MapperInterface> test_mapper(SqlSessionFactory factory) throws Exception{
		
    	MapperFactoryBean<MapperInterface> factoryBean=new MapperFactoryBean<MapperInterface>(MapperInterface.class);
    	factoryBean.setSqlSessionFactory(factory);
    	return factoryBean;
    
    }
  
	
	
	
	

}
