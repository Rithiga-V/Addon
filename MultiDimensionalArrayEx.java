package session3;

public class MultiDimensionalArrayEx {
   public static void main(String[] args) {
	  int [][] a = {{2,4},{5,7},{7,3},{3,1}};
	//Access all elements using nested for loop  
   // for(int i = 0;i<a.length;i++) //2D format
   //{
		 // for(int j = 0;j<a[i].length;j++)   //2D converted into one D
		  //{ 
			// System.out.print(a[i][j]); //2D
			  
		 //}
		  //System.out.println();
	  //}
	  for(int[] i : a) {  //2D to 1D
		  
		  for(int j : i) { //1D to variable
			  
			  System.out.print(j); //print the variable
		  }
		  System.out.println();
		  
	  }
	  
}
}
