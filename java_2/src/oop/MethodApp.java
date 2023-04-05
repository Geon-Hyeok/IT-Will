package oop;

// 실행이 목적인 클래스 - main 메소드를 반드시 작성
public class MethodApp {
	// 프로그램 실행시 JVM에 의해 자동 호출하는 특별한 메소드
	public static void main(String[] args) {
		// 클래스로 객체를 생성하여 객체의 메모리 주소를 참조변수에 저장
		// => 같은 패키지에 작성된 클래스는 패키지 표현없이 클래스 사용 가능
		// => 참조변수를 사용하여 객체의 필드 또는 메소드 접근 가능
		Method method = new Method();
		
		// 참조변수를 출력할 경우 "자료형@메모리주소" 형식의 문자열로 제공받아 출력
		System.out.println("method = " + method);
		System.out.println("==================================================");
		
		/* 메소드 호출 : 객체를 이용하여 메소드를 호출하면 프로그램의 흐름(스레드)은 
		객체의 메소드로 이동하여 메소드의 명령을 실행하고 메소드가 종료되면 다시 되돌아와 다음 명령을 실행 */		
		method.displayOne();
		method.displayTwo();
		System.out.println("==================================================");
		
		method.printOne();
		method.printTwo(50);
		method.printTwo(-29);
		method.printThree(1, 100);
		method.printThree(79, 4);
		System.out.println("==================================================");
		
	}
}
