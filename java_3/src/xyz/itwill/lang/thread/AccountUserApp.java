package xyz.itwill.lang.thread;

// 다중 스레드 프로그램의 문제점
// => 다수의 스레드가 run() 메소드의 명령을 실행할 경우 같은 객체의 메소드를 호출하여
// 필드값(공유값)을 변경할 경우 잘못된 처리결과 발생 가능
// 해결법) 스레드 동기화를 이용하여 스레드에 대한 메소드 호출 제어

// 스레드 동기화(Thread Synchronize) : 스레드에 메소드 호출시 메소드의 모든 명령을 실행하기 전까지
// 다른 스레드로 메소드를 호출하지 못하도록 방지하는 기능
// => 다른 스레드가 이미 메소드를 호출하여 실행중인 경우 스레드를 일시 중지하여 기존 스레드의
// 메소드 처리가 끝난 후 일시 중지된 스레드가 실행되도록 락(Lock) 기능 제공

// 스레드 동기화 처리방법
// 1. synchronized 키워드를 사용하여 메소드 선언 - 동기화 메소드(Synchronized Method)
// 형식) 접근제한자 synchronized 반환형 메소드명(자료형 매개변수, ... ) { 명령; ... }
// 2. synchronized 키워드로 블럭을 설정하여 메소드 호출
// 형식) synchronized(객체) { 객체.메소드명(값, ...); }
// => synchronized 영역의 객체로 호출되는 모든 메소드는 동기화 처리되어 실행

public class AccountUserApp {
	public static void main(String[] args) {
		// Account 클래스로 객체를 생성하여 저장 - 은행계좌 생성
		Account account = new Account(10000); // 잔액 : 10,000원

		/*
		// 단일 스레드(main)를 이용하여 AccountUser 클래스로 객체 생성해 저장
		// => 은행계좌를 사용하는 사용자를 여러개 생성하여 같은 은행계좌를 사용하도록 설정
		AccountUser one = new AccountUser(account, "홍길동");
		AccountUser two = new AccountUser(account, "임꺽정");
		AccountUser three = new AccountUser(account, "전우치");
		
		// 단일 스레드(main)를 이용하여 모든 은행계좌 사용자를 이용한 은행계좌의 입금처리
		one.getAccount().deposit(one.getUserName(), 5000); // 잔액 : 15,000원
		two.getAccount().deposit(two.getUserName(), 5000); // 잔액 : 20,000원
		three.getAccount().deposit(three.getUserName(), 5000); // 잔액 : 25,000원
		*/
		
		// (다중 스레드) 스레드를 여러개 생성하여 동시에 입금/출금 처리
		// 스레드가 생성되어 run() 메소드의 명령 실행
		new AccountUser(account, "홍길동").start();
		new AccountUser(account, "임꺽정").start();
		new AccountUser(account, "전우치").start();
		
		/*	[결과]
		 * [입금 알림]임꺽정님이 5000원 입금하여 잔액은 20000원입니다 
		 * [입금 알림]홍길동님이 5000원 입금하여 잔액은 20000원입니다
		 * [입금 알림]전우치님이 5000원 입금하여 잔액은 25000원입니다
		 * -> 이런 결과값을 방지하기 위해 synchronized 사용
		 */
		


	}
}
