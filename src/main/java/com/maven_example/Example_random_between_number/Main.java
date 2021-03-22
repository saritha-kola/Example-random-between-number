package com.maven_example.Example_random_between_number;

public class Main {
	public static void main(String[] args) {
		MyRandomMethods mrm = new MyRandomMethods();
	for(int i = 0; i < 30; i++) {
		System.out.print(mrm.randomBetween1And10() + ", ");;
		
	}
	System.out.println(" ");
	for(int i = 0; i < 30; i++) {
		System.out.print(mrm.randomBetween11And20() + ", ");;
		
	}
	System.out.println(" ");
	for(int i = 0; i < 30; i++) {
		System.out.print(mrm.randomBetween21And30() + ", ");;
		
	}
	System.out.println(" ");
	for(int i = 0; i < 30; i++) {
		System.out.print(mrm.randomBetween31And40() + ", ");;
		
	}
	System.out.println(" ");
	for(int i = 0; i < 30; i++) {
		System.out.print(mrm.randomBetween41And50() + ", ");;
		
	}
}
}
