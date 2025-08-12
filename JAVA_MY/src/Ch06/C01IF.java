package Ch06;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//-----------------------
		//단순 IF	
		//-----------------------
//		System.out.println("나이 : ");
//		int age=sc.nextInt();
//		if(age>=8)
//			System.out.println("학교에 다닙니다.");
//		
//		System.out.println("첫번째 IF 코드 블럭 종료..");
//		
//		if(age<8)
//			System.out.println("학교에 다니지 않습니다.");
//		
//		System.out.println("두번째 IF 코드 블럭 종료..");
//		System.out.println("프로그램을 종료합니다.");
		
		
		//-----------------------
		//IF-ELSE	
		//-----------------------
		
//		System.out.println("나이 : ");
//		int age=sc.nextInt();
//		
//		if(age>=8)
//			System.out.println("학교에 다닙니다.");
//		else
//			System.out.println("학교에 다니지 않습니다.");
//		
//		System.out.println("프로그램을 종료합니다.");

		
		//-----------------------
		//1 문제
		//-----------------------
		// 정수 한개값을 입력받아 3의 배수이면 해당 수를 출력하세요
		// 3의 배수이면서 5의 배수라면 출력 - 
		// 순서도도 그려보세요 - 
		
//		System.out.println("정수 한개 입력 : ");
//		int num=sc.nextInt();
//		
//		if(num%3==0 && num%5==0)
//			System.out.println(num);
//		else
//			System.out.println("X");
		
		//-----------------------
		//2 문제
		//-----------------------
		// 두개의 정수를 입력받아 큰 수 출력
		
//		System.out.println("정수 두개 입력 : ");
//		int n1=sc.nextInt();
//		int n2=sc.nextInt();
//		
//		if(n1>n2)
//			System.out.println(n1);
//		else
//			System.out.println(n2);
		
		
		//-----------------------
		//3 문제(☆)
		//-----------------------
		// 세 개의 정수를 입력받아 큰 수 출력
		
//		System.out.println("정수 세개 입력 : ");
//		int n1=sc.nextInt();
//		int n2=sc.nextInt();
//		int n3=sc.nextInt();
//		
//		if(n1>n2 && n1>n3)
//			System.out.println(n1);
//		else if(n2>n1 && n2>n3)
//			System.out.println(n2);
//		else if(n3>n1 && n3>n2)
//			System.out.println(n3);
//
//		int max=n1;
//		if(max<n2)
//			max=n2;
//		if(max<n3)
//			max=n3;
//		System.out.println("가장 큰 수는 "+max);
		
		
		//-----------------------
		//4 문제
		//-----------------------
		// 세개의 정수를 입력받아 해당수의 합과 평균을 출력
		
//		System.out.println("정수 세개 입력 : ");
//		int n1=sc.nextInt();
//		int n2=sc.nextInt();
//		int n3=sc.nextInt();
//		int sum=n1+n2+n3;
//		double avg=(double)(sum/3);
//		
//		System.out.printf("합 : %d, 평균 : %.1f",sum,avg);
		
		
		//-----------------------
		//5 문제
		//-----------------------
		//입력한 수가 짝수이고, 3의 배수라면 출력 (n%2==0 && n%3==0)
		//입력한 수가 홀수이고, 5의 배수라면 출력 (n%2==1 && n%5==0)
		
//		System.out.println("정수 입력 : ");
//		int n1=sc.nextInt();
//		
//		if(n1%2==0 && n1%3==0)
//			System.out.println("짝수이면서 3의 배수 입니다.");
//		else if(n1%2==1 && n1%5==0)
//			System.out.println("홀수이면서 5의 배수 입니다.");
//		else
//			System.out.println("둘다 아닙니다.");
		
		
		//-----------------------
		//IF - ELSE IF - ELSE
		//-----------------------
		//과목1,2,3,4 중 하나라도 40점 미만이면 불합격
		//과목평균이 100점만점 기준으로 60점 미만이면 불합격
		//아니면 합격
		
//		System.out.println("과목 네개 점수 입력 : ");
//		int n1=sc.nextInt();
//		int n2=sc.nextInt();
//		int n3=sc.nextInt();
//		int n4=sc.nextInt();
//		double avg=(double)(n1+n2+n3+n4)/4;
//		
//		if(n1<40 || n2<40 || n3<40 || n4<40 || avg<60)
//			System.out.println("불합격");
//		else
//			System.out.println("합격");
		
		
//		int[] scores = {n1, n2, n3, n4};
//		boolean fail = false;
//
//		for (int s : scores) {
//		    if (s < 40) {
//		        fail = true;
//		        break;
//		    }
//		}
//
//		if (avg < 60) fail = true;
//
//		System.out.println(fail ? "불합격" : "합격");
		
		
		//-----------------------
		//7 문제
		//-----------------------
		//시험 점수를 입력받아 
		//90 ~ 100점은 A, 
		//80 ~ 89점은 B, 
		//70 ~ 79점은 C, 
		//60 ~ 69점은 D, 
		//나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		
//		System.out.println("시험 점수 입력 : ");
//		int num=sc.nextInt();
//		
//		if(num>=90)
//			System.out.println("A");
//		else if(num>=80)
//			System.out.println("B");
//		else if(num>=70)
//			System.out.println("C");
//		else if(num>=60)
//			System.out.println("D");
//		else
//			System.out.println("F");
		
		//-----------------------
		//8 문제
		//-----------------------
		//나이별로 요금을 부과하는 else if 문을 만드세요
		//8세 미만  : 요금은 1000원
		//14세미만 : 요금은 2000원
		//20세미만 : 요금은 2500원
		//20세이상 : 요금은 3000원
		
//		System.out.println("나이 입력 : ");
//		int num=sc.nextInt();
//		
//		if(num<8)
//			System.out.println("요금은 1000원");
//		else if(num<14)
//			System.out.println("요금은 2000원");
//		else if(num<20)
//			System.out.println("요금은 2500원");
//		else
//			System.out.println("요금은 3000원");
		
		
		sc.close();
		
	}

}
