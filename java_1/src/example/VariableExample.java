
package example;

public class VariableExample {
	public static void main(String[] args) {
		//가로의 길이가 7이고 세로의 길이가 10인 사각형의 넓이를 계산하여 출력하세요.
		int garo=7, sero=10;
		int nulbe=garo*sero;
		System.out.println("사각형의 넓이 = "+nulbe);
		System.out.println("======================================================");
		//높이가 9이고 밑변의 길이가 7인 삼각형의 넓이를 계산하여 출력하세요.
		
		int 높이 = 9, 밑변 = 7;
		double 넓이 = (높이*밑변)/2.0;
		
		System.out.println("삼각형의 넓이 : " + 넓이);


		System.out.println("======================================================");
		//10명의 전체 몸무게가 759Kg인 경우 평균 몸무게를 계산하여 출력하세요.
		
		int 인원 = 10, 전체몸무게 = 759;
		double 평균몸무게 = (double)전체몸무게/인원;
		
		System.out.println("평균 몸무게 : " + 평균몸무게+"kg");


		System.out.println("======================================================");
		//이름이 [홍길동]인 학생이 국어점수 89점, 영어점수 93점, 수학점수 95점을 받은 경우
		//총점과 평균을 계산하여 이름, 총점, 평균을 출력하세요.
		//단, 평균은 소숫점 한자리까지만 출력하고 나머지는 절삭 처리 하세요.
		
		String name = "홍길동";
		int 국어 = 89, 영어 = 93, 수학 = 95;
		int 총점 = 국어+영어+수학;
		double 평균 = 총점/3.0;
		
		System.out.println(name + ": " + "총점 : " + 총점+"점, " + "평균 : " + (int)(평균*10)/10.0+"점");


		System.out.println("======================================================");
	}
}
