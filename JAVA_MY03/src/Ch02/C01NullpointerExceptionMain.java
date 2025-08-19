package Ch02;

public class C01NullpointerExceptionMain {

	public static void main(String[] args) {
		
		//예외가 발생 가능성 있는 코드에 try
		try { 
			String str=null;
			System.out.println(str.toString());
		} catch(NullPointerException e) {			// 예외 처리 코드
			System.out.println("예외발생 : "+e);
			System.out.println(e.getCause());
			System.out.println(e.toString());
			System.out.println(e.getStackTrace());
//			e.printStackTrace();
		}
		System.out.println("실행되어야 할 코드1");
		System.out.println("실행되어야 할 코드2");		
	}

}
