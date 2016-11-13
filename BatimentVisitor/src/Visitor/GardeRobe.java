package Visitor;
public class GardeRobe extends MeubleContenant implements Visitable {

	  public GardeRobe() {
	        super();
	    }
	  
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
