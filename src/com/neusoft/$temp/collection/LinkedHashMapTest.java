package com.neusoft.$temp.collection;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapTest {
	public static void main(String[] args) {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("111000", "xiaozhang");
		map.put("222000", "xiaoli");
		map.put("222000", "huawei");
		map.put("444000", "apple");
		map.put("333000", "xiaozhu");
		// for(String key:map.keySet()) {
		// System.out.println(map.get(key));
		// }
		for (Entry<String, Object> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
