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

	JTextField number1; // ȫ�浿 ���¹�ȣ
	JTextField number2; // ȫ�浿 ��ü�����Է�
	JTextField number3; // ȫ��� ���¹�ȣ
	JTextField number4; // ȫ��� ��ü�����Է�
	JTextField cash1;	// ȫ�浿 �ܾ�
	JTextField cash2;	// ȫ��� �ܾ�
	JTextField transfer1;	// ȫ�浿 ��ü�ݾ�
	JTextField transfer2;	// ȫ��� ��ü�ݾ�
	JTextArea msg1;	// ȫ�浿 �����޽���
	JTextArea msg2;	// ȫ��� ��ü�ݾ�
	
	
	public BANK() {
		//
		this.setTitle("���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 300);
		setLayout(new GridLayout(0, 2, 5, 5)); // ���̾ƿ��� ǥ�� �ٲ�

		
		
		
		JPanel p1 = new JPanel(); // ������ �г�
		p1.setLayout(new BorderLayout());
			
		
		JPanel p11 = new JPanel();
		p11.add(new Label("        ȫ�浿        "));

		p11.add(new Label("���¹�ȣ : "));
		number1 = new JTextField(5);
		p11.add(number1);

		p11.add(new Label("�ܾ� : "));
		cash1 = new JTextField(5);
		p11.add(cash1);

		p11.add(new Label("��ü���� : "));
		number2 = new JTextField(5);
		p11.add(number2);
		
		p11.add(new Label("��ü�ݾ� : "));
		transfer1 = new JTextField(5);
		p11.add(transfer1);

		p11.add(new Label("�޽��� : "));
		msg1 = new JTextArea(1, 10);
		p11.add(msg1);
		
		p1.add(p11, BorderLayout.CENTER);

		JPanel p12 = new JPanel(); // �ι�° �г�
		JButton enter1 = new JButton("��ȸ");
		JButton reset1 = new JButton("��ü");

		enter1.addActionListener(this);
		reset1.addActionListener(this);

		p12.add(enter1);
		p12.add(reset1);

		p1.add(p12, BorderLayout.SOUTH);
		
		
		////////////////////////////////////////////////////////

		JPanel p2 = new JPanel(); // ������ �г�
		p2.setLayout(new BorderLayout());
			
		
		JPanel p21 = new JPanel();
		p21.add(new Label("        ȫ���        "));

		p21.add(new Label("���¹�ȣ : "));
		number3 = new JTextField(5);
		p21.add(number3);

		p21.add(new Label("�ܾ� : "));
		cash2 = new JTextField(5);
		p21.add(cash2);

		p21.add(new Label("��ü���� : "));
		number4 = new JTextField(5);
		p21.add(number4);
		
		p21.add(new Label("��ü�ݾ� : "));
		transfer2 = new JTextField(5);
		p21.add(transfer2);

		p21.add(new Label("�޽��� : "));
		msg2 = new JTextArea(1, 10);
		p21.add(msg2);
		
		p2.add(p21, BorderLayout.CENTER);

		JPanel p22 = new JPanel(); // �ι�° �г�
		JButton enter2 = new JButton("��ȸ");
		JButton reset2 = new JButton("��ü");

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
