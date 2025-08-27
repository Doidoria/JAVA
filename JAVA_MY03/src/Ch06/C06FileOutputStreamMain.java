package Ch06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class C06FileOutputStreamMain {

	public static void main(String[] args) throws IOException {
		OutputStream out=new FileOutputStream("C:\\Users\\Administrator\\Downloads\\IOTEST\\test1.txt");
		out.write("가나다".getBytes(StandardCharsets.UTF_8));
		out.write('a');	//"byte"단위지만 문자 하나인 "a"는 아스키코드로 인수로 출력가능하기 때문에 가능하다.
		out.write('b');
		out.write('c');
		out.flush();
		out.close();
	}

}
