package Ch06;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C01WriteMain {

	public static void main(String[] args) throws IOException {
//		Writer fout=new FileWriter("c:\\IOTEST\\test2.txt"); //false = 내용 덮어쓰기
		Writer fout=new FileWriter("C:\\Users\\Administrator\\Downloads\\IOTEST\\test1.txt",true); //true = 내용 추가하기
		fout.write("TEST1\n");
		fout.write(1234+"\n");
		fout.write("TEST3\n");
		fout.write(5678+"\n");

		fout.flush();	//중간중간에 데이터를 담는 작업
		fout.close();
	}

}
