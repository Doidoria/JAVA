package Ch02;

public class C02ArrayIndexBoundExceptionMain {

	public static void main(String[] args) {
		int arr[]= {10,20,30};
		
		try {
			for(int i=0;i<4;i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생! : "+e.getMessage());
		}finally {
			System.out.println("예외발생과는 무관하게 무조건 실행되는 코드");
			//자원(JDBC,SOCKET,STREAM,SCANNER...)을 제거하는데 사용
		}
		System.out.println("실행되어야 할 코드1");
		System.out.println("실행되어야 할 코드2");
	}
}
