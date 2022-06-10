package com.assessment.first;

public class Triangle extends Shape{
	float height,base,area;

	@Override
	public double getArea() {
		area=(height*base)/2;
		return area;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("height of triangle is :"+" "+height+'\n'+"base of triangle  is :"+" "+base+'\n'+"Area of triangle  is :"+" "+area);
	}

}
