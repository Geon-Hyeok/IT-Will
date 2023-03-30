package StringBuffer_Builder;

// sb.replace(인덱스, 인덱스, 값)
// -> 인덱스부터 인덱스까지 값으로 변경

public class Replace {

	public static void main(String[] args) {
			StringBuilder sb = new StringBuilder("Hello Java");
			
			sb.replace(2, 5, "asdf");
		
			System.out.println(sb);
			
			
		}
	}

	


