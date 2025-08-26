package Ch05;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

class C07GUI extends JFrame implements ActionListener,KeyListener,MouseListener{
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton input;
	JTextField txt1;
	JTextArea area1;
	C07GUI(String title) {
		super(title);
		setBounds(100,100,500,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel=new JPanel();
		panel.setLayout(null);
		Color color=new Color(70,130,180);
		panel.setBackground(color);
		
		area1=new JTextArea();
		JScrollPane scroll1=new JScrollPane(area1);
		scroll1.setBounds(10,10,320,300);
		txt1=new JTextField();
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
		txt1.addKeyListener(this);
		area1.addMouseListener(this);
		
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
	
	@Override
	public void keyTyped(KeyEvent e) {		//키 눌렀다가 뗏을때
//		System.out.println("keyTyped..."+e.getKeyChar());
//		System.out.println("keyTyped..."+e.getKeyCode());
		
	}

	@Override
	public void keyPressed(KeyEvent e) {	//키 누를때
		if(e.getSource()==txt1) {
			if(e.getKeyCode()==10) {		//"enter"키 누를때 true
				String message=txt1.getText();
				System.out.println(message);
				area1.append(message+"\n");	//입력될때 자동 줄바꿈
				txt1.setText("");			//입력된 저장공간 내용 제거
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {	//키 뗏을때
//		System.out.println("keyTyped..."+e.getKeyChar());
//		System.out.println("keyTyped..."+e.getKeyCode());
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		try {
			int offset=area1.viewToModel(e.getPoint());
//			System.out.println("mouseClicked..offset"+e.getPoint());
			int row=area1.getLineOfOffset(offset);			// 행 번호
			int startOffset=area1.getLineStartOffset(row);	// 시작 번호(값)
			int endOffset=area1.getLineEndOffset(row);		// 끝 번호(값)
//			System.out.printf("%d %d\n", startOffset,endOffset);
			String str=area1.getText(startOffset,endOffset-startOffset);	// 시작번호 ~ 끝번호(문자열 길이)
			System.out.println(str);
		}catch(BadLocationException e1) {
			e1.printStackTrace();
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

public class C07SwingEventMain {

	public static void main(String[] args) {
		new C07GUI("Chatting Server");
	}

}
