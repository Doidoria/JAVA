package Ch06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C02ReaderMain {

	public static void main(String[] args) throws IOException {
		Reader fin=new FileReader("C:\\Users\\Administrator\\Downloads\\IOTEST\\test1.txt");
		int data=0;
		
//		while(true) {
//			data=fin.read();		//read() : 유니코드문자 형태로 변환하기 때문에 캐릭터형(char)으로 형변환 해야함.
//			if(data==-1)			//-1 : 더 이상 읽을 문자가 없다.
//				break;
//			System.out.println((char)data);
//		}
		
		StringBuffer buffer=new StringBuffer();
		while((data=fin.read())!=-1) {			
			System.out.println((char)data); 	
			buffer.append((char)data);
		}
		System.out.println();
		System.out.println(buffer);
		
		fin.close();
	}

}
