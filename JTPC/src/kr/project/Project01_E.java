package kr.project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Project01_E {
	
	public static void map_service(String point_x, String point_y, String address) {
		String URL_STATICMAP = "https://naveropenapi.apigw.ntruss.com/map-static/v2/raster?";
		
		try {
			String pos = URLEncoder.encode(point_x + " " + point_y, "UTF-8");
			String url = URL_STATICMAP;
			
			url += "center=" + point_x + "," + point_y; //찾는 위치가 중앙에 오도록 url 설정
			url += "&level=16&w=700&h=500"; //level=16 : 줌 레벨(0 ~ 20)
			url += "&markers=type:t|size:mid|pos:" + pos + "|label:" + URLEncoder.encode(address, "UTF-8");
			
			URL u = new URL(url);
			//HttpURLConnection : URL로 연동해주는 API 클래스
			HttpURLConnection con = (HttpURLConnection)u.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-NCP-APIGW-API-KEY-ID", "kmdpx8zdqi"); //API정보
			con.setRequestProperty("X-NCP-APIGW-API-KEY", "zBMxXBp0fehYQFqynuGmW3RE9Bd2mvbTlonHXInv");
			int responseCode = con.getResponseCode(); //200
			BufferedReader br; //라인단위로 읽어들이기 위한 객체 생성
			if(responseCode == 200) {
				//입력스트림
				InputStream is = con.getInputStream();
				int read = 0;
				byte[] bytes = new byte[1024]; //이미지는 바이트 단위로 처리하여 받아오기 위한 배열방 설정
				String tempname = Long.valueOf(new Date().getTime()).toString(); //랜덤이름 생성
				File f = new File(tempname + ".jpg");
				f.createNewFile(); //파일생성
				
				//출력스트림
				OutputStream outputstream = new FileOutputStream(f);
				while((read = is.read(bytes)) != -1) { //-1 : 끝이 아니면
					outputstream.write(bytes, 0, read); //0부터 읽어들인만큼 바이트로 변환
				}
				is.close();
				
			}
			else {
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
				String inputline;
				StringBuffer response = new StringBuffer();
				while((inputline = br.readLine()) != null) {
					response.append(inputline); //스트림버퍼에 담기
				}
				br.close();
				System.out.println(response.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//https://naveropenapi.apigw.ntruss.com/map-static/v2/raster
		String client_id="kmdpx8zdqi";
		String client_secret="zBMxXBp0fehYQFqynuGmW3RE9Bd2mvbTlonHXInv";
		BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("주소를 입력하세요. : ");
			String address = io.readLine();
			String addr = URLEncoder.encode(address, "UTF-8");
			String reqUrl = "https://naveropenapi.apigw.ntruss.com/map-geocode/v2/geocode?query=" + addr;
			
			URL url = new URL(reqUrl);
			//HttpURLConnection : URL로 연동해주는 API 클래스
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-NCP-APIGW-API-KEY-ID", client_id); //API정보
			con.setRequestProperty("X-NCP-APIGW-API-KEY", client_secret);
			BufferedReader br; //라인단위로 읽어들이기 위한 객체 생성
			int responseCode = con.getResponseCode(); //200
			if(responseCode == 200) {
				br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			}
			else {
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			String line;
			StringBuffer response = new StringBuffer();
			String x = "";
			String y = "";
			String z = "";
			while((line = br.readLine()) != null) {
				response.append(line); //스트림버퍼에 담기
			}
			br.close();
			
			JSONTokener tokener = new JSONTokener(response.toString()); //JSON객체
			JSONObject object = new JSONObject(tokener); //Object로 변환
			System.out.println(object.toString());
			
			JSONArray arr = object.getJSONArray("addresses"); //주소가 여러개일때 반복문으로 출력하기위한 컬렉션
			for(int i = 0; i < arr.length(); i++) {
				JSONObject temp = (JSONObject)arr.get(i);
				System.out.println("address : " + temp.get("roadAddress"));
				System.out.println("jibunAddress : " + temp.get("jibunAddress"));
				System.out.println("경도 : " + temp.get("x"));
				System.out.println("위도 : " + temp.get("y"));
				x = (String)temp.getString("x");
				y = (String)temp.getString("y");
				z = (String)temp.getString("roadAddress");
			}
			map_service(x, y, z);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
