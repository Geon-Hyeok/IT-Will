package oop;

// => VO(Value Object) 클래스 : 특정 대상의 값을 저장할 목적의 객체를 생성하기 위한 클래스

// 회원정보(아이디, 이름, 이메일)를 저장하기 위한 클래스
public class Member {
	// 필드선언 : 객체를 생성하면 객체의 필드에는 기본값이 초기값으로 자동 저장
	private String id;
	private String name;
	private String email;

	// 생성자 선언 : 객체를 생성하기 위한 특별한 형태의 메소드
	// => 생성자를 선언하지 않으면 매개변수가 없는 기본 생성자 제공
	// => 생성자를 선언하면 매개변수가 없는 기본 생성자 미제공
	// => 객체 생성시 객체 필드에 원하는 초기값이 저장된 객체를 생성하기 위한 생성자를 선언
	// 형식) 접근제한자 클래스명(자료형 변수명, 자료형 변수명, ...) { 명령; 명령; ... }
	// 반환형(void)을 작성하지 않고 생성자의 이름은 반드시 클래스 이름과 동일하게 작성
	// => 메소드 오버로드를 사용하여 생성자를 여러개 선언 가능
	// => 일반적으로 생성자에서는 필드에 필요한 초기값을 저장하기 위한 명령 작성 - 초기화 작업

	// 매개변수가 없는 생성자 선언 - 기본 생성자(Default Constructor)
	// => 초기화 작업 미구현 - 객체 필드에 기본값이 초기값으로 저장
	// => 기본 생성자를 선언하지 않으면 상속시 문제가 발생할 수 있으므로 기본 생성자를 선언하
	// 이클립스 사용하여 기본 생성자 선언 가능
	// =>[Ctrl} + [Space]

	public Member() {

	}

	// 매개변수가 있는 생성자
	// => 매개변수에 전달되어 저장된 값을 필드의 초기값으로 저장
	// 이클립스를 사용하여 매개변수가 있는 생성자 선언 가능
	// => [Alt] + [Shift] + [S] >> 팝업메뉴 -> [O] >> 필드 선택 >> Generate

	public Member(String id) {
		this.id = id;
	}
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Member(String id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	// 메소드 선언
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// 필드값을 확인하기 위해 필드값을 출력하는 메소드
	public void display() {
		System.out.println("아이디 : " + id);
		System.out.println("이름 : " + name);
		System.out.println("이메일 : " + email);
	}
}
