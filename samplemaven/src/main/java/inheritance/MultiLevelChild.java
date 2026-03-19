package inheritance;

public class MultiLevelChild extends MultiLevelParent {
	
	public void print() {
		
		System.out.println("This is a child class method");
	}

	public static void main(String[] args) {
		
		MultiLevelChild obj = new MultiLevelChild();
		obj.display();
		obj.parentmethod("instance method- non static with return  with string ");
		obj.print();

		
	}

}
