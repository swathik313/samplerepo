package interfaceexample;

public class ChildIClass implements ParentInterface {

	public void sum() {

		System.out.println("Sum in child class");

	}

	public static void main(String[] args) {
		/*ChildIClass obj = new ChildIClass();
		obj.display();
		obj.print();
		obj.sum();*/
		//reference creation,to call interface methods alone
		ParentInterface ref = new ChildIClass();
		ref.display();
		ref.print();

	}

	@Override
	public void display() {
		System.out.println("display interface");
	}

	@Override
	public void print() {
		System.out.println("print interface");

	}

}
