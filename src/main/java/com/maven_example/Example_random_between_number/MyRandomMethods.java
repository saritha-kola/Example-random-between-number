package com.maven_example.Example_random_between_number;
import java.util.Random;

public class MyRandomMethods {
	Random random = new Random();
	public int randomBetween1And10() {
		int result = 0;
		result = random.nextInt(10)+1;
		return result;
		
	}
	
	public int randomBetween11And20() {
		int result = 0;
		result = random.nextInt(10)+11;
		return result;
		
}
	public int randomBetween21And30() {
		int result = 0;
		result = random.nextInt(10)+21;
		return result;
		
}
	public int randomBetween31And40() {
		int result = 0;
		result = random.nextInt(10)+31;
		return result;
		
}
	public int randomBetween41And50() {
		int result = 0;
		result = random.nextInt(10)+41;
		return result;
		
}
}

