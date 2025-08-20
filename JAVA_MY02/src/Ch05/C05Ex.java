package Ch05;

class Employee {
	public String name;
	protected int age;			//protected : 상속 관계에서 하위클래스도 접근 가능
	protected String addr;
	
	public Employee() {}
	
	public Employee(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
class Parttimer extends Employee {
	private int hour_pay;
	
	public Parttimer() {}

	public Parttimer(String name, int age, String addr, int hour_pay) {
		super();
		this.hour_pay = hour_pay;
	}

	public void setHour_pay(int hour_pay) {
		this.hour_pay = hour_pay;
	}

	@Override
	public String toString() {
		return "Parttimer [hour_pay=" + hour_pay + "]";
	}
	
	
}
class Regular extends Employee {
	private int salary;
	
	public Regular() {}

	public Regular(String name, int age, String addr, int salary) {
		super();
		this.salary = salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Regular [salary=" + salary + "]";
	}
	
}

public class C05Ex { 

	public static void main(String[] args) {
		Parttimer emp1 = new Parttimer("홍길동", 25, "대구", 20000);
		emp1.setAge(100);
		
		Regular emp2 = new Regular("서길동", 45, "울산", 50000000);
		System.out.println(emp1);
		System.out.println(emp2);
	}

}
