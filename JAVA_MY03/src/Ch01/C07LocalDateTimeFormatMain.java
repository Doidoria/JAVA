package Ch01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//★중요★
public class C07LocalDateTimeFormatMain {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("YYYY/MM/DD 입력 : ");
//		String ymd=sc.next();
//
//		// 입력용 포매터
//		DateTimeFormatter fmtin=DateTimeFormatter.ofPattern("yyyy/MM/dd");
//		
//		// 문자열을 LocalDate로 변환
//		LocalDate date=LocalDate.parse(ymd,fmtin);
//		System.out.println("입력된 날짜 : "+date);
//		
//		//출력용 포매터
//		DateTimeFormatter outputFormatter=DateTimeFormatter.ofPattern("yyyy.MM.dd");
//		
//		// 포맷 변경 후 출력
//		System.out.println("변환된 날짜 : "+date.format(outputFormatter));
//
//		sc.close();
		
		// 날짜시간 포매팅
		Scanner sc = new Scanner(System.in);
		System.out.print("YYYY/MM/DD HH:MM:SS 입력 : ");
		String ymd = sc.nextLine(); // 날짜 문자열 입력
		
		//입력용 포매터
		DateTimeFormatter fmtin=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		
		//문자열을 LocalDate로 변환
		LocalDateTime datetime=LocalDateTime.parse(ymd,fmtin);
		System.out.println("입력된 날짜/시간 : "+datetime);
		
		//출력용 포매터
		DateTimeFormatter outputFormatter=DateTimeFormatter.ofPattern("yyyy.MM.dd HH시mm분ss초");
		
		//포맷 변경 후 출력
		System.out.println("변환된 날짜/시간 : "+datetime.format(outputFormatter));
		
		sc.close();
	}

}
