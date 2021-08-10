package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/bean.xml");
		MessageBean bean = (MessageBean) factory.getBean("english");
//		MessageBean bean > (MessageBean) factory.getBean("english");
//		왜 형변환 되었는가에 대해서 생각해보기
		bean.sayHello("Spring");

		bean = (MessageBean) factory.getBean("korean");
		bean.sayHello("스프링");

	}
}
/*
 * ApplicationContext, ClassPathXmlApplicationContext
 * Application는 우리가 만드는 프로젝트 Context는 설정 파일
 * 
 * 
 * 
 * BeanFactory <- ApplicationContext <- ClassPathXmlApplicationContext 빈펙토리를
 * 상속받는 어플리케이션 컨텍스트, 어플리케이션컨텍스트를 상속받는 ClassPathXmlApplicationContext
 * 
 * ApplicationContext 객체는 스프링 컨테이너의 인스턴스 이다.->인스턴스는 객체이다/결국 ApplicationContext가 스프링 컨테이너다 라는 뜻이다.
 *  스프링은 ApplicationContext 인터페이스의 몇가지기본 구현을 제공한다.--?ApplicationContext는 인터페이스이다.
 *  그중, ClassPathXmlApplicationContext는 XML형식의 독립형 어플리케이션에 적합, 
 * (지정된Classpath에서 xml파일을 읽어서 객체 생성) 
 *-------
 * Container : 담는 그릇(bean을 저장하고 관리하는 객체)
 * Content : 기능 
 * Context : 기능을 구현하기 위한 정보(설정)
 */