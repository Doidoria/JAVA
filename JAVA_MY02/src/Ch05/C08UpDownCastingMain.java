package Ch05;

class Parent{
	void func1() {System.out.println("Parent's func1() call!");}
	void func2() {System.out.println("Parent's func2() call!");}
}

class Son extends Parent{
	//func2가 없다면 -> 확장된 함수, func2가 있다면 -> func2 재정의
	void func2() {System.out.println("Son's func2() call!");}
}

public class C08UpDownCastingMain {

	public static void main(String[] args) {
		
		//NoCasting
		Parent ob1=new Parent(); 
		ob1.func1();

		//NoCasting
		System.out.println("-----------");
		Son ob2=new Son();
		ob2.func1();
		ob2.func2();
		
		//UPCasting
		System.out.println("-----------");
		Parent ob3=new Son();
		ob3.func1();
		ob3.func2();
		
		// UpCasting 상태에서
		// 확장된(멤버추가) 멤버"변수" 접근 가능하다? x -> DownCasting -> 접근
		// 확장된(멤버추가) 멤버"함수" 접근 가능하다? x -> DownCasting -> 접근
		// 재정의된 메서드 접근 가능한가? O
	}

}
