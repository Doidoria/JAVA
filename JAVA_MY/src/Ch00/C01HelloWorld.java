package Ch00;

public class C01HelloWorld // 클래스 영역 (객체지향 문법 적용 단위), 클래스 선언부: 클래스 이름은 Main (파일명과 같아야 함)
{
	//메서드 종류 정리
	// 시스템 Library	: 개발 편의를 위해서 패키지별, 클래스별, 기능별로 제공되는 메서드 (JAVA API)
	// main			: 프로그램 실행의 시작점 (절차지향 문법 적용 단위)
	// 사용자 정의 	: 개발자에 의해 작성되어 실행되는 메서드
	
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		
	}
	
}

/*
[구성 요소 설명]

1. public class Main
   - Java에서는 모든 코드는 클래스 안에 있어야 합니다.
   - 클래스 이름은 대문자로 시작하며, 보통 파일 이름과 동일해야 합니다.
   - public: 접근 제어자, 다른 클래스에서 이 클래스를 접근 가능하게 합니다.

2. public static void main(String[] args)
   - main 메서드는 자바 프로그램의 진입점(Entry Point)입니다.
   - static: 객체를 생성하지 않고도 실행되도록 함
   - void: 반환값 없음
   - String[] args: 명령행 인수를 배열 형태로 받는 매개변수

3. System.out.println("Hello, Java!");
   - 표준 출력 스트림(System.out)을 통해 콘솔에 메시지를 출력합니다.
   - println은 출력 후 자동 줄바꿈을 포함합니다.
   - 큰따옴표(" ") 안에 있는 문자열이 그대로 출력됩니다.

[주의사항]
- 클래스 이름(Main)은 반드시 대문자로 시작하며, 파일명(Main.java)과 같아야 컴파일됨.
- main 메서드가 없으면 프로그램이 실행되지 않음.
- 중괄호({})는 코드 블록의 시작과 끝을 나타냅니다.
*/