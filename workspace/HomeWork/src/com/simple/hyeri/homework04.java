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
		// ������ �⺻������ ����
		
		this.setTitle("BMI���� ���ϱ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 400);
		setLayout(null);
		// ������Ʈ ����
		tf1 = new JTextField("�����Է�", 10);
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);
		
		lbl1 = new JLabel("����");
		lbl2 = new JLabel("������");
		lbl3 = new JLabel("BMI ���� ����");
		
		btn1 = new JButton("���");
		
		// �̺�Ʈ ������ ���
		btn1.addActionListener(this);
		
		lbl1.setBounds(10, 10, 100 ,30); // x��, y��, ����ũ��, ����
		tf1.setBounds(120, 10, 100, 30);
		
		lbl2.setBounds(10, 50, 100 ,30);
		tf2.setBounds(120, 50, 100, 30);
		
		btn1.setBounds(120, 90, 100, 30);
		
		lbl3.setBounds(10, 130, 100 ,30);
		tf3.setBounds(120, 130, 100, 30);
		
		
		
		// �����̳ʿ� ���
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
		// 1. ���� �Է�
		String cm_ = tf1.getText();
		int cm = Integer.parseInt(cm_);
		// 2. kg�Է�
		String kg_ = tf2.getText();
		int kg = 0;
		
		float mok = 0;
		//int na = 0;
		
		
		// ������ �Է�
		// 18.5���� ��ü��
		if(mok < 18.5) {
			mok = kg/cm;
			tf3.setText("��ü��");
		}
		// 18.5~22.9 ����
		if(mok >= 18.5 && mok <= 22.9 ) {
			mok = kg/cm;
			tf3.setText("����");
		}
		// 23.0~24.9 ��ü��
		if(mok >= 23.0 && mok <= 24.9 ) {
			mok = kg/cm;
			tf3.setText("��ü��");
		}
		// 25.0 �̻� ��
		if(mok >= 25.0) {
			mok = kg/cm;
			tf3.setText("��");
		}
		
		
		
		
		
		
		
	}

}
