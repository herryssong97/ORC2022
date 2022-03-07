package com.simple.ex;

public class ThreadControl {

	static void print(String message) {
		String threadName = Thread.currentThread().getName();
		System.out.printf("%s: %s%n", threadName, message);
	}

	private static class MessageLoop implements Runnable {

		@Override
		public void run() {
			// 쓰레드 동작 기술
			String message[] = { "안녕하세요 자바님", "쓰레드 학습 중 입니다.", "쓰레드 중에서 제어기법 배우고 있어요.", "자바 쓰레드는 배우기 어렵네요!!" };

			for (int i = 0; i < message.length; i++) {
				print(message[i]);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					print("아직 끝나지 않았습니다.");
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		int tries = 0;
		
		print("추가적인 스레드를 시작합닝다");
		
		Thread t = new Thread(new MessageLoop());
		
		t.setName("child"); // 네임을 안주면 0, 1, 2, 3, 4.. 이런식으로 나옴
		
		t.start();
		
		print("추가적인 스레드가 끝나기를 기다린다..");
		
		while(t.isAlive()) { // 자식 쓰레드가 동작하는 동안
			
			print("아직 기다립니다.");
			t.join(1000); // 자식 쓰레드를 1초 동안만 기다린다
			tries++;
			if(tries > 2) {
				print("참을 수가 없네요~!");
				t.interrupt();
				t.join();
			}
		}
		
		print("메인 쓰레드 종료!");
		
		
	}
}
