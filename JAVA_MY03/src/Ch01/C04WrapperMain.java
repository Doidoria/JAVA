package Ch01;

public class C04WrapperMain {

	public static void main(String[] args) {
		//Boxing(기본자료형 -> Wrapper Class)
		Integer ob1=new Integer(100);			//비끔 표시는 버전에 따라(현재 버전에서는 지원을 안한다)
		Integer ob2=new Integer("100");
		Integer ob3=Integer.valueOf("300");
		System.out.println(ob1+ob2+ob3);
		
		//UnBoxing
		int n1=ob1.intValue();
		int n2=ob2.intValue();
		int n3=ob3.intValue();
		System.out.println(n1+n2+n3);
		
		//Auto Boxing
		Integer ob4=100;	//형변환이 자동으로 됨 (래퍼클래스 ob4 = 리터럴)
		
		int n4=ob1+ob2+ob3+ob4;
		System.out.println(n4);
	}

}
