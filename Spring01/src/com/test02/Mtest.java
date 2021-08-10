package com.test02;

public class Mtest {
	public static void main(String[] args) {
//		MessageBeanEn message1 = new MessageBeanEn();//이 코드를 사용한다면 인터페이스를 만든 이유가 없어진다.
		MessageBean message = new MessageBeanEn();
		message.sayHello("spring?");
		
		message = new MessageBeanKo();
		message.sayHello("스프링");
		//이 코드를 만들때 나는 인터페이스를 먼저 만들었다.
		//인터페이스 MessageBean은
		//MessageBeanKo와 MTest사이에서
		//통로 역할을 한다.
		
//		message = new NomalEn();//이건 왜 에러가 나지?
//		NomalEn message = new NomalEn();//이것도 에러가 난다.
		//위 두줄의 코드가 왜 에러나는지는 생각해보고 공부해서 알아내자.
		NomalEn message01 = new NomalEn();
		message01.say("nomal");
		//NomalEn클래스를 인터페이스 없이 그냥 구현했다.
		
	}

}
