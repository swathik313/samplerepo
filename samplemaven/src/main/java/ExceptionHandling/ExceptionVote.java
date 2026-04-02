package ExceptionHandling;

public class ExceptionVote {

	public static void main(String[] args) {

		int age =10;
		
		if(age>=18) {
			
			System.out.println("eligible for vote");
		}
		
		else
		{
			
			throw new ArithmeticException("age under 18");
		}
	}

}
