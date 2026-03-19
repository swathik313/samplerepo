package inheritance;

public class HeirarchiChild1 extends HierarchiParent {

	public void sum() {

		int a = 10;
		int b = 10;
		int c = a + b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		HeirarchiChild1 obj1 = new HeirarchiChild1();
		obj1.display();
		obj1.sum();

	}

}
