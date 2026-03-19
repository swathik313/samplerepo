package inheritance;

public class HeirarchChild2 extends HierarchiParent {

	public void display1() {

		System.out.println("Child class 2");

	}

	public static void main(String[] args) {

		HeirarchChild2 obj2 = new HeirarchChild2();
		obj2.display();
		obj2.display1();

	}

}
