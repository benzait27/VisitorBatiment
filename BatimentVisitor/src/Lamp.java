
public class Lamp extends ObjectBasique implements Visitable {

	
	
	  public Lamp() {
	        super();
	    }
	  
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
