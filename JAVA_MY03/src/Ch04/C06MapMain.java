package Ch04;

import java.util.HashMap;
import java.util.Map;

public class C06MapMain {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap();

		//추가
		map.put("aaa", 1111);
		map.put("bbb", 2222);
		map.put("ccc", 3333);
		map.put("ddd", 4444);	//older 가 삭제
		map.put("ddd", 5555);	//newer 가 적용 - 중복 key(나중에 "put"된 값으로 덮어쓰기)
		
		//조회
		for(String key : map.keySet()) { //["aaa","bbb","ccc","ddd"]
			System.out.println("KEY, VALUE : "+key+", "+map.get(key));
		}
		
		//삭제
		map.remove("aaa");
		
		//확인
		System.out.println("SIZE : "+map.size());
		System.out.println("단건 : "+map.get("bbb"));
		
		//조회
		for(String key : map.keySet()) { //["aaa","bbb","ccc","ddd"]
			System.out.println("KEY, VALUE : "+key+", "+map.get(key));
		}
		
	}

}
