package com.neusoft.array.prac;

/**
 * @Author: wwb
 * @Date: 2020/4/16 11:41
 */
public class Ex01 {
    public static void main(String[] args) {
        int[] arr = new int[]{4,2,3,1,0};
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    flag = true;
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
        if(!flag){
            System.out.println("没重复");
        }
    }
}
