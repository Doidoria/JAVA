package Ch19;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;





public class C04Ex {
	//01 func1완성 - List<String>에 저장된 문자열 리스트에서 길이가 5이상인 문자열의 개수를 반환
	public static Function<List<String>,Integer> func1=(el)->{
		return (int)el.stream()
			.filter(item->item.length()>=5)
			.count();
	};
	
	//02 func2완성 - List<Integer>에 저장된 숫자들의 제곱한 값의 합을 반환
	public static Function<List<String>,Integer> func2=(el)->{
		return el.stream()
				.filter(s->s.matches("\\d+")) 	//숫자 형태 문자열만 필터
				.map(Integer::parseInt)			//String -> Integer 변환
				.reduce(1,(sub,item)->sub*item); //곱하기 때문에 초기값 1
	};
	
	//03 func3완성 - List<String>에서 각 문자열의 첫 글자를 추출하여 대문자로 변환하여 리턴
	public static Function<List<String>,Integer> func3; 
	
	
	public static void main(String[] args) {
		//01
		List<String> lists = Arrays.asList("apple", "cat", "banana", "dog", "grape");
		int result=func1.apply(lists);
		System.out.println(result);
		
		List<String> lists2 = Arrays.asList("홍길동","티모","10","20","30","김종민");
		int result2=func2.apply(lists2);
		System.out.println(result2);
	}
	
}
