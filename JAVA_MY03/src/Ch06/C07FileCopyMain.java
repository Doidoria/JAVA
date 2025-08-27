package Ch06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class C07FileCopyMain {

	public static void main(String[] args) throws IOException {
		InputStream in=new FileInputStream("C:\\Users\\Administrator\\Downloads\\IOTEST\\eclipse.zip");
		OutputStream out=new FileOutputStream("C:\\Users\\Administrator\\Downloads\\IOTEST\\Copy-eclipse.zip");
		int data=0;
		
		//01 버퍼미사용
//		System.err.println("진행중 - ");
//		while((data=in.read())!=-1) {
//			out.write(data);
//			out.flush();
//		}
//		in.close();
//		out.close();
//		System.err.println("진행완료!");
		
		//02 버퍼사용
		System.err.println("진행중(버퍼) - ");
		byte[] buf=new byte[4096];
		while((data=in.read(buf))!=-1) {
			out.write(buf,0,data);
			out.flush();
		}
		in.close();
		out.close();
		System.err.println("진행완료!");
	}

}
