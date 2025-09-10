package Ch18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person{
	protected String name;
	protected int age;
	
	public Person() {}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

class Employee extends Person{
	private String department;
	private String role;
	
	public Employee() {}
	public Employee(Person person) {
		this.name=person.getName();
		this.age=person.getAge();
		//super(name, age)
	}
	
	public Employee(String name, int age, String department, String role) {
		super(name, age);
		this.department = department;
		this.role = role;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Employee [department=" + department + ", role=" + role + ", name=" + name + ", age=" + age + "]";
	}
	
}

public class C01MAP {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		System.out.println("짝수 필터링 : "+list);
		
		//filter
		List<Integer> list2=list.stream() //반환형이 스트림이기때문에 collect를 사용
				.filter((n)->n%2==0)
				.collect(Collectors.toList());	//toList로 변환하기때문에 List<Integer>로 받음
		
		System.out.println(list2);
		
		//map
		List<Integer> list3=list.stream()
			.filter(n->{return n%2==1;})
			.map(n->{return n*n;})
			.collect(Collectors.toList());
		System.out.println("MAP적용 : "+list3);
		
		//sorted
		List<Person> list4=Arrays.asList(
				new Person("강호동",55),
				new Person("이수근근근",50),
				new Person("은지원투",45),
				new Person("승기",35),
				new Person("종",40)
				);
		System.out.println(list4);
		
		//나이순으로 내림차순 정렬해서 출력, 배열 새롭게 구성
		List<Person> list5=list4.stream()
				.sorted((a,b)->{return b.getAge()-a.getAge();})
				.collect(Collectors.toList());
		list5.forEach(System.out::println);
		
		// 개량
		List<Integer> list6=list4.stream()
//			.map((el)->{return el.getAge();})
//			.map(el->el.getAge())
			.map(Person::getAge) //메소드 참조 (::) 사용
			.collect(Collectors.toList());
		System.out.println(list6);
				
		//메소드 참조 (::) 추가
		List<Integer> list7=list4.stream()
				.map(Person::getName)
				.map(String::length)
				.collect(Collectors.toList());
		System.out.println(list7);
		
		//Employee 변환
		List<Employee> list8=list4.stream()
//			.map(el->{return new Employee(el);})
			.map(Employee::new)
			.collect(Collectors.toList());
		list8.forEach(System.out::println);
	}

}
