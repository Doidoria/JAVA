package Ch09;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class C01Server {
	
	public static void main(String[] args) throws IOException {
		//서버 소켓 생성
		ServerSocket server=new ServerSocket(7000); //IP:192.168.5.50 POPT : 7000
		System.out.println("[INFO] SERVER SOCKET LISTENING");
		
		Socket client=server.accept();		//1회 허용(접속)
		OutputStream out=client.getOutputStream();
		DataOutputStream dout=new DataOutputStream(out);
		dout.writeUTF("[SERVER] WELCOM TO SERVER +"+new Date());
		dout.flush();
		
		dout.close();
		out.close();
		client.close();
		server.close();
		System.out.println("[INFO] SERVER EXIT");
		
		
	}
}
