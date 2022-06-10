package com.assessment.first;

public class Circle3 extends Shape{
	int radius;
	public static final double PI= 3.142;
	double area;
	public Circle3(int radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		area=PI*radius*radius;
		return area;
	
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("Area of circle is :"+" "+area+'\n'+"Radius of circle given is :"+" "+radius);
	}

}
