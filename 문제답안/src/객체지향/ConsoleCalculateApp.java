package 객체지향;

import java.util.InputMismatchException;
import java.util.Scanner;

//키보드로 사칙 연산식을 입력받아 연산결과를 계산하여 출력하는 프로그램 작성
//ex) 연산식 입력 >> 20 + 10
//    [결과]30
// => 입력 연산식에서 사용 가능한 연산자는 사칙 연산자(*,/,+,-)만 허용
// => 형식에 맞지 않는 연산식이 입력된 경우 에러 메세지 출력 후 프로그램 종료
// => 입력 연산식에 공백 입력이 가능하도록 처리
public class ConsoleCalculateApp {

	public static void Calc() {
		Scanner scanner = new Scanner(System.in);
		int value;
		System.out.println("연산식 입력");
		int num1 = scanner.nextInt();
		String giho = scanner.next();
		int num2 = scanner.nextInt();

		if (giho.equals("+")) {
			value = num1+num2;
			System.out.println("[결과]" + (num1 + num2));
		} else if (giho.equals("-")) {
			value = num1-num2;
			System.out.println("[결과]" + (num1 - num2));
		} else if (giho.equals("/")) {
			value = num1/num2;
			System.out.println("[결과]" + (num1 / num2));
		} else if (giho.equals("*")) {
			value = num1*num2;
			System.out.println("[결과]" + (num1 * num2));
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			Calc();
		} catch (ArithmeticException e) {
			System.out.println("사칙 연산자 입력 오류");
		} catch (InputMismatchException e) {
			System.out.println("입력값 오류");
		} catch (Exception e) {
			System.out.println("[에러] 프로그램에 예기치 못한 오류가 발생되었습니다.");
		}
	}
}
