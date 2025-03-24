package session5;

public class Accessperson {
 
	public static void main(String[] args) {
		//Original Person Object
		Person originalPerson = new Person("Rithiga",19);
		
		//Copied Person Object
		Person copiedPerson = new Person(originalPerson);//Object dependency
		
		
		System.out.println("Original Person");
		originalPerson.displayInfo();
	
	    System.out.println("Copied Person");
	    copiedPerson.displayInfo();
	}
}
