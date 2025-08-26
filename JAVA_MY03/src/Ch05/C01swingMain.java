package Ch05;

import javax.swing.JFrame;

public class C01swingMain {

	public static void main(String[] args) {
		JFrame frame=new JFrame("첫번째 프레임입니다.");
		frame.setBounds(100, 100, 500, 500);	//x, y, width, height
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	//닫기(X) 버튼 누를때 (백그라운드)종료
		frame.setVisible(true);
	}

}
