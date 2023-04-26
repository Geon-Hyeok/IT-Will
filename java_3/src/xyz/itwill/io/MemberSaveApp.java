package xyz.itwill.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// 회원정보(Member 객체)를 파일에 전달하여 저장하는 프로그램 작성
public class MemberSaveApp {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c:/data/member.txt"));

		// out.writeObject(Object o) 메소드 호출시 NotSerializableException 발생
		// NotSerializableException : 객체 직렬화 처리되지 않은 클래스의 객체를 출력스트림으로
		// 전달할 경우 발생되는 예외
		// => 출력스트림으로 전달될 객체의 클래스를 객체 직렬화 처리하면 예외 미발생
		out.writeObject(new Member("abc123", "홍길동", "010-1234-5678"));
		out.writeObject(new Member("def456", "임꺽정", "010-4321-8282"));
		out.writeObject(new Member("afaf1414", "전우치", "010-9876-5417"));

		out.close();

		System.out.println("c:\\data\\object.txt 파일에 회원정보를 저장하였습니다");
	}
}
