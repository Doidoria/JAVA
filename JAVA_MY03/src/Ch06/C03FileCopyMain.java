package Ch06;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class C03FileCopyMain {
	
	private static String PATH="C:\\Users\\Administrator\\Downloads\\IOTEST\\";

	public static void main(String[] args) throws IOException {
		for(String arg : args)
			System.out.println(arg);
		
		Reader fin=new FileReader(PATH+args[0]); 	//원본파일
		Writer fout=new FileWriter(PATH+args[1]);	//대상파일

		int data=0;
		while((data=fin.read())!=-1) {
			fout.write((char)data);
			fout.flush();
		}
		
		fin.close();
		fout.close();
	}

}
