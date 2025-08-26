package Ch05;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

class C03GUI extends JFrame{
	
	C03GUI(String title) {
		//Frame Setting
		super(title);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//Panel Setting
		JPanel panel=new JPanel();
		Color col=new Color(70,130,180); //RGB 값
		panel.setBackground(col);
		add(panel); //Frame Panel 추가
	}
}

public class C03swingMain {

	public static void main(String[] args) {
		new C03GUI("세번째 프레임 창입니다.");
	}

}
