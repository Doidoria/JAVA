package Ch05;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C04GUI extends JFrame{
	
	C04GUI(String title) {
		//Frame Setting
		super(title);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//Panel Setting
		JPanel panel=new JPanel();
		Color col=new Color(70,130,180); //RGB 값
		panel.setBackground(col);
		panel.setLayout(null);
		
		//Component Setting
		JButton btn1=new JButton("BTN01");
		btn1.setBounds(10,10,100,30);
		JButton btn2=new JButton("BTN02");
		btn2.setBounds(120,10,100,30);
		JTextField txt1=new JTextField();
		txt1.setBounds(10,50,210,30);
		JTextArea area1=new JTextArea();
//		area1.setBounds(10,90,210,350);		//scroll 추가 시 별도 지정x
		JScrollPane scroll1=new JScrollPane(area1);
		scroll1.setBounds(10,90,210,350);
		
		//Panel에 Component 추가
		panel.add(btn1);
		panel.add(btn2);
		panel.add(txt1);
//		panel.add(area1);
		panel.add(scroll1);
		
		//Frame에 Panel 추가
		add(panel);
		
		//Frame 표시 여부 (마지막 처리)
		setVisible(true);
	}
}

public class C04swingMain {

	public static void main(String[] args) {
		new C04GUI("네번째 프레임 창입니다.");
	}

}
