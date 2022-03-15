package com.vivek;

import java.util.Scanner;

//Q:- WAP to check if a given number is even or odd
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=10;
		//This for user input
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to check:");
		int a = sc.nextInt();
		if(a%2==0) {
			//% = Modulus,== is for comparison
			System.out.println("This number is Even!");
		}
		else {
			System.out.println("This number is odd!");
		}

	}

}
