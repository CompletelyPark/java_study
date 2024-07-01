package Awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class frame2 extends Frame{

	public frame2(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
		setBounds(450, 300, 50, 200);
//		setResizable(false);
		setBackground(Color.WHITE);
	
		super.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
				setVisible(false);
				frame2.this.setVisible(false);
				dispose();
				System.exit(0);
			}
		});
		setVisible(true);
		
//		배치 관리자를 지정하지 않으면 
//		window의 기본 배치 관리자가 BorderLayout이 적용된다
//		개별 component가 알아서 배치되게 설정
//		setLayout(null);
		
//		추가한 순서대로 배치되는 FlowLayout 사용
		FlowLayout flowLayout = new FlowLayout(FlowLayout.TRAILING);
//		setLayout(new FlowLayout);
		setLayout(flowLayout);
		
		
		Label lname = new Label("이 름");
		add(lname);
		
		TextField tfname = new TextField("박진완",10);
		add(tfname);
		
		Button btnConfirm = new Button("입력");
		add(btnConfirm);
		
		btnConfirm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name = tfname.getText();
				System.out.print(name);
			}
		});
	}
}


public class AwtTest2 {
	public static void main(String[] args) {

		frame2 frame = new frame2("222222");
		
		
	}
	
}
