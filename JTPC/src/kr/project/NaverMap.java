package kr.project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

import javax.swing.ImageIcon;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import kr.soldesk.AddressVO;

public class NaverMap implements ActionListener {

	Project01_F naverMap;

	public NaverMap(Project01_F naverMap) {
		super();
		this.naverMap = naverMap;
	}

	public static void main(String[] args) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String client_id = "kmdpx8zdqi";
		String client_secret = "zBMxXBp0fehYQFqynuGmW3RE9Bd2mvbTlonHXInv";
		AddressVO vo = null;

		try {
			String address = naverMap.address.getText();
			String addr = URLEncoder.encode(address, "UTF-8");
			String apiUrl = "https://naveropenapi.apigw.ntruss.com/map-geocode/v2/geocode?query=" + addr;

			URL url = new URL(apiUrl);
			// HttpURLConnection : URL로 연동해주는 API 클래스
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-NCP-APIGW-API-KEY-ID", client_id); // API정보
			con.setRequestProperty("X-NCP-APIGW-API-KEY", client_secret);
			BufferedReader br; // 라인단위로 읽어들이기 위한 객체 생성
			int responseCode = con.getResponseCode(); // 200
			if (responseCode == 200) {
				br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			} else {
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			String inputline;
			StringBuffer response = new StringBuffer();
			while ((inputline = br.readLine()) != null) {
				response.append(inputline); // 스트림버퍼에 담기
			}
			br.close();

			JSONTokener tokener = new JSONTokener(response.toString()); // JSON객체
			JSONObject object = new JSONObject(tokener); // Object로 변환
			System.out.println(object.toString());

			JSONArray arr = object.getJSONArray("addresses"); // 주소가 여러개일때 반복문으로 출력하기위한 컬렉션
			for (int i = 0; i < arr.length(); i++) {
				JSONObject temp = (JSONObject) arr.get(i);
				// AddressVO에 담기
				vo = new AddressVO();
				vo.setRoadAddress((String) temp.get("roadAddress"));
				vo.setJibunAddress((String) temp.get("jibunAddress"));
				vo.setX((String) temp.get("x"));
				vo.setY((String) temp.get("y"));
			}
			map_service(vo);
		} catch (Exception e2) {
			System.out.println(e2);
		}

	}

	public void map_service(AddressVO vo) {
		String URL_STATICMAP = "https://naveropenapi.apigw.ntruss.com/map-static/v2/raster?";

		try {
			String pos = URLEncoder.encode(vo.getX() + " " + vo.getY(), "UTF-8");
			URL_STATICMAP += "center=" + vo.getX() + "," + vo.getY(); // 찾는 위치가 중앙에 오도록 url 설정
			URL_STATICMAP += "&level=16&w=700&h=500"; // level=16 : 줌 레벨(0 ~ 20)
			URL_STATICMAP += "&markers=type:t|size:mid|pos:" + pos + "|label:"
					+ URLEncoder.encode(vo.getRoadAddress(), "UTF-8");

			URL url = new URL(URL_STATICMAP);
			// HttpURLConnection : URL로 연동해주는 API 클래스
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-NCP-APIGW-API-KEY-ID", "kmdpx8zdqi"); // API정보
			con.setRequestProperty("X-NCP-APIGW-API-KEY", "zBMxXBp0fehYQFqynuGmW3RE9Bd2mvbTlonHXInv");
			int responseCode = con.getResponseCode(); // 200
			BufferedReader br; // 라인단위로 읽어들이기 위한 객체 생성
			if (responseCode == 200) {

				// 입력스트림
				InputStream is = con.getInputStream();
				int read = 0;
				byte[] bytes = new byte[1024]; // 이미지는 바이트 단위로 처리하여 받아오기 위한 배열방 설정
				String tempname = Long.valueOf(new Date().getTime()).toString(); // 랜덤이름 생성
				File f = new File(tempname + ".jpg");
				f.createNewFile(); // 파일생성

				// 출력스트림
				OutputStream outputstream = new FileOutputStream(f);
				while ((read = is.read(bytes)) != -1) { // -1 : 끝이 아니면
					outputstream.write(bytes, 0, read); // 0부터 읽어들인만큼 바이트로 변환
				}
				is.close();
				ImageIcon img = new ImageIcon(f.getName());
				naverMap.imageLabel.setIcon((img));
				naverMap.resAddress.setText(vo.getRoadAddress());
				naverMap.jibunAddress.setText(vo.getJibunAddress());
				naverMap.resX.setText(vo.getX());
				naverMap.resY.setText(vo.getY());

			} else { // 에러발생
				System.out.println(responseCode);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
