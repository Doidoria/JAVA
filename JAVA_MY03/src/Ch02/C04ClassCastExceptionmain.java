package Ch02;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class C04ClassCastExceptionmain {

	public static void changeDog(Animal animal) {
		try {
			Dog down=(Dog)animal;
		}catch(ClassCastException e) {
			System.out.println("예외 발생! "+e.getMessage());
		}
	}
	public static void main(String[] args) {
		Animal poppi=new Dog();	//업스캐팅
		Animal tori=new Cat();	//업스캐팅
		
		//다운캐스팅
//		Dog down1=(Dog)poppi;
//		Dog down2=(Dog)tori;
		
		//다운캐스팅(changeDog)
		changeDog(tori);
		changeDog(poppi);

		System.out.println("실행되어야 할 코드!");
	}

}
