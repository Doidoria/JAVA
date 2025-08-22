package Ch02;

import java.awt.AWTException;

//예외처리 몰아줄 때 사용 (프로젝트 만들때 사용하기)
class A{
	public void Ex1() throws NullPointerException {
		System.out.println("A's Ex1 Func Call!");
		String a=null;
		a.toString();
	}
}
class B{
	public void Ex2() throws AWTException {
		System.out.println("B's Ex2 Func Call!");
		throw new AWTException("예외 발생!");
	}
}

public class C06ThrowAndThrowsMain {

	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		try {
			a.Ex1();
			b.Ex2();
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}catch(AWTException e2) {
			System.out.println(e2.getMessage());
		}
		System.out.println("실행코드3");
	}

}
