package Awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class frame1 extends Frame{

	public frame1(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
		setBounds(300, 200, 700, 500);
		setResizable(false);
		setBackground(Color.WHITE);
		
//		윈도우 닫기 버튼 클릭 시의 이벤트 처리
//		super.addWindowListener(new WindowListener() {
//
//			@Override
//			public void windowOpened(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void windowClosing(WindowEvent e) {
//				// TODO Auto-generated method stub
//				setVisible(false);
////				frame1.this.setVisible(false);
//				dispose();
//			}
//
//			@Override
//			public void windowClosed(WindowEvent e) {
//				// TODO Auto-generated method stub
//			}
//
//			@Override
//			public void windowIconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void windowActivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		});
		
		super.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
				setVisible(false);
				frame1.this.setVisible(false);
				dispose();
				
			}
		});
		setVisible(true);
		
//		내부에 구성요소를 배치할 때 특별한 배치관리자를 사용하지 않는다는 의미
//		반드시 각 구성요소 마다 위치와 크기를 가지고 있어야 한다
		setLayout(null);
		
//		화면 구성 - 개별 컴퍼넌트 사용법
//		단순 글자 출력 - Label
		Label lname = new Label("이 름");
		
//		크기 다음 위치
		lname.setBounds(50,50,50,50);
		lname.setSize(30,30);
		lname.setBackground(Color.GRAY);
		add(lname);
		
//		숫자는 몇 글자 입력할 수 있는지 지정, 초기값 지정 가능
		TextField tfname = new TextField("박진완",10);
		tfname.setBounds(100, 50, 100, 30);
		tfname.setBackground(Color.gray);
		add(tfname);
		
		Button btnConfirm = new Button("입력");
		btnConfirm.setBounds(210, 50, 30, 30);
		btnConfirm.setBackground(Color.gray);
		add(btnConfirm);
		
		btnConfirm.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				TextField에 입력된 값 읽어오기
				String name = tfname.getText();
				System.out.print(name);
			}
		});
	}
}


public class AwtTest {
	public static void main(String[] args) {
//		Frame frame = new Frame("1번째 frame");
//
////		frame 크기 설정
////		frame.setSize(700,500);
////		frame 위치 설정
////		frame.setLocation(300,200);
////		위의 두개 동시에
//		frame.setBounds(300, 200, 700, 500);
//
////		크기 조절 불가능
//		frame.setResizable(false);
//			
////		배경 색상 설정
////		frame.setBackground(Color.WHITE);
////		RGB값으로 설정 가능 r, g, b, a
//		frame.setBackground(new Color(176,247,255));
//
////		frame 보여주기
//		frame.setVisible(true);
//
////		frame.isVisible()		보여지는지 여부
////		frame.isResizable()		크기 조절 여부
//		
		
		frame1 frame = new frame1("111111");
		
		
	}
}
