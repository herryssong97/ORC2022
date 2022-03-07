package com.simple.ex;

public class ThreadControl {

	static void print(String message) {
		String threadName = Thread.currentThread().getName();
		System.out.printf("%s: %s%n", threadName, message);
	}

	private static class MessageLoop implements Runnable {

		@Override
		public void run() {
			// ������ ���� ���
			String message[] = { "�ȳ��ϼ��� �ڹٴ�", "������ �н� �� �Դϴ�.", "������ �߿��� ������ ���� �־��.", "�ڹ� ������� ���� ��Ƴ׿�!!" };

			for (int i = 0; i < message.length; i++) {
				print(message[i]);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					print("���� ������ �ʾҽ��ϴ�.");
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		int tries = 0;
		
		print("�߰����� �����带 �����մ״�");
		
		Thread t = new Thread(new MessageLoop());
		
		t.setName("child"); // ������ ���ָ� 0, 1, 2, 3, 4.. �̷������� ����
		
		t.start();
		
		print("�߰����� �����尡 �����⸦ ��ٸ���..");
		
		while(t.isAlive()) { // �ڽ� �����尡 �����ϴ� ����
			
			print("���� ��ٸ��ϴ�.");
			t.join(1000); // �ڽ� �����带 1�� ���ȸ� ��ٸ���
			tries++;
			if(tries > 2) {
				print("���� ���� ���׿�~!");
				t.interrupt();
				t.join();
			}
		}
		
		print("���� ������ ����!");
		
		
	}
}
