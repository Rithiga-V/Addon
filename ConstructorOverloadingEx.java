package session3;

public class ConstructorOverloadingEx {
	
	private String empname;  //private variable
	private int empid;       //private variable
	private String location; //private variable
	public ConstructorOverloadingEx(String empname, int empid, String location) {
		
		//convert private variable into public using reference variable
		
        this.empname = empname;   
		this.empid = empid;
		this.location = location;
		
		
	}
	
	public ConstructorOverloadingEx(String empname, String location) {
		
		this(empname,0,location);//call invoke using this keyword
	}
	public ConstructorOverloadingEx(String empname, int empid) {
		
		this(empname,64321,null);
	}
	
	
	
	
	public void displayInfo() {
		System.out.println("EmpName:"+this.empname);
		System.out.println("EmpId:"+this.empid);
		System.out.println("Emp Location:"+this.location);
		
	}
	

	public static void main(String[] args) {
		
		ConstructorOverloadingEx cox = new ConstructorOverloadingEx("Anitha", 92345,"Coimbatore");
        ConstructorOverloadingEx cox1 = new ConstructorOverloadingEx("Rithiga","Coimbatore");
		ConstructorOverloadingEx cox2 = new ConstructorOverloadingEx("Aiswarya", 92345);
		cox.displayInfo();
		cox1.displayInfo();
		cox2.displayInfo();
	}
}
