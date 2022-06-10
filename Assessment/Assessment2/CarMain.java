package com.assessment.second;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CarMain {
public static void main(String[] args) {
	Car c = new Car("TN-52-1777","Jaguar F-TYPE",null);
	Car c1 = new Car("TN-52-7499","Jaguar XE",null);
	Car c2 = new Car("TN-52-9986","Audi-R8",null);
	System.out.println(Car.getCounter());
	String fileName="carObject.txt";
	try {
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(c);
		oos.writeObject(c1);
		oos.writeObject(c2);
		oos.close();
		fos.close();
		System.out.println("object stored to that particular file");
		}
	catch(IOException e) {
		e.printStackTrace();
	}
}
}

