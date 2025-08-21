package Ch07;

//인터페이스
// 다중 상속 가능, 추상 메서드와 상수만 사용 가능, 생성자 사용 불가, 
// 메서드 오버라이딩 필수 (자식클래스는 부모 클래스의 추상 메서드를 모두 오버라이딩 해야함)
// "확장"에는 열려있고 "변경"에는 닫혀있다
// 사용이유 : 한 메서드를 수정하였을 때, 다른 메서드도 수정해야 하는 상황을 줄여준다

public interface Animal{
	public static final String name="동물";
	
	void sound(); 	// public abstract 생략 가능
	void move();
}

class Dog implements Animal{

	@Override
	public void sound() {
		System.out.println("멍멍");
	}

	@Override
	public void move() {
		System.out.println("텁텁");		
	}
	
}

class Cat implements Animal{

	@Override
	public void sound() {
		System.out.println("냐옹");
	}

	@Override
	public void move() {
		System.out.println("사뿐사뿐");
	}
	
}

public class C01InterfaceMain {

	public static void main(String[] args) {
		Animal dog=new Dog();
		dog.sound();
		dog.move();
		
		Animal cat=new Cat();
		cat.sound();
		cat.move();

	}

}
