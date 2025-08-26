package Ch05;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C06GUI extends JFrame implements ActionListener{
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton input;
	C06GUI(String title) {
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
		btn1=new JButton("파일로 저장");
		btn1.setBounds(350,10,120,40);
		btn2=new JButton("1:1요청");
		btn2.setBounds(350,60,120,40);
		btn3=new JButton("대화기록보기");
		btn3.setBounds(350,110,120,40);
		input=new JButton("입력");
		input.setBounds(350,320,120,40);
		
		//event listener add (이벤트 처리)
		btn1.addActionListener(this);		//리스너의 감시 항목 추가
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		input.addActionListener(this);
		
		panel.add(scroll1);
		panel.add(txt1);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(input);
		
		add(panel);
		
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("클릭!");
		if(e.getSource()==btn1) {
			System.out.println("파일로 저장 클릭");
		} else if(e.getSource()==btn2) {
			System.out.println("1:1요청 클릭");
		} else if(e.getSource()==btn3) {
			System.out.println("대화기록보기");
		} else if(e.getSource()==input) {
			System.out.println("입력");
		}
		
	}
}

public class C06SwingEventMain {

	public static void main(String[] args) {
		new C06GUI("Chatting Server");
	}

}
