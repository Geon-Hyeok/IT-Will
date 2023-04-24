package xyz.itwill.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// [EXIT] 버튼을 누른 경우 프로그램을 종료하는 기능의 프로그램 작성
// => 이벤트 처리 클래스를 디자인 클래스의 내부 클래스로 작성
// => 이벤트 처리 메소드에서 디자인 클래스의 컴퍼넌트 사용 가능

public class EventInnerHandleApp extends Frame{
	private static final long serialVersionUID = 1L;
	public EventInnerHandleApp (String title) {
	super(title);
	
	setLayout(new FlowLayout());
	Button exit = new Button("EXIT");
	exit.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
	add(exit);
	
	exit.addActionListener(new EventHandle());
	
	setBounds(800, 200, 300, 300);
	setVisible(true);
	
	}
	public static void main(String[] args) {
		new EventInnerHandleApp("이벤트 처리");
	}
	
	// => 내부클래스는(이벤트 처리 클래스) 외부클래스의(디자인 클래스) 필드와 메소드를 
	// 접근제한자에 상관없이 사용 가능
	// 복잡한 GUI 클래스를 만들때는 InnerClass 형태를 사용하는 것을 권장한다.
	public class EventHandle implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
		System.exit(0);
			
		}
		
	}

}
