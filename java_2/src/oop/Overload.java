package oop;

public class Overload {
	public void displayInt(int param) {
		System.out.println("정수값 = " + param);
	}

	public void displayBoolean(boolean param) {
		System.out.println("논리값 = " + param);
	}

	public void displayString(String param) {
		System.out.println("문자열 " + param);
	}

	// 메소드 오버로딩(Method Overloading) : 클래스에서 동일한 기능을 제공하는 메소드가 매개변수에 의해 여러개 선언해야 할 경우
	// 메소드 이름을 같도록 선언하는 기능
	// => 매개변수의 자료형 또는 갯수가 같지 않도록 선언
	// => 접근 제한자와 반환형은 오버로드 선언과 무관
	public void display(int param) {
		System.out.println("정수값 = " + param);
	}

//	public void display(int param2) { // 매개변수의 이름은 다르지만 매개변수의 자료형과 갯수가 같기에 사용할 수 없다
//		System.out.println("정수값 = " + param2);
//	}

	public void display(boolean param) { // 매개변수의 이름은 같지만 매개변수가 다르면 서로 다른 변수로 인식한다
		System.out.println("정수값 = " + param);
	}

	public void display(String param) {
		System.out.println("정수값 = " + param);
	}
}