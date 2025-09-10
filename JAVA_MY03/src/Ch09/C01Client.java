package Ch09;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class C01Client {

	public static void main(String[] args) throws IOException {
		Socket client=new Socket("192.168.5.50",7000);	//IP:192.168.5.50 (강사PC)
		
		InputStream in=client.getInputStream();
		DataInputStream din=new DataInputStream(in);
		String recv=din.readUTF();
		System.out.println(recv);
		
		din.close();
		in.close();
		client.close();
	}
}
