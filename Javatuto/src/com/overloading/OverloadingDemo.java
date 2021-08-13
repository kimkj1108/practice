package com.overloading;

public class OverloadingDemo {
	void A() {System.out.println("void A()");	}
	void A(int a) {System.out.println("void A(int a)");	}
	void A(String a) {System.out.println("void A(String a)");	}
//	void A() {System.out.println("같은 이름, 같은 파라미터형식 갯수->에러가 납니다");	}
//	위 코드를 쓰게 되면 호출하는 자바는 뭘 가져와야 할지를 몰라유
	
	public static void main(String[] args) {
		OverloadingDemo od = new OverloadingDemo();
		od.A();
		od.A(0);
		od.A(null);
	}
//	리턴값만 다른것은 오버로드가 되지 않는다.
//	또한 파라미터의 이름만 다른것도 오버로드 되지 않는다
}
