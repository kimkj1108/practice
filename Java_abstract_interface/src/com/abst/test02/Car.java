package com.abst.test02;

//추상 클래스
//다중상속 안됨
public abstract class Car {
	//Field : 필드값은 추상클래스는 가지는 반면 인터페이스는 가지지 못한다.자바를 만든 사람은 왜 그렇게 만들었을까?
	private String brand;
	private String name;
	

	// Constructor
	public Car(String brand, String name ) {
		this.brand = brand;//간단한건데 이거 생각하면 편하다 대입연산자는 왼쪽걸 오른쪽에 대입하는거다.
							//파라미터로 받은걸 필드값에 대입해주는것이다.
		this.name = name;
		System.out.println(brand +" is make " + name);
	}
	//추상메소드는 여러개 가질수도있다.
	//해당 클래스는 추상클래스이지만 추상 클래스를 가질 수 있는거지 꼭 가져야만 하는건 아니다.
	public abstract void Speed();
	public abstract void BrakingPower();

}
