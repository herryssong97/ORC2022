package hyeri;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;




public class homework04 extends JFrame implements ActionListener{

	JTextField tf1, tf2, tf3;
	JLabel lbl1, lbl2, lbl3;
	JButton btn1;
	
	public homework04() {
		// 윈도우 기본구성을 설정
		
		this.setTitle("BMI지수 구하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 400);
		setLayout(null);
		// 컴포넌트 생성
		tf1 = new JTextField("신장입력", 10);
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);
		
		lbl1 = new JLabel("신장");
		lbl2 = new JLabel("몸무게");
		lbl3 = new JLabel("BMI 지수 판정");
		
		btn1 = new JButton("계산");
		
		// 이벤트 리스너 등록
		btn1.addActionListener(this);
		
		lbl1.setBounds(10, 10, 100 ,30); // x축, y축, 가로크기, 높이
		tf1.setBounds(120, 10, 100, 30);
		
		lbl2.setBounds(10, 50, 100 ,30);
		tf2.setBounds(120, 50, 100, 30);
		
		btn1.setBounds(120, 90, 100, 30);
		
		lbl3.setBounds(10, 130, 100 ,30);
		tf3.setBounds(120, 130, 100, 30);
		
		
		
		// 컨테이너에 등록
		this.add(btn1);
		this.add(tf1);
		this.add(tf2);
		this.add(tf3);
		
		this.add(lbl1);
		this.add(lbl2);
		this.add(lbl3);
		
		
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 1. 신장 입력
		String cm_ = tf1.getText();
		int cm = Integer.parseInt(cm_);
		// 2. kg입력
		String kg_ = tf2.getText();
		int kg = 0;
		
		float mok = 0;
		//int na = 0;
		
		
		// 몸무게 입력
		// 18.5이하 저체중
		if(mok < 18.5) {
			mok = kg/cm;
			tf3.setText("저체중");
		}
		// 18.5~22.9 정상
		if(mok >= 18.5 && mok <= 22.9 ) {
			mok = kg/cm;
			tf3.setText("정상");
		}
		// 23.0~24.9 과체중
		if(mok >= 23.0 && mok <= 24.9 ) {
			mok = kg/cm;
			tf3.setText("과체중");
		}
		// 25.0 이상 비만
		if(mok >= 25.0) {
			mok = kg/cm;
			tf3.setText("비만");
		}
		
		
		
		
		
		
		
	}

}
