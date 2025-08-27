package Ch06;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C04FileCopyMain {

	public static void main(String[] args) throws IOException {
		Reader fin=new FileReader("C:\\Users\\Administrator\\Downloads\\IOTEST\\origin.txt");
		int data=0;
		
		StringBuffer strBuffer=new StringBuffer();
		char[] buf=new char[4096]; //1024byte : 성능향상 버퍼 (한번에 읽어낼 단위 배열 만듬)
		
		long startTime=System.currentTimeMillis();
		while((data=fin.read(buf))!=-1) {
//			strBuffer.append((char)data);
			strBuffer.append(buf);
		}
		System.out.println("총길이 : "+strBuffer.length());
		long endTime=System.currentTimeMillis();
		System.out.println();
		System.out.println("소요시간 : "+(endTime-startTime)+"ms");
		
		fin.close();

	}

}
