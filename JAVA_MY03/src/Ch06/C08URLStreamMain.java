package Ch06;

import java.io.BufferedInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.net.URL;

public class C08URLStreamMain {

	public static void main(String[] args) throws Exception{
		URL url=(new URI("https://n.news.naver.com/mnews/article/016/0002520128")).toURL();	//toURL : URL 바꿔주는 함수
		InputStream in=url.openStream();
		
		//보조스트림 추가
		BufferedInputStream buffIn=new BufferedInputStream(in);	//보조스트림(버퍼공간)추가
		Reader rin=new InputStreamReader(buffIn);	//byte->char 변환
		
		Writer fout=new FileWriter("C:\\Users\\Administrator\\Downloads\\IOTEST\\index.html");
		
		int data=0;
		while((data=rin.read())!=-1) {
//			System.out.println((char)data);
			fout.write((char)data);
			fout.flush();
		}
		fout.close();
		rin.close();
		buffIn.close();
		in.close();
		
	}

}
