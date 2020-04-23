package com.neusoft.freqclass.teach;

public class BigDecimalTest {
	private static final int DEF_DIV_SCALE = 3;
	public int addition(int a,int b) {
		return a+b;
	}
	public long addition(long a,long b) {
		return a+b;
	}
	public float addition(float a,float b) {
		return a+b;
	}
	public double addition(double a,double b) {
		return a+b;
	}
	public String addition(String a,String b) {
		String regex = "^[0-9]+$";
		/*if(!Pattern.matches(regex, a)){
			return "�Ƿ����룡";
		}
		if(!Pattern.matches(regex, b)){
			return "�Ƿ����룡";
		}*/
		if(a.matches(regex)){
			return "�Ƿ����룡";
		}
		if(b.matches(regex)){
			return "�Ƿ����룡";
		}
		Integer i1 = Integer.parseInt(a);
		Integer i2 = Integer.parseInt(b);
		Integer i3 = i1 + i2;
		return i3.toString();
	}
	public static void main(String[] args) {
		BigDecimalTest add = new BigDecimalTest();
		int a = add.addition(1, 5);
		System.out.println(a);
		long b = add.addition(2L, 5L);
		System.out.println(b);
		float c=add.addition(0.3F, 0.2F);
		System.out.println(c);
		double d1=0.4;
		double d2=0.2;
		double f1=add.addition(d1, d2);
		System.out.println("+:"+f1);
		/*ʹ��BigDecimalҪ��String�����죬Ҫ��һ���ӷ����㣬
		 * ��Ҫ�Ƚ�����������תΪString��Ȼ�����BigDecimal��
		 * ������һ���ϵ���add������������һ����Ϊ������
		 * Ȼ�������Ľ����BigDecimalTest����ת��Ϊ��������*/
		java.math.BigDecimal b_d1 = new java.math.BigDecimal(Double.toString(d1));
		java.math.BigDecimal b_d2 = new java.math.BigDecimal(Double.toString(d2));
		double dd1=b_d1.add(b_d2).doubleValue();
		System.out.println("+:"+dd1);
		//BigDecimal��ǿѵ��
		double f2=0.002-0.11345;
		System.out.println("-:"+f2);
		double dd2=sub(0.002,0.11345);
		System.out.println("-:"+dd2);
		
		double f3=0.002*0.11345;
		System.out.println("*:"+f3);
		double dd3=mul(0.002,0.11345);
		System.out.println("*:"+dd3);
		
		
		double f4=10.0/3.0;
		System.out.println("/:"+f4);
		
		java.math.BigDecimal a11 = new java.math.BigDecimal(Double.toString(10));
	    java.math.BigDecimal b11 = new java.math.BigDecimal(Double.toString(3));
	  //����
		/*�ṩ����ԣ���ȷ�ĳ������㣬�����������������ʱ����ȷ��  
		С�����Ժ�scaleλ(�ڶ���������������ڵ���0�����Ժ�������������롣*/  
	    /*��������������ģʽѡ��
		 * ROUND_HALF_UP:�������룬����0.5ʱ���Ͻ��ƣ�������ROUND_HALF_DOWN��ͬ
		 * ROUND_UP����λ����
		 * ROUND_DOWNֱ��ɾ�������С��λ
		 * ROUND_CEILING���Ϊ�����λ�����Ϊ������λ����ֻ���Ӽ����ֵ
		 * ROUND_FLOOR���Ϊ������λ�����Ϊ�����λ����ֻ���ټ����ֵ
		 * ROUND_HALF_DOWN�������룬����0.5ʱ���½���
		 * */
	  //����ѵ�һ����������������ֵΪ1����ɵȼ��ڶ�һ���������������  
	    double dd4=a11.divide(b11,DEF_DIV_SCALE, java.math.BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println("/:"+dd4);
		
		String e=add.addition("4", "2a");
		System.out.println(e);
	}
	//����
	public static double sub(double v1,double v2){   
		java.math.BigDecimal b1 = new java.math.BigDecimal(Double.toString(v1));
		java.math.BigDecimal b2 = new java.math.BigDecimal(Double.toString(v2));
		return b1.subtract(b2).doubleValue();   
		}   
	
	//�˷�
	public static double mul(double v1,double v2){   
		java.math.BigDecimal b1 = new java.math.BigDecimal(Double.toString(v1));
		java.math.BigDecimal b2 = new java.math.BigDecimal(Double.toString(v2));
		return b1.multiply(b2).doubleValue();   
		}   
}
