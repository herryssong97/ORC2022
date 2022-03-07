package com.simple.ex;

@FunctionalInterface
interface MyFunction{
	void run();
}


public class LambdaEx {
	
	static void execute(MyFunction f) {
		f.run();	// �Լ��� �޾Ƽ� ���������� �����Ű�� ��
	}

	static MyFunction getMyFunction() {
		MyFunction f = () -> System.out.println("f3.run");
		return f;
		// f�� �Լ��� = ()��¼��� �Լ��� ���ĵ�.. �Լ��� ������ ��
		// ���� ���� ������ ���� ���� �Ҵ��Ҷ�
	}
	
	
	public static void main(String[] args) {
		// = �ڷδ� �� �Լ� f1�� ���ٽ�
		
		MyFunction f1 = ()->System.out.println("f1.run");
		
		MyFunction f2 = new MyFunction() {
			
			@Override
			public void run() {
				// 
				System.out.println("f2.run()");
				
			}
		};
		
		
		// �Լ��� ��ȯ�ϴ� ���
		MyFunction f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		/// execute �� �� ��ü�� �Լ�
		execute(f1);
		execute(()->System.out.println("����"));
		
	}
}
