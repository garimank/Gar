package swaping;

public class swap {
	
	public static void main(String[] args) {
		int a=12;
		int b=15;
		
		System.out.println("value of a is "+a);
		System.out.println("value of b is "+b);
			
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swaping value of a is " +a);
		System.out.println("after swaping value of b is " +b);
		
		
		
	}	
	}

