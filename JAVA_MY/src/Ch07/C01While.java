package Ch07;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		// 10번반복 - "HELLO WORLD"
		// 탈출용 변수 : i=0
		// 탈출용 조건식 : i<10
		// 탈출용 연산식 : i++
		//while(조건식) {
		//	조건식이 true 인동안 실행되는 종속문장
		//}

		
		//01 기본 - HELLO WORLD 10회 반복
//		int i=0;
//		while(i<=10) {
//			System.out.println("Hello World");
//			i++;
//		}
		
		
		//02 기본 - HELLO WORLD N회 반복
//		System.out.println("반복할 횟수 입력 : ");
//		int num=sc.nextInt();
//		int i=0;
//		while(i<=num) {
//			System.out.println("Hello World");
//			i++;
//		}
		
		
		//03 기본 - 1부터 10까지의 합
//		int i=0, sum=0;
//		while(i<=10) {
//			i++;
//			sum+=i;
//		}
//		System.out.println("1~10까지의 합 : "+sum);
		
		
		//04 기본 - 1부터 N까지 합
//		System.out.println("1~N까지 합 (N)입력 : ");
//		int num=sc.nextInt();
//		int i=0, sum=0;
//		while(i<=num) {
//			i++;
//			sum+=i;
//		}
//		System.out.printf("1~%d까지의 합 : %d",num,sum);
		
		
		//05 기본 - N부터 M까지 합(N<M) - N>=M 인경우 N과 M을 Swap하고 진행합니다
//		System.out.println("시작 수 입력 : ");
//		int st=sc.nextInt();
//		System.out.println("끝 수 입력 : ");
//		int sp=sc.nextInt();
//		int i=st,sum=0;
//		
//		if(st>sp) {
//			int n=st;
//			st=sp;
//			sp=n;
//		}
//		while(i<=sp) {
//			sum+=i;
//			i++;
//		}
//		System.out.printf("%d~%d까지의 합 : %d",st,sp,sum);
		
		
		//06 N - M까지 수중(N<M) 짝수의합, 홀수의 합을 각각 구해서 출력하세요
		//예시)
		//n= 3(키보드로 입력된 값)
		//m = 7(키보드로 입력된 값)
		//짝수의 합 : 10
		//홀수의 합 : 15
		
//		System.out.println("N 입력 : ");
//		int n=sc.nextInt();
//		System.out.println("M 입력 : ");
//		int m=sc.nextInt();
//		int i=n, sum1=0, sum2=0;
//		
//		while(i<=m) {
//			if(i%2==0) {
//				sum1+=i;
//			}
//			else {
//				sum2+=i;
//			}
//			i++;
//		}
//		System.out.printf("%d~%d사이의 짝수의 합 : %d\n",n,m,sum1);
//		System.out.printf("%d~%d사이의 홀수의 합 : %d",n,m,sum2);
		
		
		//07 1 - N 까지 수중에 4의 배수를 출력하고 4의배수가 아닌 나머지의 합을 구하세요.
//		System.out.println("N 입력 : ");
//		int n=sc.nextInt();
//		int i=0, sum=0;
//		
//		while(i<=n) {
//			if(!(i%4==0)) sum+=i;
//			i++;
//		}
//		System.out.printf("1~%d사이에서 4의 배수가 아닌 나머지의 합 : %d\n",n,sum);
		
		
		//08 구구단 N단을 출력합니다(2<=N<=9)
//		System.out.println("몇단의 구구단을 출력할건가? : ");
//		int n=sc.nextInt();
//		int i=1;
//		
//		while(n<2 || n>9) {
//			System.out.printf("2~9단까지만 가능합니다.\n몇단의 구구단을 출력할건가? : ");
//			n=sc.nextInt();
//		}
//		while(i<10) {
//			System.out.printf("%dx%d=%d\n",n,i,n*i);
//			i++;
//		}
		
		sc.close();
		
		
	}

}
