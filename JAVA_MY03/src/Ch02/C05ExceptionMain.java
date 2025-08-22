package Ch02;

public class C05ExceptionMain {

	public static void main(String[] args) {
		String str=null;
		try {
			str.toString();
			int arr[]= {10,20,30};
//			arr[5]=100;
			
			Animal animal=new Dog();
//			Cat down=(Cat)tori;
			
		}catch(Exception e) {		//다 받아냄!
			System.out.println(e.getMessage());
		}
		
		//정통 방법 ↓ (예외처리가 많을 경우 위에 방법 사용)
//		catch(NullPointerException  e) {
//			System.out.println("NULLPOINTER 예외처리 완료!");
//		}catch(ArrayIndexOutOfBoundsException e2) {
//			System.out.println("배열 예외처리 완료!");
//		}
//		}catch(ClassCastException e3) {
//			System.out.println("다운캐스팅 예외처리 완료!");
//		}
		
		finally {
			//자원정리 작업
			System.out.println("Finally Test..");
		}
		System.out.println("실행되어야 할 코드!");

	}

}
