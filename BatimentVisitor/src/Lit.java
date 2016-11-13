
public class Lit extends MeubleBasique  implements Visitable {

	
	
	
	
	public Lit() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
