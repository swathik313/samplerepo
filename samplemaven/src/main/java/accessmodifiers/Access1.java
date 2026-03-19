package accessmodifiers;

public class Access1 {

	public void display() {

		System.out.println("public 1");
	}

	private void display2() {
		System.out.println("Private method");
	}

	protected void display3() {

		System.out.println("protected method");
	}

	void display4() {
		System.out.println("Default method");
	}

	public static void main(String[] args) {
		Access1 obj = new Access1();
		obj.display();
		obj.display2();
		obj.display3();
		obj.display4();
	}

}
