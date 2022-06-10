package com.assessment.first;

public class Circle  {
	int radius;
	public static final double PI= 3.142;
	double area;

	public Circle(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		area=PI*radius*radius;
		return area;
	}
	public void printInfo() {
		System.out.println("Area of circle is :"+" "+area+'\n'+"Radius of circle given is :"+" "+radius);
	}

}
