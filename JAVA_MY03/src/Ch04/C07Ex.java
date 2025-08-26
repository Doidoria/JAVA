package Ch04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C07Ex {
	//속성
	static Map<String, Object> map=new HashMap(); //Object 사용이유 : 어떠한 자료형이든 다 받아낸다.
	
	//01 함수의 파라미터 형으로 사용되는 경우 (set)
	public static void setMap(Map<String, Object> param) {
		for(String key : param.keySet()) {
			Object value=param.get(key);
			System.out.println("KEY, VAL : "+key+", "+value);
			map.put(key, value);
		}
	}
	//02 함수의 리턴형으로 사용되는 경우 (get)
	public static Map<String,Object> getMap(){
		return map;
	}
	
	public static void main(String[] args) {

		//01 파라미터 생성
		Map<String, Object> params=new HashMap();
		
		//02 파라미터에 데이터 저장
		String [] values= {"정보처리기사","빅데이터분석기사","네트워크 관리사"};
		params.put("자격증",values);
		setMap(params);
		params.clear();
		
		//02 데이터 전달
		List<String> value2=new ArrayList();
		value2.add("등산");
		value2.add("독서");
		value2.add("게임");
		params.put("취미",value2);
		setMap(params);
		
		System.out.println();
		
		//03 데이터 확인
		Map<String,Object> mapDatas=getMap();
		for(String key : mapDatas.keySet()) {
			Object value=mapDatas.get(key);
			
			//배열
			if(value instanceof String[]) {
				String [] arr=(String[])value;
				for(String el : arr) {
					System.out.println("자격증 배열값 확인 : "+el);
				}
			}else if(value instanceof List) {
				System.out.println("K : " + key + " VAL : " + value);
			}
		}
	}

}
