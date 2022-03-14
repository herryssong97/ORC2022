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

	JLabel lblAccountName = new JLabel("������");
	JLabel lblAccountNumber = new JLabel("���¹�ȣ");
	JLabel lblbalance = new JLabel("�� ��");
	JLabel lblTransAccount = new JLabel("��ü����");
	JLabel lblTransMoney = new JLabel("��ü�ݾ�");
	JLabel lblMessage = new JLabel("�� �� ��");

	JTextField tfAccountName;
	JTextField tfAccountNumber;
	JTextField tfbalance;
	JTextField tfTransAccount;
	JTextField tfTransMoney;
	JTextField tfMessage;

	JButton btnQuery; // ��ȸ��ư
	JButton btnTrans; // ��ü��ư

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
		// �гο� ������Ʈ ���
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
		// ������Ʈ ��ġ
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

		btnQuery.setBounds(100, 500, 80, 50); // ��ȸ��ư
		btnTrans.setBounds(190, 500, 80, 50); // ��ü��ư

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

		btnQuery = new JButton("��ȸ");
		btnTrans = new JButton("��ü");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//
		// ��ü �۾� ó��
		// 1. ������Ʈ�� ���¹�ȣ üũ
		// 2. ������ü ó�� �۱ݰ���: ��ü�ݾ� ����
		// 3. ���Ű���: �Աݾ� ����
		// tfTransAccount
		String s = tfTransAccount.getText();
		String j = btnQuery.getText(); // ��ȸ��ư
		String AccountNumber1 = acc1.getAccountNumber(); // �浿
		String AccountNumber2 = acc2.getAccountNumber(); // ���

		int balance1 = acc1.getBalance(); // �浿�ܾ�
		int balance2 = acc2.getBalance(); // ����ܾ�
//		String tfbalance11 = Integer.toString(tfbalance1);
		String balance22_ = Integer.toString(balance2);
		// tfTransAccount ��ü ����

		int tfTransMoney_ = Integer.parseInt(tfTransMoney.getText());
		String sum1 = Integer.toString(balance1 - tfTransMoney_);
		String sum2 = Integer.toString(balance2 + tfTransMoney_);

		// ��ü ��ư ��������
		if (btnTrans.getText().equals("��ü")) {
			System.out.println("��ü��ư Ŭ��");

			/////// �浿�̰� �Է��� ���°� ����� ���°� ������
			if (s.equals(AccountNumber2)) {
				System.out.println("���¹�ȣ �ùٸ��� �Է� ��");
				System.out.println("��ü�� �� : " + tfTransMoney.getText());
				
				/////// ��ü �ݾ��� �ܾ׺��� ���ų� ������
				if (tfTransMoney_ <= balance1) {
					tfMessage.setText("��ü ����");
					tfbalance.setText(sum1);
					
					
										
					/////// ��ü �ݾ��� �ܾ׺��� ������
				} else {
					tfMessage.setText("�ܾ� ����");
				}

			} /////// �浿�̰� �Է��� ���°� ����� ���°� ������
			else {
				tfMessage.setText("���¹�ȣ ����");
				}
			} /////// �浿�̰� �Է��� ���°� ����� ���°� �ƴҶ�
			// ��ȸ��ư ������ �����(���) ���·� ���� ���´�
//			tfbalance22.setText(sum1);
//			if(btnQuery.getText().equals("��ȸ")) {
//				tfMessage.setText("��ȸ ����");
//				tfbalance.setText(sum2);
//			}

		}

	}



public class BankMain extends JFrame implements ActionListener {

	Account acc1; // ȫ�浿 ����
	Account acc2; // ȫ��� ����

	JPanelAccount1 panel01;
	JPanelAccount1 panel02;
	// JPanelAccount2 panel02;
	JTabbedPane jtab;

	public BankMain(Account acc1, Account acc2) throws HeadlessException {
		this.acc1 = acc1;
		this.acc2 = acc2;
		panel01 = new JPanelAccount1(acc1, acc2);
		panel02 = new JPanelAccount1(acc2, acc1);

		// ������ ������ ����
		setTitle("������� ��ü");
		setSize(350, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jtab = new JTabbedPane();
		jtab.addTab("����1", panel01);
		jtab.addTab("����2", panel02);

		add(jtab);

		setVisible(true);
	}

	public static void main(String[] args) {
		Account acc1 = new Account("123-456", "ȫ�浿", 10000);
		Account acc2 = new Account("123-789", "ȫ���", 5000);

		BankMain bank = new BankMain(acc1, acc2);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//

	}

}
