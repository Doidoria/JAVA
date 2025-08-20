package Ch05;

//부모
class Super{
	int n1;
}
//자식
class Sub extends Super{
	int n2;
}

public class C06UpDownCastingMain {

	public static void main(String[] args) {
		// NoCasting (형변환 없음/자료형의 일치)
		Super ob1=new Super();
		ob1.n1=10;
		Sub ob2=new Sub();
		ob2.n1=10;
		ob2.n2=20;

		// UPCasting(상위클래스 참조변수 = 하위클래스형 객체)(자동형변환)
		// 자동형변환 일어나는 이유 : 메모리 영역을 침범할 우려가 없기 때문에
		// 사용이유 : 상속관계로 구성된 모든 하위객체를 연결할 수 있다.
		Super ob3=new Super();
		ob3.n1=100;
//		ob3.n2=200; //접근불가
		
		Super ob4=ob2;
		ob4.n1=200;
//		ob4.n2=300; //접근불가
		
		// DownCasting(하위클래스 참조변수 = 상위클래스형 객체)(강제형변환)
		// UPcasting된 상태에서 확장된 멤버에 접근하기 위한 용도
		
//		Sub ob5=(Sub)ob1; //접근불가 (상위클래스)
//		ob5.n1=100; //실제 있는 n1 공간에 값 대입(문제 없음)
		
		Sub down=(Sub)ob4; //Upcasting을 전제로 한 Downcasting
		down.n1=1000;
		down.n2=2000;
	}

}
