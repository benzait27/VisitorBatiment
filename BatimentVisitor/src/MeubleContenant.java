import java.util.HashSet;
import java.util.Set;

public class MeubleContenant implements Visitable {

	Set<ObjectBasique> pieces;

  
	
	public Set<ObjectBasique> getPieces() {
		return pieces;
	}

	public MeubleContenant() {
		super();
		pieces = new HashSet<>();
	}
	
	
	public void ajouter(ObjectBasique e){
		pieces.add(e);
	}
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}