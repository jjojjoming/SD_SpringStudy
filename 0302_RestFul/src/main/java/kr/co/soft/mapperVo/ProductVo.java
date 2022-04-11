package kr.co.soft.mapperVo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductVo {
	
	private String id;
	private String name;
	private String maker;
	private int price;
	
	public ProductVo() {
		
	}
	
	public ProductVo(String id, String name, String maker, int price) {
		this.id=id;
		this.name=name;
		this.maker=maker;
		this.price=price;
		
	}

	@Override
	public String toString() {
		
		return "ProductVo[id=" +id +" name="+name + " maker="+maker+ " price="+price +"]";
	}
	
	
	
	
	
	

}
