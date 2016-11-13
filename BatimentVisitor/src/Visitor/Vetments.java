package Visitor;
public class  Vetments extends ObjectBasique  implements Visitable{

	
	String name;
	
	public Vetments(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}
	

}
