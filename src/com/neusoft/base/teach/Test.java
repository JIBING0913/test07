package com.neusoft.base.teach;

/**
 * @Author: wwb
 * @Date: 2020/4/20 10:29
 */
public class Test {

    public static void main ( String[] args ) {
        Teacher teacher = new Teacher("1", "1");
        String name = teacher.name;
        String id = Teacher.id;
        Teacher.setId("123");

        int x = 2;
        switch(x){

            case 1:System.out.println("out1");break;

            case 2: ;

            case 3:System.out.println("out2");break;

            default:System.out.println("end");
        }

        if(x ==2 ){

        }
            System.out.println("1");

    }

}