package Ch06;

//일반클래스 상속관계
class Parent{
	void func() {}
}

class Son extends Parent{
	void func() {System.out.println("Son's func() call!");}
}

//추상클래스 상속관계
// 사용이유 : 메서드 구현의 강제성 부여, 재정의된 func()에 접근하기 위해
// 새로운 클래스를 쉽게 추가 가능하도록 설계되어 시스템 확장이 용이
// 추상 클래스를 상속받아 필요한 메서드만 구현하면 되므로, 새로운 기능을 추가할 때 기존 코드를 변경할 필요가 줄어듬.
abstract class Parent2{
	abstract void func();	// 추상메서드(미완성된 함수, {} 가 없는 것)
}

class Son2 extends Parent2{

	@Override
	void func() {
		System.out.println("Son2's func() call!");
	} 	
	
}

public class C01AbstractMain {

	public static void main(String[] args) {
		
		//일반클래스 상속관계
		Parent ob1=new Parent(); 	//상위클래스형으로 객체 생성 O
		Son ob2=new Son();			//하위클래스형으로 객체 생성 O
		Parent ob3=new Son();		//UPCASTING 연결 O
		ob3.func();					//재정의된 func()에 접근 O
		
		//추상클래스 상속관계
//		Parent2 ob4=new Parent2(); 	//추상클래스로 객체 생성 X
		Son2 ob5=new Son2();		//하위클래스형으로 객체 생성 O
		Parent2 ob6=new Son2();		//UPCASTING 연결 O
		ob6.func();					//재정의된 func()에 접근 O
	}

}
