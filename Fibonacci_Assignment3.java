package assignments.day1;

public class Fibonacci_Assignment3 {

	public static void main(String[] args) {
		//the Fibonacci Series is: 0 1 1 2 3 5 8 13 21....... the sum of previous 2 numbers.
		
		int a = 0,b=1;
		int c;
		System.out.print(a+" "+b);
		
		for (int i=1; i<=10; i++) {
			
			c = a+b;
			System.out.print(" "+c);
			
			a=b;
			b=c;
		}
		
		

	}

}
