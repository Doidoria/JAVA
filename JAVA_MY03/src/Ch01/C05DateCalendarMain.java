package Ch01;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class C05DateCalendarMain {

	public static void main(String[] args) {
		//Date
		Date d1=new Date();							//현재 날짜 정보 (옛날 클래스)
		System.out.println(d1);
		System.out.println(d1.getYear()+1900);		//1900을 더해줘야 현재 년도가 나옴
		System.out.println(d1.getMonth()+1);		//0부터 시작(월)
		System.out.println(d1.getDay());			//0-6(일-토)	
		System.out.println(d1.getHours());
		System.out.println(d1.getMinutes());
		System.out.println(d1.getSeconds());
		System.out.println(d1.getTime());			//타임스탬프(HH:mm:ss)
		System.out.println();
		
		//Calendar
		Calendar cal=Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));		//요일
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));		//1~7(일~토)
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println();
		
		//LocalDateTime (주로 사용)
		LocalDateTime now=LocalDateTime.now();
		int year=now.getYear();
		int month=now.getMonthValue();
		int day=now.getDayOfMonth();
		int hour=now.getHour();
		int minute=now.getMinute();
		int secound=now.getSecond();
		DayOfWeek dayOfWeek=now.getDayOfWeek();
		
		//결과출력
		System.out.println("연: "+year);
		System.out.println("월: "+month);
		System.out.println("일: "+day);
		System.out.println("시: "+hour);
		System.out.println("분: "+minute);
		System.out.println("초: "+secound);
		System.out.println("요일: "+dayOfWeek);
	}

}
