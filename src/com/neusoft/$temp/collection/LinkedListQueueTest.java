package com.neusoft.$temp.collection;

import java.util.LinkedList;

public class LinkedListQueueTest {
	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<String>();//linkedList���ɳ䵱��Ҳ�ɳ䵱ջpush,offer
		//Queue<String> queue = new LinkedList<String>();
		queue.offer("zhangsan");
		queue.push("iiiiiii");
		queue.offer("lisi");
		queue.offer("wangwu");
		queue.offer("apple");
		System.out.println(queue);
		//System.out.println(queue.peek());
		/*System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());*/
		System.out.println(queue);
	}
}
