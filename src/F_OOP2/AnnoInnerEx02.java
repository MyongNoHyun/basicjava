package F_OOP2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AnnoInnerEx02 {
	public static void main(String[] args) {
		Button b = new Button();
		
		b.addActionListener(new ActionListener() {//컨트롤 스페이스바 인터페인스 이름이없는 클래스 익명클래스
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼눌림");
				
			}
		});
		
		
		
	}
}
