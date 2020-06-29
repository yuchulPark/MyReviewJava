package com.example.exam3;

import java.util.HashMap;
import java.util.Map;

// Map선언 후 testArray를 forEach문을 활용하여 Map에 순서대로 넣는 코드를 구현하시오. 
// (단, Map에는 4개의 key가 존재해야한다.)
public class ForEachTest {
	public static void main(String[] args) {
		String[] testArray = {"A", "C", "D", "B"};
		// Map의 명칭은 testMap으로 선언한다
		// ->
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		int i = 1;
		for(String t : testArray) {
			map.put(i, t);
			i++;
		}
		System.out.println(map);
	}
}
