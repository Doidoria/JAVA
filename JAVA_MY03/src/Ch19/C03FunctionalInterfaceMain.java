package Ch19;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//제공되는 함수형 인터페이스들
//Function<T, R>:
//apply 메서드를 가지고 있어서 하나의 인자(T)를 받아서 결과(R)를 반환하는 함수형 인터페이스 입니다.

//Supplier<T>:
//get 메서드를 가지고 있어서 어떠한 인자도 받지 않고 결과만을 제공하는 함수형 인터페이스 입니다.
//
//Consumer<T>:
//accept 메서드를 가지고 있어서 어떠한 인자를 받아서 결과를 반환하지 않는 함수형 인터페이스 입니다.
//
//Predicate<T>:
//test 메서드를 가지고 있어서 어떠한 인자를 받아서 불리언 결과를 반환하는 함수형 인터페이스 입니다.
//
//UnaryOperator<T>:
//apply 메서드를 가지고 있어서 하나의 인자를 받아서 동일한 타입의 결과를 반환하는 함수형 인터페이스 입니다.
//
//BinaryOperator<T>:
//apply 메서드를 가지고 있어서 두 개의 인자를 받아서 동일한 타입의 결과를 반환하는 함수형 인터페이스 입니다.


public class C03FunctionalInterfaceMain {

	public static Function<Integer, Integer> func1=x->x*x;
	
	public static Function<Integer, Integer> func2=x->x+x;
	
	public static Function< List<Integer>, Integer> func3=x->x.stream().reduce(0,(sum,el)->{return sum+el;});
//		return x.stream().reduce(0,(sum,el)->{return sum+el;});
		//reduce(누적변수초기값,(누적변수, 요소변수)->{return 누적연산;});};
	
	public static Function< List<Object>, Integer> func4=(li)->{
		//List<Object>로 받은 파라미터 중에 Integer만 추출해서 누적합 구하기
		return li.stream()
				.filter((item)->{return item instanceof Integer;})
				.map(item->(Integer)item)
				.reduce(0,(sum,item)->{return sum+item;});
	};
	public static Function< List<Object>, List<String>> func5=(li)->{
		return li.stream()
				.filter((item)->{return item instanceof String;})
				.map(item->(String)item)
				.collect(Collectors.toList());
	};
	public static Function<Integer, Integer> func6=func1.andThen(func2); 
	
	public static Function<List<Integer>, Integer> func7=func3.andThen(func1).andThen(func2);
	
	public static Function<Integer, Function<Integer, Integer>> func8=(x)->{
		
		//
		System.out.println("func8 x : "+x);
		return (n)->{
			//
			System.out.println("func8 n : "+x);
			return x+n;
		};
	};
	public static Function<Integer, Function<Integer, Integer>> func9=x->y->x+y; //func8 축소
	
	public static void main(String[] args) {
		
		//01
		System.out.println(func1.apply(10));
		//02
		System.out.println(func2.apply(10));
		//03
		System.out.println(func3.apply(Arrays.asList(10,20,30,40,50)));
		//04
		System.out.println(func4.apply(Arrays.asList(10,"티모",30,10.5,50,true)));
		//05
		System.out.println(func5.apply(Arrays.asList(10,"티모",30,10.5,50,true,"홍길동")));
		//06
		System.out.println(func6.apply(10)); //func1(10)=100 -> func2(10)=100*100=200
		//07
		System.out.println(func7.apply(Arrays.asList(10,20,30,40,50))); //func3(10..)=150 -> func1(150)=22500 -> func2(22500)=45000
		//08
		System.out.println(func8.apply(10).apply(20));
		//09
		System.out.println(func9.apply(10).apply(20));

	}

}
