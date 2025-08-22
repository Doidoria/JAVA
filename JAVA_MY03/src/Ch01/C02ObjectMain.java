package Ch01;

class C02Simple{
	int n;
	C02Simple(int n){
		this.n = n;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof C02Simple) {		//C02Simple 인지 먼저 판단 후 "true"이면
			C02Simple down=(C02Simple)obj;	//n에 접근하기 위해 downCasting 해준다. (확장된)
			return this.n==down.n;			//참조 변수 (n) 확장된 (n) 일치여부 비교
		}
		return false;
	}
	
}

public class C02ObjectMain {

	public static void main(String[] args) {
		C02Simple ob1=new C02Simple(10);
		C02Simple ob2=new C02Simple(20);
		C02Simple ob3=new C02Simple(30);
		C02Simple ob4=new C02Simple(20);
				
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
		System.out.println(ob4);
		System.out.println(ob1.equals(ob1)); // 참조 변수의 일치여부 (this)
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));
		System.out.println(ob2.equals(ob4));
		// 위치값을 비교하기 때문에 다 다른객체로 인식함 (그래서 equals 클래스를 해주는 작업을 실시)
	}
}
