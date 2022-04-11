package kr.co.soft.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.co.soft.beans.JdbcDTO;

@Component
public class MapperClass implements RowMapper<JdbcDTO>{

	@Override
	public JdbcDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		JdbcDTO bean=new JdbcDTO();
		bean.setInt_data(rs.getInt("int_data"));
		bean.setStr_data(rs.getString("str_data"));
		
		return bean;
	}

}
