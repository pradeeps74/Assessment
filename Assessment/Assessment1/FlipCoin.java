package com.assessment.first;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  how many times you want");
		FlipCoin.flip(sc.nextInt());
	}
	public static void flip(int n) {
		for (int i = 0; i < n; i++) {
			if (Math.random() < 0.5){
                System.out.println("Heads");
        }else{
                System.out.println("Tails");
        }
			
		}
		
	}

}
