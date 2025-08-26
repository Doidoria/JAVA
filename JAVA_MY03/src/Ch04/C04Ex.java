package Ch04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class C04Ex {

	public static void main(String[] args) {
		//1) 1 ~ 45 까지 숫자를 6개를 랜덤으로 받아(Random클래스를 이용) set에 저장 / 출력

		Set<Integer> set=new HashSet();
		Random rnd=new Random();
		while(set.size()<6) {
			set.add(rnd.nextInt(45)+1);
		}
		for(Integer el : set) {
			System.out.println(el+" ");
		}
		System.out.println("---------------");
		
		//2) [추가]저장된 set의 오름차순정렬을 해보세요(검색을 통해서 해결해봅니다 - 스트림함수사용)
		
		//collect() : 스트림의 요소들을 특정 형태의 결과로 수집
		//Collectors.toList() : 스트림의 요소를 List로 수집
//		List<Integer> list=set.stream().sorted().collect(Collectors.toList());
//		list.stream().forEach(System.out::println);
		
		//2번째 방법
		List<Integer> list=new ArrayList(set);
		Collections.sort(list);
		for(Integer el : list) {
			System.out.println(el+" ");
		}
	}
	

}
