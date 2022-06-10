 package com.assessment.first;

public class CircleMain {
	public static void main(String[] args) {
		double sum1=0,sum2=0;
		int arr[]=new int[100];
		int arr1[]=new int[100];

		for (int i = 0; i < arr.length; i++) {
			arr[i]=(int) (Math.random()*10);
			arr1[i]=(int) (Math.random()*10);
			Circle c1=new Circle(arr[i]);
			//CircleTest c2=new CircleTest(arr[i],arr1[i]);
			sum1=sum1+c1.getArea();
			//sum2=sum2+c2.getArea();
		}
		System.out.println(" Total radius of first circle is "+sum1);
		System.out.println(" Total radius of Second circle is "+sum2);
	}


}
