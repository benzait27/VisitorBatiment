
public class ObjectMobile implements Visitable {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
