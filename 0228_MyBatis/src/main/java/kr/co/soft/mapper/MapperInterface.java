package kr.co.soft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.co.soft.beans.JdbcDTO;

public interface MapperInterface {
	
	
	 //================Mapper================================
	
	  @Results({
		  @Result(column = "int_data", property = "int_data"),
		  @Result(column = "str_data", property = "str_data")
	  })
	  
	  //======================DAO===============================
	  //insert
	  @Insert("insert into jdbc_table(int_data, str_data) values(#{int_data}, #{str_data})")
	  void insert_data(JdbcDTO bean);
	  
	  //select
	  @Select("select int_data, str_data from jdbc_table")
	  List<JdbcDTO> select_data();
	  
	  
	  //update
	  @Update("update jdbc_table set str_data= #{str_data} where int_data= #{int_data}")
	  void updata_data(JdbcDTO bean);
	  
	  //delete
	  @Delete("delete from jdbc_table where int_data=#{num}") 
	  void delete_data(int int_data);

}
