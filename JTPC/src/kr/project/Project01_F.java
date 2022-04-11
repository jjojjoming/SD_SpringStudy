package kr.project;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Project01_F {
	
	JTextField address; //주소 입력할 부분 변수 선언
	JLabel resAddress, resX, resY, jibunAddress;
	JLabel imageLabel; //지도 이미지 변수 선언
	
	//GUI 메소드
	public void initGUI() {
		
		JFrame frm = new JFrame("Map View"); //프레임과 제목
		//종료
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x버튼으로 종료
		//ui구현부
		Container c = frm.getContentPane(); //전체 GUI캔버스
		
		imageLabel = new JLabel("지도보기");
		
		JPanel pan = new JPanel(); //맨 위 주소 입력 부분
		JLabel addressLbl= new JLabel("주소입력");
		address = new JTextField(50);
		JButton btn = new JButton("클릭");
		pan.add(addressLbl);
		pan.add(address);
		pan.add(btn);
		
		//지도 이미지 생성
		btn.addActionListener(new NaverMap(this));
		
		//API 정보
		JPanel pan1 = new JPanel();
		pan1.setLayout(new GridLayout(4, 1));
		resAddress = new JLabel("도로명");
		jibunAddress = new JLabel("지번주소");
		resX = new JLabel("경도");
		resY = new JLabel("위도");
		
		pan1.add(resAddress);
		pan1.add(jibunAddress);
		pan1.add(resX);
		pan1.add(resY);
		
		c.add(BorderLayout.NORTH, pan);
		c.add(BorderLayout.CENTER, imageLabel);
		c.add(BorderLayout.SOUTH, pan1);
		
		frm.setSize(730, 660);
		frm.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Project01_F().initGUI();
	}

}
