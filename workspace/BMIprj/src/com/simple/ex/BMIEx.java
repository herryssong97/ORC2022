package com.simple.ex;

import java.awt.BorderLayout;
import java.awt.Color;
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

class BMI extends JFrame implements ActionListener {

	JTextField in_height;
	JTextField in_weight;
	JTextField reBMI;
	JTextField reBMI2;
	JTextArea ta;

	public BMI() {
		//
		this.setTitle("BMI���� ���ϱ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 400);
		setLayout(new GridLayout(2, 1, 5, 5)); // ���̾ƿ��� ǥ�� �ٲ�

		JPanel p1 = new JPanel(); // ������ �г�
		p1.setBackground(Color.yellow); // ����
		p1.setLayout(new BorderLayout());

		JLabel lbl1 = new JLabel("Ű(cm)�� ������(kg) �Է��Ͻð�" + "'üũ' ��ư�� ��������");
		p1.add(lbl1, BorderLayout.NORTH); // ��ܿ� ��ġ

		JPanel p11 = new JPanel();
		p11.add(new Label("Ű(cm) : "));
		in_height = new JTextField(5);
		p11.add(in_height);

		p11.add(new Label("������(kg) : "));
		in_weight = new JTextField(5);
		p11.add(in_weight);

		p1.add(p11, BorderLayout.CENTER);

		JPanel p12 = new JPanel(); // �ι�° �г�
		JButton enter = new JButton("üũ");
		JButton reset = new JButton("�ٽ��Է�");

		enter.addActionListener(this);
		reset.addActionListener(this);

		p12.add(enter);
		p12.add(reset);

		p1.add(p12, BorderLayout.SOUTH);

		add(p1);

		// ��� �г� ����
		JPanel p2 = new JPanel();
		p2.setLayout(new BorderLayout());
		JLabel lbl2 = new JLabel("--- ������� ----");
		p2.add(lbl2, BorderLayout.NORTH); // ��ܿ� ��ġ

		JPanel p21 = new JPanel();
		p21.add(new JLabel("������(BMI) : "));
		reBMI = new JTextField(5);
		p21.add(reBMI);

		p21.add(new JLabel("ǥ��ü��(kg) : "));
		reBMI2 = new JTextField(5);
		p21.add(reBMI2);

		p21.add(new JLabel("BMI�� �� ����� ���´�?"));
		ta = new JTextArea(1, 20);
		p21.add(ta);

		p2.add(p21, BorderLayout.CENTER);

		add(p2); // grid �ι�° �࿡ ���

		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//

		String s = e.getActionCommand();

		// ǥ��ü��
		double N_weight = 0.0;
		double weight = 0.0;

		String height_ = in_height.getText();
		double height = Double.parseDouble(height_);

		String weight_ = in_weight.getText();
		weight = Double.parseDouble(weight_);

		if (s.equals("üũ")) {

			N_weight = (height - 100) * 0.9;

			// ������ȯ
			height = height / 100;

			// BMI���� ���
			double BMI = Math.round(weight / (height * height));
			String re = BMI_Check(BMI);

			// ������
			reBMI.setText(BMI + ""); // �� �񿥾���
			reBMI2.setText(N_weight + ""); // ǥ��ü��
			ta.setText(re + "");

		}

	}

	private String BMI_Check(double BMI) {
		String result = "";

		if (BMI < 18.5) {
			result = "��ü��";
		}
		if (BMI >= 18.5 && BMI <= 22.9) {
			result = "����";
		}
		if (BMI >= 23.0 && BMI <= 24.9) {
			result = "��ü��";
		}
		if (BMI >= 25.0) {
			result = "��";
		}

		return result;
	}

}

public class BMIEx {

	public static void main(String[] args) {
		new BMI();
	}

}
