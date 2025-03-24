package session3;

public class AdvancedString {
	
	public static void main(String[] args) {
		//StringBuilder sb = new StringBuilder("Hello");
		StringBuffer sb = new StringBuffer("Hello");
		//append
		sb.append("World");
		System.out.println("After append: "+sb);
		
		//insert
		sb.insert(5, ",");
		System.out.println("After insert: "+sb);
		
		//replace
		sb.replace(6,  11, "java");//sourceindex,destinationindex,    n-1-->11-1=10 index[6]=W and index[10]=d
		                            //string to replace
		System.out.println("After replace: "+sb);
		
		//reverse
		sb.reverse();
		System.out.println("After reverse: "+sb);
	}

}
