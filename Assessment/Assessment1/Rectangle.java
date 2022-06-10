package com.assessment.first;

public class Rectangle extends Shape{
float length,width,area;
	public Rectangle(float length, float width) {
	
	this.length = length;
	this.width = width;
}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		area=length*width;
		return area;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("Length of rectangle is :"+" "+length+'\n'+"Width of rectangle  is :"+" "+width+'\n'+"Area of rectangle  is :"+" "+area);
	}

}
