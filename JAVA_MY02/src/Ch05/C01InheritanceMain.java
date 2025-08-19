//package Ch05;
//
//class Point2D{
//	int x;
//	int y;
//	Point2D(){
//		System.out.println("Point2D 디폴트 생성자 호출!");
//	}
//	Point2D(int x){
//		this.x=x;
//		System.out.println("Point2D(int x) 생성자 호출!");
//	}
//	Point2D(int x, int y){
//		this.x=x;
//		this.y=y;
//		System.out.println("Point2D(int x, int y) 생성자 호출!");
//	}
//}
//class Point3D extends Point2D{		//Point3D에 "extends"로 상위 Point2D에 상속관계 연결
//	int z;
//
//	Point3D(){
//		//super(); 예약어 - 상위클래스 Point2D()의 생성자를 먼저 호출 (코드를 안적어도 자동으로 실행) 
//		System.out.println("Point3D 디폴트 생성자 호출!");
//	}
//	
//	@Override
//	public String toString() {
//		return "Point3D [z=" + z + ", x=" + x + ", y=" + y + "]";
//	}
//	
//}
//
//public class C01InheritanceMain {
//
//	public static void main(String[] args) {
//		Point3D ob=new Point3D();
//		ob.x=10;
//		ob.y=20;
//		ob.z=30;
//		System.out.println(ob);
//		
//		
//	}
//
//}
