package com.example.exam3;

import java.util.HashMap;
import java.util.Map;

// Map���� �� testArray�� forEach���� Ȱ���Ͽ� Map�� ������� �ִ� �ڵ带 �����Ͻÿ�. 
// (��, Map���� 4���� key�� �����ؾ��Ѵ�.)
public class ForEachTest {
	public static void main(String[] args) {
		String[] testArray = {"A", "C", "D", "B"};
		// Map�� ��Ī�� testMap���� �����Ѵ�
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
