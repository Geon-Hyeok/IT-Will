package enumerate;

//열거형(EnumerateType) : 상수만을 선언하기 위한 자료형(참조형)
//형식) public enum 열거형명 { 상수명, 상수명, ...; }
// => 열거형의 이름은 파스칼 표기법을 이용하여 작성하는 것을 권장
public enum EnumOne {
	// 상수필드 선언 - public static final int 키워드 생략 가능
	// => 열거형의 상수필드에는 0부터 1씩 증가되는 정수값이 기본값으로 자동 저장
	INSERT, UPDATE, DELETE, SELECT;

	/*
	 ( ) 를 사용해서 값을 부여하려면, 인스턴스 변수와 생성자를 새로 추가해야 한다
	 열거형의 생성자는 묵시적으로 private이므로 외부에서 객체생성 불가
	 따라서 getter 메소드 필요
	
	INSERT(1), UPDATE(2), DELETE(3), SELECT(4);

	private final int su; // 정수를 저장할 필드

	EnumOne(int su) { // 생성자를 추가
		this.su = su;
	}

	public int getSu() {
		return su;
	}
	*/

}
