package Ch03;

class 호빵재료{
	
}

class 민트초코{

	@Override
	public String toString() {
		return "민트초코";
	}
}
class 피자 extends 호빵재료{

	@Override
	public String toString() {
		return "피자";
	}
	
}
class 슈크림 extends 호빵재료{

	@Override
	public String toString() {
		return "슈크림";
	}
	
}
class 팥 extends 호빵재료{

	@Override
	public String toString() {
		return "단팥";
	}
	
}

//민트초코를 재료로 사용하지 못하게 제한을 걸어주는 방법
//호빵재료 클래스에 extends -> 상속관계에 있는 하위 클래스만 가능하게
class 호빵 <T extends 호빵재료>{
	private T 재료;
	
	public 호빵(T 재료) {
		this.재료=재료;
	}

	@Override
	public String toString() {
		return "호빵 [재료=" + 재료 + "]";
	}
	
}

public class C01GenericMain {

	public static void main(String[] args) {
		호빵<팥> ob1=new 호빵<팥>(new 팥());
		System.out.println(ob1);
		
		호빵<슈크림> ob2=new 호빵<슈크림>(new 슈크림());
		System.out.println(ob2);
		
		호빵<피자> ob3=new 호빵<피자>(new 피자());
		System.out.println(ob3);
		
//		호빵<민트초코> ob4=new 호빵<민트초코>(new 민트초코());
//		System.out.println(ob4);

	}

}
