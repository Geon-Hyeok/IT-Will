package StringBuffer_Builder;

// sb.append(값)
// ->StringBuffer, StringBuilder 뒤에 값을 붙인다

public class Append_Insert {
		public static void main(String[] args) {
			StringBuilder sb = new StringBuilder();
		    
		    sb.append("Hello .Welcome to Java.");
		    sb.insert(6, "Jon");

		    System.out.println(new String(sb));
		  }
}

	

