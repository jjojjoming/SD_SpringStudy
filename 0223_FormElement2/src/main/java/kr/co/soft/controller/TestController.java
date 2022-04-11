package kr.co.soft.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.soft.beans.DataBean;
import kr.co.soft.beans.KeyValueBean;

@Controller
public class TestController {

	@GetMapping("/test1")
	public String test1(DataBean bean, Model model) {

		bean.setA1("data1");
		bean.setA2("data2");

		// ======================String 배열====================
		String[] data_list1 = { "data1", "data2", "data3" };
		model.addAttribute("data_list1", data_list1);

		// ArrayList배열--------------------------------
		ArrayList<String> data_list2 = new ArrayList<String>();

		data_list2.add("data1");
		data_list2.add("data2");
		data_list2.add("data3");
		model.addAttribute("data_list2", data_list2);

		// -----------------ㅡMap배열-----------------------------------
		KeyValueBean key_bean1 = new KeyValueBean();
		KeyValueBean key_bean2 = new KeyValueBean();
		KeyValueBean key_bean3 = new KeyValueBean();

		key_bean1.setKey("항목1");
		key_bean1.setValue("data1");
		// --------------------------------
		key_bean1.setKey("항목2");
		key_bean1.setValue("data2");
		// --------------------------------
		key_bean1.setKey("항목3");
		key_bean1.setValue("data3");
		// --------------------------------

		ArrayList<KeyValueBean> data_list3 = new ArrayList<KeyValueBean>();
		data_list3.add(key_bean1);
		data_list3.add(key_bean2);
		data_list3.add(key_bean3);

		model.addAttribute("data_list3", data_list3);

		// -------------------------CheckBox--------------------------------

		String[] check_list = { "data", "data3" };
		//값 초기화
		bean.setA5(check_list);
		bean.setA6(check_list);
		bean.setA7(check_list);
		bean.setA8(check_list);

		
		// -------------------------Option Button--------------------------------
		
		bean.setA9("data2");
		bean.setA10("data2");
		bean.setA11("data2");
		bean.setA12("data2");
		
		return "test1";

	}

}
