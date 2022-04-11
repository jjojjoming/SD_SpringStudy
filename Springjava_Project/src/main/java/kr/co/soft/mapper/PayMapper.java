package kr.co.soft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import kr.co.soft.beans.PayBean;

public interface PayMapper {
	
	@Insert("insert into pay_table (pay_id,pay_date,pay_method,pay_company,pay_number,pay_amount,pay_sum) values(#{pay_id},#{pay_date},#{pay_method},#{pay_company},#{pay_number},#{pay_amount},#{pay_sum})")
	void insert_into(PayBean databean);
	
	@Select("select * from pay_table")
	List<PayBean> select_data();
	
	//내역 모두 불러오기 
	@Select("select * from pay_table order by pay_date desc")
	List<PayBean> getPayAll();
	
	//상세 내역 불러오기 (조건은 아이디)
	@Select("select * from pay_table where pay_id=#{pay_id} order by pay_date desc")
	List<PayBean> getCardList(String id);

}
