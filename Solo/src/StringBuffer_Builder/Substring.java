package StringBuffer_Builder;

// sb.substring(index,index);
// -> 인덱스부터 인덱스까지 값을 잘라온다

public class Substring {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello Java");
		System.out.println(sb.substring(2,5));
	}

}
