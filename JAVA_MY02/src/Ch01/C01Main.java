package Ch01;

public class C01Main {

	public static void main(String[] args) {
		C01Person hong=new C01Person();
		hong.name="홍길동";
		hong.age=15;
		hong.height=177.5f;
		hong.weight=70.5;
		
		System.out.printf("이름 : %s\n나이 : %d\n키 : %.1f\n몸무게 : %.1fkg\n",hong.name, hong.age, hong.height, hong.weight);

	}

}
