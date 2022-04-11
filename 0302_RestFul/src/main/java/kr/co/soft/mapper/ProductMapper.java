package kr.co.soft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.co.soft.mapperVo.ProductVo;

public interface ProductMapper {
	
	@Insert("insert into RestFulDB(id,name,maker,price) values(#{id},#{name},#{maker},#{price})")
	void registerProduct(ProductVo productvo);
	
	@Select("select id, name, maker,price from RestFulDB")
	List<ProductVo> getAllProductList();
	
	@Select("select id, name, maker,price from RestFulDB where id=#{value} ")
	ProductVo findProductById(String value);
	
	@Update("update RestFulDB set name=#{name},maker=#{maker},price=#{price} where id=#{id}")
	int updateProduct(ProductVo productvo);
	
	@Delete("delete from RestFulDB where id=#{value}")
	void deleteProduct(String value);
	
	
	

}
