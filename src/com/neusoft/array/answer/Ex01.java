package com.neusoft.array.answer;

public class Ex01 {

	public static void main(String[] args) {
		int[] a= {1,2,3,1,0};
		int temp=0;
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			//找出1个重复的,标志位一改变就可以跳出
			if(flag==true) {
				int i1 = 1;
				break;
			}
			temp=a[i];
			//每个元素只与自己之后的数比较即可
			for(int j=i+1;j<a.length;j++) {
				if(temp==a[j]) {
					flag=true;
					break;
					}
			}
		}
		if(flag==true) {
		System.out.println("找到的第一个重复元素是"+temp);
		}else {
		System.out.println("没有重复元素！");
		}
	}

}
