package 문제답안;

import java.util.Scanner;

//키보드로 정수값을 입력받아 1~9 범위의 정수값을 곱한 결과를 출력하는 프로그램을 작성하세요.
//단,키보드로 입력된 정수값은 2~9 범위의 정수값만 허용하면 범위를 벗어난 정수값을 입력한 경우
//에러 메세지 출력 후 재입력하도록 프로그램 작성
//ex) 단 입력[2~9] >> 7
//    7 * 1 = 7
//    ...
//    7 * 9 = 63

 public class GuGuDanExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		라벨: for(int dan = 2; dan<10; dan++) {
//			System.out.println("단 입력[2~9] >> ");
//			dan = scanner.nextInt();
//			if(dan > 9 || dan < 2) {
//				System.out.println("허용하는 범위를 벗어난 정수값을 입력했습니다");
//				continue 라벨;
//			}
//			for(int b = 1; b<10; b++) {
//				System.out.println(dan + " * " + b + " = " + dan*b);
//				
//			}break;
//	       
//		}scanner.close();
		
		int dan;
		while(true) { // 키보드로 정수값을 입력받기 위한 반복문 - 무한루프
			System.out.println("단 입력[2~9] >> ");
			dan=scanner.nextInt();
			if(dan>=2 && dan <= 9) break; // 정상적인 값이 입력된 경우 반복문 종료
			System.out.println("[에러] 허용하는 범위를 벗어난 정수값을 입력했습니다");
		}
		for(int b =1; b<=9; b++) {
			System.out.println(dan + " * " + b + " = " + dan*b);
		}
		scanner.close();
	}
 }
	
 
 
