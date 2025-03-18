package program;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		
		System.out.println("Enter your weight:");
		int weight = sc.nextInt();
		
		if(age>20) {
			if(weight>50) {
				System.out.println("Age and weight are satisfied can donate blood");
			}else {
				System.out.println("Underweight cannot donate blood");
			}
		}else {
			System.out.println("Age is not satisfied to donate blood");
		}
	}
}
