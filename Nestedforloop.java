package session3;

import java.util.Scanner;

public class Nestedforloop {
   public static void main(String[] args) {
	

	//Diamond pattern
	Scanner sc = new Scanner(System.in);
	System.out.println("enter no of rows:");
	int rows = sc.nextInt();
	//top half of diamond
	for(int i=1 ; i<=rows; i++) {
		
		//leading spaces
		for(int j= i;j<rows;j++) {
			
			System.out.print(" ");
			
		}
		//*print
		for(int k=1;k<=(2*i-1);k++) {
			
			System.out.print("*");
		}
			
			System.out.println();
		
		
	}
	//Bottom half of diamond
for(int i=rows-1;i>=1;i--) {
		
		//leading spaces
		for(int j=rows;j>i;j--) {
			
			System.out.print(" ");
			
		}
		//*print
		for(int k=1;k<=(2*i-1);k++) {
			
			System.out.print("*");
		}
		System.out.println();
	}
	
	
}
}