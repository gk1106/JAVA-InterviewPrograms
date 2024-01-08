package com.pk.array;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FrequencyWithMap {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 2, 1, 5, 6, 1, 2 };
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {

			if (map.containsValue(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
		}

		for (Entry<Integer, Integer> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + " >------> " + entry.getValue());
		}

		
		Set<Integer> keySet = map.keySet();
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		
		System.out.println(entrySet);
	}

}
