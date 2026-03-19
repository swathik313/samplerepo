package inheritance;

public class MultiLevelParent extends MultiLevelGrandparent{
	
	public String parentmethod(String s) {
		
		System.out.println(s);
		return s;
	}

}
