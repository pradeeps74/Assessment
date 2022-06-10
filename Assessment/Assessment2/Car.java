package com.assessment.second;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {
	String regNumber;
	String model;
	String createdTime;
	static int count=0;
	public Car(String regNumber, String model, String createdTime) {
		super();
		this.regNumber = regNumber;
		this.model = model;
		this.createdTime = createdTime;
		count++;
	}
	
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
		
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Car.count = count;
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
	return super.equals(obj);
	}
	@Override
	public String toString() {
		return "Car [regNumber=" + regNumber + ", model=" + model + ", createdTime=" + createdTime + "]";
	}
	public static String getCounter() {
		return "objects created for : "+count;
	}

}
