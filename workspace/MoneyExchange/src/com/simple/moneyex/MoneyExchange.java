package com.simple.moneyex;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;




public class MoneyExchange extends JFrame implements ActionListener{

	JTextField tf1, tf2, tf3, tf4, tf5, tf6;
	JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6;
	JButton btn1;
	
	public MoneyExchange() {
		// ������ �⺻������ ����
		
		this.setTitle("ȭ�������� ��ȯ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 400);
		setLayout(null);
		// ������Ʈ ����
		tf1 = new JTextField("�ݾ� �Է�", 10);
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);
		tf4 = new JTextField(10);
		tf5 = new JTextField(10);
		tf6 = new JTextField(10);
		
		lbl1 = new JLabel("�޿� ���ɾ�");
		lbl2 = new JLabel("����");
		lbl3 = new JLabel("��õ��");
		lbl4 = new JLabel("õ��");
		lbl5 = new JLabel("�����");
		lbl6 = new JLabel("���");
		
		btn1 = new JButton("���");
		
		// �̺�Ʈ ������ ���
		btn1.addActionListener(this);
		
		lbl1.setBounds(10, 10, 100 ,30); // x��, y��, ����ũ��, ����
		tf1.setBounds(120, 10, 100, 30);
		
		lbl2.setBounds(10, 50, 100 ,30);
		tf2.setBounds(120, 50, 100, 30);
		
		lbl3.setBounds(10, 90, 100 ,30);
		tf3.setBounds(120, 90, 100, 30);
		
		lbl4.setBounds(10, 130, 100 ,30);
		tf4.setBounds(120, 130, 100, 30);
		
		lbl5.setBounds(10, 170, 100 ,30);
		tf5.setBounds(120, 170, 100, 30);
		
		lbl6.setBounds(10, 210, 100 ,30);
		tf6.setBounds(120, 210, 100, 30);
		
		btn1.setBounds(120, 250, 100, 30);
		
		// �����̳ʿ� ���
		this.add(btn1);
		this.add(tf1);
		this.add(tf2);
		this.add(tf3);
		this.add(tf4);
		this.add(tf5);
		this.add(tf6);
		this.add(lbl1);
		this.add(lbl2);
		this.add(lbl3);
		this.add(lbl4);
		this.add(lbl5);
		this.add(lbl6);
		
		
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// ��ư Ŭ���� ó���� ������ ���
		// ȭ�� �������� �޿��� ����
		// 1. �޿��� �о����
		String money_ = tf1.getText();
		int money = Integer.parseInt(money_);
		int mok = 0;
		//int na = 0;
		
		
		// ������ ó��
		if(money >= 10000) {
			mok = money / 10000;
			tf2.setText(mok + "��");
			money = money % 10000;
		}		
		// ��õ���� ó��
		// System.out.println("5õ�� ���� : " + na);
		if(money >= 5000) {
			mok = money / 5000;
			tf3.setText(mok + "��");
			money = money % 5000;
		}	
		// õ���� ó��
		if(money >= 1000) {
			mok = money / 1000;
			tf4.setText(mok + "��");
			money = money % 1000;
		}	
		// ������� ó��
		if(money >= 500) {
			mok = money / 500;
			tf5.setText(mok + "��");
			money = money % 500;
		}	
		// ����� ó��
		if(money >= 100) {
			mok = money / 100;
			tf6.setText(mok + "��");
			money = money % 100;
		}	
		
		
		// System.out.println("������ : " + na);
		// tf2.setText(String.valueOf(mok));
		
		
		
		
		
		
	}

}
