package com.neusoft.exception;

import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Author: wwb
 * @Date: 2020/4/20 14:18
 */
public class ExceptionTest {
    public static void main(String[] args) throws ParseException, RemoteException, MyException {
        //���ܼ��쳣
//        int i = 1/0;

//        int[] arr = new int[2];
//        System.out.println(arr[2]);
        System.out.println("1");

//        ExceptionTest.main(args);

        //�ܼ��쳣
       /* SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date data = simpleDateFormat.parse("123");
        } catch (ParseException | ArithmeticException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();

        } finally {
            System.out.println("111");
        }

        test(simpleDateFormat);*/
       int i = 5;
       if(i > 1){
           throw new MyException("����һ���Զ�����쳣");
       }



    }

    private static void test(SimpleDateFormat simpleDateFormat) throws ParseException, RemoteException {
            throw new RemoteException("12121445");
//        return simpleDateFormat.parse("123");
    }
}
