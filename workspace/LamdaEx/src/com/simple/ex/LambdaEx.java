package com.simple.ex;

@FunctionalInterface
interface MyFunction{
	void run();
}


public class LambdaEx {
	
	static void execute(MyFunction f) {
		f.run();	// 함수를 받아서 내부적에서 실행시키는 것
	}

	static MyFunction getMyFunction() {
		MyFunction f = () -> System.out.println("f3.run");
		return f;
		// f는 함수명 = ()어쩌고는 함수와 수식들.. 함수를 리턴한 것
		// 겟은 값을 얻을때 셋은 값을 할당할때
	}
	
	
	public static void main(String[] args) {
		// = 뒤로는 다 함수 f1은 람다식
		
		MyFunction f1 = ()->System.out.println("f1.run");
		
		MyFunction f2 = new MyFunction() {
			
			@Override
			public void run() {
				// 
				System.out.println("f2.run()");
				
			}
		};
		
		
		// 함수를 반환하는 경우
		MyFunction f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		/// execute 는 이 자체가 함수
		execute(f1);
		execute(()->System.out.println("ㅎㅇ"));
		
	}
}
