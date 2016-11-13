package Visitor;


public class Bureau extends MeubleContenant implements Visitable{

	
	public Bureau() {

	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}
	

}
