package Ch17;

import java.util.ArrayList;
import java.util.List;

class Person{
	private String name;
	private int age;
	private String addr;
	
	Person() {}

	public Person(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
}

public class C01Lamda {
	
	public static void main(String[] args) {
		List<Person> list=new ArrayList<>();
		list.add(new Person("강호동",60,"서울"));
		list.add(new Person("이수근",55,"인천"));
		list.add(new Person("이승기",30,"부산"));

		list.stream().forEach((item)->{System.out.println(item);});
		System.out.println("--------------");
		list.sort((a,b)->{return a.getAge()-b.getAge();});
		list.stream().forEach((item)->{System.out.println(item);});
	}

}
