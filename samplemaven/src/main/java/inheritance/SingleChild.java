package inheritance;

public class SingleChild extends SingleParent{

public void sum() {
	
	System.out.println("sum");
	
}

		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleChild obj = new SingleChild();
		obj.display();
		obj.sum();

	}

}
