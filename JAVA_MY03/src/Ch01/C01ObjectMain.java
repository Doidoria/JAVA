package Ch01;

class A{
	int x;
	int y;
	
	@Override
	public String toString() {
		return "A [x=" + x + ", y=" + y + "]";
	}
	
}

public class C01ObjectMain {

	public static void main(String[] args) {
		A ob1=new A();
		
//		ob1.equals(ob1); 	//equals : 객체간 "일치여부" 비교 (반환 자료형 : boolean)
//		ob1.getClass();		//getClass : "클래스"를 뽑아오는 것
//		ob1.hashCode();     //hashCode : 객체 위치 정보를 "코드값"으로 확인
		
		System.out.println(ob1);
		System.out.println(ob1.toString());		//toString : 오브젝트로 부터 물려받은 것을 "재정의"
		
		//오브젝트가 위에 있다 (오브젝트 : 파라미터) - 모든 객체를 받을 준비가 되어있음.
		Object ob2=new Object();
		System.out.println(ob2);
		System.out.println(ob2.toString());
	}

}
