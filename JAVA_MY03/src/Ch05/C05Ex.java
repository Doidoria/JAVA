package Ch05;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C05GUI extends JFrame{
	C05GUI(String title) {
		super(title);
		setBounds(100,100,500,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel=new JPanel();
		panel.setLayout(null);
		Color color=new Color(70,130,180);
		panel.setBackground(color);
		
		JTextArea area1=new JTextArea();
		JScrollPane scroll1=new JScrollPane(area1);
		scroll1.setBounds(10,10,320,300);
		JTextField txt1=new JTextField();
		txt1.setBounds(10,320,320,40);
		JButton btn1=new JButton("파일로 저장");
		btn1.setBounds(350,10,120,40);
		JButton btn2=new JButton("1:1요청");
		btn2.setBounds(350,60,120,40);
		JButton btn3=new JButton("대화기록보기");
		btn3.setBounds(350,110,120,40);
		JButton btn4=new JButton("입력");
		btn4.setBounds(350,320,120,40);
		
		panel.add(scroll1);
		panel.add(txt1);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		
		add(panel);
		
		setVisible(true);
	}
}

public class C05Ex {

	public static void main(String[] args) {
		new C05GUI("Chatting Server");
	}

}
