package com.simple.GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

// 紺亀税 適掘什 幻級嬢爽奄
class Calculator extends JFrame {
	// =JFrame f = new JFrame("神 鯵重奄背 せせせせ");
	// Calculator 戚硯税 制亀酔亜 馬蟹 幻級嬢 遭 依

	// 陳匂獲闘 持失
	// 2鯵税 葵聖 脊径 閤澗 陳匂獲闘
	JTextField text1 = new JTextField(10);
	JTextField text2 = new JTextField(10);
	JTextField sum = new JTextField(10);

	JButton btnAdd = new JButton("+");
	JButton btnSub = new JButton("-");
	JButton btnMul = new JButton("*");
	JButton btnDiv = new JButton("/");

	public Calculator() {
		//
		this.setTitle("神 鯵重奄背 せせせせ");
		FlowLayout lay1 = new FlowLayout();

		this.setLayout(lay1); // 紫遂切 傾戚焼数

		// text1.setText();
		// text2.setText();

		// 戚坤闘 坦軒
		// 戚坤闘 姶走 -> 戚坤闘 軒什格 去系
		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//
				String num1 = text1.getText();
				String num2 = text2.getText();

				int total = Integer.parseInt(num1) + Integer.parseInt(num2);

				sum.setText(String.valueOf(total));

			}
		});

		btnSub.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String num1 = text1.getText();
				String num2 = text2.getText();

				int total = Integer.parseInt(num1) - Integer.parseInt(num2);

				sum.setText(String.valueOf(total));

			}
		});

		btnMul.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String num1 = text1.getText();
				String num2 = text2.getText();

				int total = Integer.parseInt(num1) * Integer.parseInt(num2);

				sum.setText(String.valueOf(total));

			}
		});
		btnDiv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				double div = 0;
				String num1_ = text1.getText();
				String num2_ = text2.getText();
				int num1 = Integer.parseInt(num1_);
				int num2 = Integer.parseInt(num2_);

				if (num2 > 0) {
					div = (double) num1 / num2;
					sum.setText(String.valueOf(div));
				} else {
					sum.setText("0生稽 蟹喚 呪 蒸柔艦陥");
				}

				sum.setText(String.valueOf(div));

			}
		});

		// System.out.println("=>" + total);

		// btn3.setBounds(x, y, width, height);
		// btn1.setBounds(130, 100, 100, 40);

		// 陳匂獲闘研 珍砺戚格拭 諮脊
		this.add(text1);
		this.add(text2);
		this.add(btnAdd);
		this.add(btnSub);
		this.add(btnMul);
		this.add(btnDiv);
		this.add(sum);
		this.setSize(100, 500);
		this.setVisible(true);

	}

}

public class GuiEx03 {

	public static void main(String[] args) {
		new Calculator();
	}

}
