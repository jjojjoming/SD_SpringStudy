package kr.co.soft.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.soft.beans.JdbcDTO;
import kr.co.soft.config.BeanConfigClass;
import kr.co.soft.db.JdbcDAO;

public class MainClass {
	
	public static void main(String[] args) {
		
		  
	  AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(BeanConfigClass.class);
	  
	  JdbcDAO dao=ctx.getBean(JdbcDAO.class);
	  
	  //insert
	  JdbcDTO bean1=new JdbcDTO();
	  //bean1.setInt_data(1);
	  //bean1.setStr_data("JAVA");
	  
	  //bean1.setInt_data(2);
	  //bean1.setStr_data("HTML/CSS");
	  //dao.insert_data(bean1);
	  
	  System.out.println("저장완료");
	  
	  //update
	  //bean1.setInt_data(2);
	  //bean1.setStr_data("Spring");
	  //dao.update_data(bean1);
	  
	  //delete
	  dao.delete_data(2);
	  
	  //select
	  List<JdbcDTO> list=dao.select_data();
	  
	  for(JdbcDTO bean2:list) {
		  System.out.println("int_data : "+bean2.getInt_data());
		  System.out.println("str_data : "+bean2.getStr_data());
		  System.out.println("----------------------------");
	  }
	  
	  ctx.close();
	  
	}

}
