package com.neusoft.$temp.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListQuchong {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(26); 
		list.add(39); 
		list.add(5); 
		list.add(40); 
		list.add(39); 
		list.add(25); 
		list.add(40); 
		System.out.println(list); 
		//����һ:ʹ��java8������stream����Listȥ��
//		List newList = (List) list.stream().distinct().collect(Collectors.toList()); 
//		System.out.println("java8������streamȥ��:"+newList); 
		
		//������:˫��forѭ��ȥ�� 
//		for (int i = 0; i < list.size(); i++) {
//			for (int j = 0; j < list.size(); j++) {
//				if (i != j && list.get(i) == list.get(j)) {
//					list.remove(list.get(j));
//				}
//			}
//		}
//		System.out.println("˫��forѭ��ȥ��:"+list); 
		
		//������:set�����ж�ȥ��,������˳��
//		Set set1 = new HashSet();
//		List newList1 = new ArrayList();
//		for(Integer integer:list){
//			if (set1.add(integer)) {
//				newList1.add(integer);
//			}
//		}
//		System.out.println("set�����ж�ȥ��:"+newList1); 
		
		
		//������:�������жϸ�����һ��list���� 
//		List newList2 = new ArrayList();
//		for (Integer integer : list) {
//			if (!newList2.contains(integer)) {
//				newList2.add(integer);
//			}
//		}
//		System.out.println("��ֵ��listȥ��:"+newList2); 
		
		
		//������:set��listת��ȥ�� 
		Set set2 = new HashSet(); 
		List newList3 = new ArrayList(); 
		set2.addAll(list); 
		newList3.addAll(set2); 
		System.out.println("set��listת��ȥ��:"+newList3);
	}
}
