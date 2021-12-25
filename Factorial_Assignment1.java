package assignments.day1;

public class Factorial_Assignment1 {

	public static void main(String[] args) {
		
		int no = 6;
		int fact = 1;
		
		for(int i=1; i<=no; i++) {
			
			fact = fact * i;
			}
		System.out.println("The factorial of the number "+no+" is "+fact);
	}

}
