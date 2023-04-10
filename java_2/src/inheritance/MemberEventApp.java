package inheritance;

public class MemberEventApp {
	public static void main(String[] args) {
		/*
		 * 자식 클래스의 생성자로 객체를 생성할 경우 부모클래스의 생성자가 먼저 호출되어 부모 클래스의 객체가 먼저 생성된 후 자식 클래스의 생성자로
		 * 객체를 생성하여 상속관계 성립
		 */

		/*
		 * => 자식 클래스의 참조변수에는 자식 클래스 객체의 메모리 주소가 저장되어 자식 클래스 객체의 요소를 참조하지만 상속관계에 의해 부모클래스
		 * 객체의 필드 또는 메소드 참조 가능
		 */

		MemberEvent member1 = new MemberEvent();

		member1.setId("abc123");
		member1.setName("홍길동");
		member1.setEmail("abc123@gmail.com");

		member1.display();
		System.out.println("===================================");

		MemberEvent member2 = new MemberEvent("xyz456", "임꺽정", "xyz123@gmail.com");
		member2.display();
		System.out.println("====================================");
	}
}
