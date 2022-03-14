package com.simple.ui;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import com.simple.account.Account;

class JPanelAccount1 extends JPanel implements ActionListener {

	Account acc1;
	Account acc2;

	JLabel lblAccountName = new JLabel("예금주");
	JLabel lblAccountNumber = new JLabel("계좌번호");
	JLabel lblbalance = new JLabel("잔 액");
	JLabel lblTransAccount = new JLabel("이체계좌");
	JLabel lblTransMoney = new JLabel("이체금액");
	JLabel lblMessage = new JLabel("메 시 지");

	JTextField tfAccountName;
	JTextField tfAccountNumber;
	JTextField tfbalance;
	JTextField tfTransAccount;
	JTextField tfTransMoney;
	JTextField tfMessage;

	JButton btnQuery; // 조회버튼
	JButton btnTrans; // 이체버튼

	public JPanelAccount1(Account acc1, Account acc2) {
		//
		this.acc1 = acc1;
		this.acc2 = acc2;

		setLayout(null);
		setupPannel();
		setupLayout();
		addComponent();

		btnQuery.addActionListener(this);
		btnTrans.addActionListener(this);
	}

	private void addComponent() {
		// 패널에 컴포넌트 등록
		add(lblAccountName);
		add(lblAccountNumber);
		add(lblbalance);
		add(lblTransAccount);
		add(lblTransMoney);
		add(lblMessage);

		add(tfAccountName);
		add(tfAccountNumber);
		add(tfbalance);
		add(tfTransAccount);
		add(tfTransMoney);
		add(tfMessage);
		add(btnQuery);
		add(btnTrans);
	}

	private void setupLayout() {
		// 컴포넌트 배치
		lblAccountName.setBounds(20, 20, 100, 50);
		lblAccountNumber.setBounds(20, 100, 100, 50);
		lblbalance.setBounds(20, 180, 100, 50);
		lblTransAccount.setBounds(20, 260, 100, 50);
		lblTransMoney.setBounds(20, 340, 100, 50);
		lblMessage.setBounds(20, 420, 100, 50);

		tfAccountName.setBounds(150, 20, 100, 50);
		tfAccountNumber.setBounds(150, 100, 100, 50);
		tfbalance.setBounds(150, 180, 100, 50);
		tfTransAccount.setBounds(150, 260, 100, 50);
		tfTransMoney.setBounds(150, 340, 100, 50);
		tfMessage.setBounds(150, 420, 100, 50);

		btnQuery.setBounds(100, 500, 80, 50); // 조회버튼
		btnTrans.setBounds(190, 500, 80, 50); // 이체버튼

	}

	private void setupPannel() {
		//
		tfAccountName = new JTextField(5);
		tfAccountName.setText(acc1.getName());
		tfAccountNumber = new JTextField(5);
		tfAccountNumber.setText(acc1.getAccountNumber());
		tfbalance = new JTextField(5);
		tfbalance.setText(acc1.getBalance() + "");

		tfTransAccount = new JTextField(5);
		tfTransAccount.setText(acc2.getAccountNumber());
		tfTransMoney = new JTextField(5);
		tfMessage = new JTextField(10);

		btnQuery = new JButton("조회");
		btnTrans = new JButton("이체");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//
		// 이체 작업 처리
		// 1. 컴포넌트의 계좌번호 체크
		// 2. 계좌이체 처리 송금계좌: 이체금액 차감
		// 3. 수신계좌: 입금액 누적
		// tfTransAccount
		String s = tfTransAccount.getText();
		String j = btnQuery.getText(); // 조회버튼
		String AccountNumber1 = acc1.getAccountNumber(); // 길동
		String AccountNumber2 = acc2.getAccountNumber(); // 길순

		int balance1 = acc1.getBalance(); // 길동잔액
		int balance2 = acc2.getBalance(); // 길순잔액
//		String tfbalance11 = Integer.toString(tfbalance1);
		String balance22_ = Integer.toString(balance2);
		// tfTransAccount 이체 계좌

		int tfTransMoney_ = Integer.parseInt(tfTransMoney.getText());
		String sum1 = Integer.toString(balance1 - tfTransMoney_);
		String sum2 = Integer.toString(balance2 + tfTransMoney_);

		// 이체 버튼 눌렀을때
		if (btnTrans.getText().equals("이체")) {
			System.out.println("이체버튼 클릭");

			/////// 길동이가 입력한 계좌가 길순이 계좌가 맞을때
			if (s.equals(AccountNumber2)) {
				System.out.println("계좌번호 올바르게 입력 ㅇ");
				System.out.println("이체할 돈 : " + tfTransMoney.getText());
				
				/////// 이체 금액이 잔액보다 같거나 낮을때
				if (tfTransMoney_ <= balance1) {
					tfMessage.setText("이체 성공");
					tfbalance.setText(sum1);
					
					
										
					/////// 이체 금액이 잔액보다 높을때
				} else {
					tfMessage.setText("잔액 부족");
				}

			} /////// 길동이가 입력한 계좌가 길순이 계좌가 맞을때
			else {
				tfMessage.setText("계좌번호 오류");
				}
			} /////// 길동이가 입력한 계좌가 길순이 계좌가 아닐때
			// 조회버튼 누를때 길순이(상대) 계좌로 돈이 들어온다
//			tfbalance22.setText(sum1);
//			if(btnQuery.getText().equals("조회")) {
//				tfMessage.setText("조회 성공");
//				tfbalance.setText(sum2);
//			}

		}

	}



public class BankMain extends JFrame implements ActionListener {

	Account acc1; // 홍길동 계좌
	Account acc2; // 홍길순 계좌

	JPanelAccount1 panel01;
	JPanelAccount1 panel02;
	// JPanelAccount2 panel02;
	JTabbedPane jtab;

	public BankMain(Account acc1, Account acc2) throws HeadlessException {
		this.acc1 = acc1;
		this.acc2 = acc2;
		panel01 = new JPanelAccount1(acc1, acc2);
		panel02 = new JPanelAccount1(acc2, acc1);

		// 윈도우 프레임 설정
		setTitle("은행계좌 이체");
		setSize(350, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jtab = new JTabbedPane();
		jtab.addTab("계좌1", panel01);
		jtab.addTab("계좌2", panel02);

		add(jtab);

		setVisible(true);
	}

	public static void main(String[] args) {
		Account acc1 = new Account("123-456", "홍길동", 10000);
		Account acc2 = new Account("123-789", "홍길순", 5000);

		BankMain bank = new BankMain(acc1, acc2);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//

	}

}
