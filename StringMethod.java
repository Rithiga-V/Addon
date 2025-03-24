package session3;

import java.util.Scanner;

public class StringMethod {
         public static void main(String[] args) {
			//String s1 = "java program";
			//1.length
			//System.out.println(s1.length()); 
		
			//2.equals()
			//3.equalsIgnoreCase
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter user name:");
			String username = sc.nextLine(); //username -->reference variable
			
			System.out.println("Enter password:");
			String password = sc.next();
			if(username.equals("admin") && password.equals("admin@123"))
			if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin@123")) 
			{	
			System.out.println("Success");
				}
			
			else {
				
				System.out.println("Error 404 Found");
			}
        	 
        	/* String s2 = "Anitha";      //literals
        	 //String s3 = "Anitha";
        	 String s3 = "anitha";
        	 System.out.println(s2.equals(s3));*/
			
			//==
        	/* String  s4 = "Anitha";
        	 String s5 = "Anitha";
        	 
        	 System.out.println(s4==s5);*/
        	 
        	 //String object in ==
        	// String name = new String("Anitha");
        	// String name1 = new String("Computer");
        	 //String name1 = new String("Anitha");
        	// System.out.println(name==name1);
         
         // compareTo
        //	s1>s2-->positive number
        // s1<s2-->negative number
        //s1==s2-->0
        	// String s6 = "heuits";
        	 //String s6 = "gellss";
        	 //String s6 = "iellos";
        	/* String s6 = "hellos";
        	 String s7 = "hellos";
        	 
        	 System.out.println(s6.compareTo(s7));*/
        	 //concat
        	/* String str1 = "Static";
        	 String str2 = new String("Program");
        	 System.out.println(str1.concat(str2));*/
        	  
        	 //toCharArray()
        	/*String str3 = "Welcome to Java";
        	 System.out.print("Value of method:");
        	 char[] ch = str3.toCharArray();
        	 for(char st: ch) {
        	 System.out.println(st);
        	 }*/
        	 
        	 //System.out.println(str3.toCharArray());

        	 //substring
        	/* System.out.println(str3.substring(5));
        	 System.out.println(str3.substring(0,9));*/
        	 
        	 //intern
        	/* String clg = "Kgisl";
        	 String clg1 = new String("Kgisl");
        	 String str4 = clg1.intern();
        	 System.out.println(clg==str4);*/
         }


}
