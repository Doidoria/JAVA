package Ch06;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C05FileInputStreamMain {

	public static void main(String[] args) throws IOException {
		InputStream fin=new FileInputStream("C:\\Users\\Administrator\\Downloads\\IOTEST\\openjdk.zip");
		int data=0;
		
		StringBuffer strBuffer=new StringBuffer();
		
		byte [] buf2=new byte[4096];
		long sTime=System.currentTimeMillis();
		while((data=fin.read(buf2))!=-1) {
			strBuffer.append((char)data);
//			strBuffer.append(new String(buf2,0,data));
		}
		long eTime=System.currentTimeMillis();
		System.out.println("소요시간 : "+(eTime-sTime)+"ms");
		
		fin. close();

	}

}
