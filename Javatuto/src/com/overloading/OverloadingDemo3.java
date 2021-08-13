package com.overloading;



class Overloading{
	void A() {System.out.println("void A()");}
	void A(int a) {System.out.println("void A(int a)");}
	void A(int a, int b) {System.out.println("void A(int a, int b)");}
	void A(String a) {System.out.println("void A(String a)");}
	void A(int a, String b) {System.out.println("void A(int a, String b)");}
}
public class OverloadingDemo3 {
//	Overloading ob = new Overloading();//왜 메인메서드 밖에 인스턴스 만든건 실행이 안될까?
	public static void main(String[] args) {
		Overloading ob = new Overloading();
		ob.A();
		ob.A(1);
		ob.A("1");
		ob.A(1,2);
		ob.A(1,"1");
		//ob.A("1",1);//이런 메소드는 만든적이 없다.
	}

}
