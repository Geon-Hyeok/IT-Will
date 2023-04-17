package 절차지향;

public class OperatorExample {
	public static void main(String[] args) {
		//245678초를 일시분초 형식으로 변환하여 출력하세요.
		
		  int totalSeconds = 245678;
	        int days = totalSeconds / 86400;
	        int hours = (totalSeconds % 86400) / 3600;
	        int minutes = (totalSeconds % 3600) / 60;
	        int seconds = totalSeconds % 60;
	        
	        System.out.println(days + "일 " + hours + "시간 " + minutes + "분 " + seconds + "초" );
	        
	 


		System.out.println("===============================================");
		//한대의 가격이 1억 5천원만인 비행기를 20대 구매할 경우 지불해야될 금액을 계산하여 출력하세요. 
		//단, 15대 이상 구매할 경우 1대당 25%의 할인율을 적용하여 계산하세요.
		
		int cnt = 20;
		int price = 150000000;
		long cost = (long)(cnt>=15?cnt*0.75:cnt)*price;
		System.out.println(cost);
		
		System.out.println("===============================================");
	}
}