package com.assessment.first;

public class CircleTest {
	int radius1,radius2;
	public static final double PI= 3.142;
	double area;

	public CircleTest(int radius1,int radius2) {
		this.radius1 = radius1;
		this.radius2 = radius2;
	}
	public double getArea() {
		area=PI*radius1*radius2;
		return area;
	}
	public void printInfo() {
		System.out.println("Area of circle is :"+" "+area+'\n'+"First Radius of circle given is :"+" "+radius1+'\n'+"Second Radius of circle given is :"+" "+radius1);
	}

}
