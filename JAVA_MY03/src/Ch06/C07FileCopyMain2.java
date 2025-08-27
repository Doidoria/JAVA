package Ch06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class C07FileCopyMain2 {
	
	private static String PATH="C:\\Users\\Administrator\\Downloads\\IOTEST\\";

	public static void main(String[] args) throws IOException {
		InputStream in=new FileInputStream(PATH+args[0]);
		OutputStream out=new FileOutputStream(PATH+args[1]);
		int data=0;
		
		while((data=in.read())!=-1) {
			out.write((char)data);
			out.flush();
		}
		
		in.close();
		out.close();
	}

}
