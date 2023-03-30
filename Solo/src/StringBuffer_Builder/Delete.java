package StringBuffer_Builder;

// sb.indexOf(값)
// -> 값이 어느 인덱스에 들어있는지 확인한다

public class Delete {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello Java");
		
		System.out.println(sb.indexOf("a"));
	}
}