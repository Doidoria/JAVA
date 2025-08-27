package Ch06;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.UUID;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class C09JsoupMain {

	public static void main(String[] args) throws IOException, URISyntaxException {
		//URL 연결
		Connection conn=
		Jsoup.connect("https://op.gg/lol/champions")	//크롤링할 URL 지정
			 .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36")		
			 					//↑ 브라우저 정보 개발자모드 Network (현대자동차)
			 .timeout(5000)		//5초 대기
			 .ignoreHttpErrors(true)
			 .followRedirects(true);
		
		//DOM 객체 받기
		Document document=conn.get();
//		System.out.println(document);
		Elements elements=document.getElementsByTag("img");		//요소중에 이미지 태그만(html)
		System.out.println("총 img size : "+elements.size());
		
		for(Element el : elements) {
//			System.out.println(el);
			String img_url=el.getElementsByAttribute("src").attr("src");	// attr() : 문자열 값만 추출
			System.out.println(img_url);
			
			URL url=(new URI(img_url)).toURL();	//toURL : URL 바꿔주는 함수
			InputStream in=url.openStream();
			
			//보조스트림 추가
			BufferedInputStream buffIn=new BufferedInputStream(in);	//보조스트림(버퍼공간)추가
			
			OutputStream out=null;
			if(img_url.contains(".png"))
				out=new FileOutputStream("C:\\Users\\Administrator\\Downloads\\IOTEST\\"+UUID.randomUUID()+".png");	//png 확장자로 변경
			else if(img_url.contains(".svg"))
				out=new FileOutputStream("C:\\Users\\Administrator\\Downloads\\IOTEST\\"+UUID.randomUUID()+".svg");	//png 확장자로 변경
			else if(img_url.contains(".webp"))
				out=new FileOutputStream("C:\\Users\\Administrator\\Downloads\\IOTEST\\"+UUID.randomUUID()+".webp");	//png 확장자로 변경
			else if(img_url.contains(".jpg"))
				out=new FileOutputStream("C:\\Users\\Administrator\\Downloads\\IOTEST\\"+UUID.randomUUID()+".jpg");	//png 확장자로 변경
			
			
			int data=0;
			while((data=buffIn.read())!=-1) {
				out.write((byte)data);
				out.flush();
			}
			out.close();
			buffIn.close();
			in.close();
		}
	}

}
