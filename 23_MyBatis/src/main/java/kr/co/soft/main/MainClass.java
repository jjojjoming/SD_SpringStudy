package kr.co.soft.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.soft.beans.JdbcDTO;
import kr.co.soft.config.BeanConfigClass;
import kr.co.soft.mapper.MapperInterface;


public class MainClass {
	
	public static void main(String[] args) {
		
		  
	  AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(BeanConfigClass.class);
	  
	  MapperInterface mapper=ctx.getBean("test_mapper",MapperInterface.class );
	  
	  //insert
	  JdbcDTO bean=new JdbcDTO();
	  //bean.setInt_data(4);
	  //bean.setStr_data("JavaScript");
	  //mapper.insert_data(bean);
	  
	  //update
	 // bean.setInt_data(4);
	 // bean.setStr_data("jQuery");
	 // mapper.updata_data(bean);
	  
	  //delete
	  mapper.delete_data(3);
	  
	  //select
	  List<JdbcDTO> list = mapper.select_data();
		for(JdbcDTO bean1 : list) {
			System.out.printf("int_data : %d\n", bean1.getInt_data());
			System.out.printf("str_data : %s\n", bean1.getStr_data());
			System.out.println("--------------------------------------");
		}
	  
	  
	  
	  ctx.close();
	  
	}

}
