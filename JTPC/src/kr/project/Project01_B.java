package kr.project;

import org.json.JSONArray;
import org.json.JSONObject;

public class Project01_B {

	public static void main(String[] args) {
		//JSON -> Java(org.json)
		JSONArray students = new JSONArray();//[{}, {}...] 
		JSONObject student = new JSONObject();
		student.put("name", "홍길동");
		student.put("phone", "010-111-2222");
		student.put("address", "종로구");
		System.out.println(student);
		students.put(student);
		//-----------------------
		student = new JSONObject();
		student.put("name", "김길동");
		student.put("phone", "010-2222-3333");
		student.put("address", "일산동구");
		System.out.println(student);
		students.put(student);
		//-----------------------
		JSONObject object = new JSONObject();
		object.put("students", students);
		System.out.println(object.toString(2));

	}

}
