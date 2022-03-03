package hyeri;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class BANK extends JFrame implements ActionListener{

	JTextField number1; // 홍길동 계좌번호
	JTextField number2; // 홍길동 이체계좌입력
	JTextField number3; // 홍길순 계좌번호
	JTextField number4; // 홍길순 이체계좌입력
	JTextField cash1;	// 홍길동 잔액
	JTextField cash2;	// 홍길순 잔액
	JTextField transfer1;	// 홍길동 이체금액
	JTextField transfer2;	// 홍길순 이체금액
	JTextArea msg1;	// 홍길동 오류메시지
	JTextArea msg2;	// 홍길순 이체금액
	
	
	public BANK() {
		//
		this.setTitle("혜리 은행");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 300);
		setLayout(new GridLayout(0, 2, 5, 5)); // 레이아웃이 표로 바뀜

		
		
		
		JPanel p1 = new JPanel(); // 최초의 패널
		p1.setLayout(new BorderLayout());
			
		
		JPanel p11 = new JPanel();
		p11.add(new Label("        홍길동        "));

		p11.add(new Label("계좌번호 : "));
		number1 = new JTextField(5);
		p11.add(number1);

		p11.add(new Label("잔액 : "));
		cash1 = new JTextField(5);
		p11.add(cash1);

		p11.add(new Label("이체계좌 : "));
		number2 = new JTextField(5);
		p11.add(number2);
		
		p11.add(new Label("이체금액 : "));
		transfer1 = new JTextField(5);
		p11.add(transfer1);

		p11.add(new Label("메시지 : "));
		msg1 = new JTextArea(1, 10);
		p11.add(msg1);
		
		p1.add(p11, BorderLayout.CENTER);

		JPanel p12 = new JPanel(); // 두번째 패널
		JButton enter1 = new JButton("조회");
		JButton reset1 = new JButton("이체");

		enter1.addActionListener(this);
		reset1.addActionListener(this);

		p12.add(enter1);
		p12.add(reset1);

		p1.add(p12, BorderLayout.SOUTH);
		
		
		////////////////////////////////////////////////////////

		JPanel p2 = new JPanel(); // 최초의 패널
		p2.setLayout(new BorderLayout());
			
		
		JPanel p21 = new JPanel();
		p21.add(new Label("        홍길순        "));

		p21.add(new Label("계좌번호 : "));
		number3 = new JTextField(5);
		p21.add(number3);

		p21.add(new Label("잔액 : "));
		cash2 = new JTextField(5);
		p21.add(cash2);

		p21.add(new Label("이체계좌 : "));
		number4 = new JTextField(5);
		p21.add(number4);
		
		p21.add(new Label("이체금액 : "));
		transfer2 = new JTextField(5);
		p21.add(transfer2);

		p21.add(new Label("메시지 : "));
		msg2 = new JTextArea(1, 10);
		p21.add(msg2);
		
		p2.add(p21, BorderLayout.CENTER);

		JPanel p22 = new JPanel(); // 두번째 패널
		JButton enter2 = new JButton("조회");
		JButton reset2 = new JButton("이체");

		enter2.addActionListener(this);
		reset2.addActionListener(this);

		p22.add(enter2);
		p22.add(reset2);

		p2.add(p22, BorderLayout.SOUTH);
		
		
		
		
		
		add(p1);
		add(p2);
		setVisible(true);
	}
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}







public class homework05 {

	public static void main(String[] args) {
		new BANK();
	}

}
