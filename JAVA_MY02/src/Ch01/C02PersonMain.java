package Ch01;

class C02Person {

	public String name;
	public int age;
	public float height;
	public double weight;
	
}

public class C02PersonMain {

	public static void main(String[] args) {
		
		C02Person hong=new C02Person();
		hong.name="홍길동";
		hong.age=15;
		hong.height=177.5f;
		hong.weight=70.5;
		
		System.out.printf("이름 : %s\n나이 : %d\n키 : %.1f\n몸무게 : %.1fkg\n",hong.name, hong.age, hong.height, hong.weight);

	}

}
