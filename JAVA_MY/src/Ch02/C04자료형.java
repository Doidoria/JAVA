package Ch02;

import java.nio.charset.StandardCharsets;

public class C04자료형 {

	public static void main(String[] args) {
		//--------------------
		//정수 int - 4byte 정수 부호 o  상수풀 : 위에 동일한 값이 존재하면 그대로 복사해서 가져옴
		//--------------------
//		int n1=0b10101101;		//2진수값
//		int n2=173;				//10진정수값
//		int n3=0160;			//8진수 (2x64=128 + 5x8=40 + 1x5=5 = 173)
//		int n4=0xad;			//16진수 (10x16=160 + 13x1=13 = 173) 
//		System.out.printf("%d %d %d %d\n",n1,n2,n3,n4);

		//--------------------
		//정수 byte - 1byte 정수 부호 o
		//--------------------
//		byte n5=(byte)-129;		//바이트로 형변환 하여 양수로 나옴
//		byte n6=-30;
//		byte n7=30;
//		byte n8=127;
//		byte n9=(byte)129;		//n5와 동일하게 바이트가 가진 크기를 초과해서 (byte : -128 ~ 127 (0포함))
//		
//		System.out.printf("%d\n", n9);
//		System.out.println(0b10101101);
//		System.out.println(Integer.toBinaryString(-129));
		
		//--------------------
		//정수 char-2byte정수 부호x(양수만) | short-2byte정수 부호o
		//--------------------
//		char n1=65535;			//(0~2^16-1) (0~65535)
//		short n2=32767;			//(-2^15 ~ +2^15-1) (-32768 ~ 32767 (0포함))
//		
//		char n3=60000;
//		short n4=(short)n3;
//		
//		System.out.printf("%d\n",(int)n3);
//		System.out.printf("%d\n",n4);
		
		//--------------------
		//정수 long-8byte 정수 부호o
		//--------------------
		
//		long n1 = 10000000000;		//int 범위 초과
//		long n2 = 20;				//L,l (리터럴접미사) : long 자료형 사용하여 값 저장
//		
//		long n3 = 10000000000l;		//문제발생.. 왜?
//		long n4 = 10000000000L;
		
		//--------------------
		//실수
		//--------------------
		//유리수와 무리수의 통칭
		//소숫점이하값을 가지는 수 123.456
		//float : 4byte 실수(6-9자리)
		//double : 8byte 실수(15-18자리),기본자료형
				
		//정밀도 확인
//		float n1 = 0.123456789123456789F; 	//f, F:float 형 접미사
//		double n2 = 0.123456789123456789;
//
//		System.out.println(n1);
//		System.out.println(n2);
//		//오차 확인
//
//		float num=0.1F;
//		double num1=1E5;
//		System.out.println(num1);
//		for(int i=0;i<=1E5;i++) {
//			num=num+0.1F;
//			System.out.println(i);
//		}
//		System.out.println("num : "+num);
		
		//--------------------
		// 단일문자 char 2byte 정수
		// --------------------
//		char ch1 = 'a';
//		System.out.println(ch1);
//		System.out.println((int) ch1); 
//		System.out.println(Integer.toBinaryString(ch1)); // 01100001
//		System.out.println("--------------------------------");
//		char ch2 = 98;
//		System.out.println(ch2);
//		System.out.println((int) ch2);
//		System.out.println(Integer.toBinaryString(ch2)); // 01100010
//		System.out.println("--------------------------------");
//		char ch3 = 'b' + 1; 		// 사칙연산이 가능
//		System.out.println(ch3);
//		System.out.println((int) ch3); // 01100011
//		System.out.println("--------------------------------");
//		byte ch4 = 'c' + 2;
//		System.out.println((char) ch4);
//		System.out.println(ch4); // 01100101
//		System.out.println("--------------------------------");
//		char ch5 = 0xac00; 			// 16진수 한글 표시
//		char ch6 = 44032;
//
//		System.out.println(ch5);
//		System.out.println((int)ch5);
//		System.out.println(ch6);
//		System.out.println((char) (0b1010110000000000 + 1));
//
//		char ch5 = 0xac00;
//		char ch6 = 0xac00 + 1;
//		System.out.printf("%c %c\n", ch5, ch6);
//
//		// \\u :유니코드값 이스케이프문자
//		System.out.printf("%c\n",0xac03);
//		System.out.printf("%c\n",'\uac03');
//		System.out.printf("%c\n", '\uACa1');
//
//		System.out.printf("TEST : %c\n", '\uabcd');
//
//		char n = 10;
//		System.out.printf("HELLO %c WORLD", n);
		
		//--------------------
		//boolean : 논리형(true/false 저장)
		//--------------------
						
//		boolean flag = (10>11); 	// 참(긍정)
//		if(flag) 
//		{
//			System.out.println("참인경우 실행");
//		}
//		else 
//		{
//			System.out.println("거짓인경우 실행");
//		}
		
		//--------------------
		//문자열 : String (클래스자료형)
		//--------------------
				
		//기본자료형(원시타입)
//		byte n1;
//		short n2;
//		double n3;
//		long n4;
//
//		//클래스자료형
//		//클래스자료형으로 만든변수는 '참조변수'라고 하고
//		//참조변수는 데이터가 저장된 위치정보(메모리주소값)이 저장된다.
//		int n1 = 10;
//		byte n2 = 20;
//		char n3 = 40;
//	
//		String name = "홍길동";		//자바 : 문자 하나 3바이트
//		String job = "프로그래머";
//		System.out.println(name);
//		System.out.println(job);
//
//		System.out.println("name 실제 크기(bit) : "+name.getBytes(StandardCharsets.UTF_8).length);
//		System.out.println("job 실제 크기(bit) : "+job.getBytes(StandardCharsets.UTF_8).length);
//		
//		char ch = '홍'; 		//16bit == 2byte 사용 ''
//		String str = "홍";	//24bit == 3byte 사용 ""
//		
//		System.out.println("ch 실제 크기(bit) : "+Integer.toBinaryString(ch).length());
//		System.out.println("str 실제 크기(bit) : "+str.getBytes(StandardCharsets.UTF_8).length);	
	}

}
