package Ch05;

//각 클래스에 
//모든 인자를 받는 생성자 코드 삽입
//toString 코드 삽입

class A{
	int a;

//	public A(int a) {
//		super();
//		this.a = a;
//	}

	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}
	
}
class B extends A{
	int b;
	
//	public B(int a, int b) {
//		super(a);
//		this.b = b;
//	}

	@Override
	public String toString() {
		return "B [b=" + b + ", a=" + a + "]";
	}
	
}
class C extends A{
	int c;
	
//	public C(int a, int c) {
//		super(a);
//		this.c = c;
//	}

	@Override
	public String toString() {
		return "C [c=" + c + ", a=" + a + "]";
	}
	
}
class D extends B{
	int d;
	
//	public D(int a, int b, int d) {
//		super(a, b);
//		this.d = d;
//	}

	@Override
	public String toString() {
		return "D [d=" + d + ", b=" + b + ", a=" + a + "]";
	}
	
}
class E extends B{
	int e;
	
//	public E(int a, int b, int e) {
//		super(a, b);
//		this.e = e;
//	}

	@Override
	public String toString() {
		return "E [e=" + e + ", b=" + b + ", a=" + a + "]";
	}
	
}
class F extends C{
	int f;
	
//	public F(int a, int c, int f) {
//		super(a, c);
//		this.f = f;
//	}

	@Override
	public String toString() {
		return "F [f=" + f + ", c=" + c + ", a=" + a + "]";
	}

}
class G extends C{
	int g;
	
//	public G(int a, int c, int g) {
//		super(a, c);
//		this.g = g;
//	}

	@Override
	public String toString() {
		return "G [g=" + g + ", c=" + c + ", a=" + a + "]";
	}
	
}

public class C07UpDownCastingMain {

	public static void upDownCastTestFunc(A obj) {
		obj.a=100;
		
		if(obj instanceof B) { 
			B down=(B)obj; 	//DownCasting (확장된 멤버에 접근 위해)
			down.b=200;		//b 접근
		}
		if(obj instanceof C) { 
			C down=(C)obj; 	//DownCasting (확장된 멤버에 접근 위해)
			down.c=300;		//c 접근
		}
		if(obj instanceof D) { 
			D down=(D)obj; 	//DownCasting (확장된 멤버에 접근 위해)
			down.d=400;		//d 접근
			down.a=200;
			down.b=300;
		}
		if(obj instanceof E) { 
			E down=(E)obj; 	//DownCasting (확장된 멤버에 접근 위해)
			down.e=500;		//e 접근
			down.a=300;
			down.b=400;
		}
		if(obj instanceof F) { 
			F down=(F)obj;	//DownCasting (확장된 멤버에 접근 위해)
			down.f=600;		//f 접근
			down.a=400;
			down.c=500;
		}
		if(obj instanceof G) {
			G down=(G)obj; 	//DownCasting (확장된 멤버에 접근 위해)
			down.g=700;		//g 접근
			down.a=500;
			down.c=600;
		}
		
		System.out.println(obj);
	}
	
	
	public static void main(String[] args) {
		
		upDownCastTestFunc(new A()); // upDownCastTestFunc(A obj)=new A(); (NoCasting)
		upDownCastTestFunc(new B()); // upDownCastTestFunc(A obj)=new B(); (UpCasting)
		upDownCastTestFunc(new C()); // upDownCastTestFunc(A obj)=new C(); (UpCasting)
		upDownCastTestFunc(new D()); // upDownCastTestFunc(A obj)=new D(); (UpCasting)
		upDownCastTestFunc(new E());
		upDownCastTestFunc(new F());
		upDownCastTestFunc(new G());
	}

}
