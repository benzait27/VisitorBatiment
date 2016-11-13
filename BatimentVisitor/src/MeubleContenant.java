import java.util.HashSet;
import java.util.Set;

public abstract class MeubleContenant implements Visitable {

	Set<ObjectBasique> pieces;

  
	
	public Set<ObjectBasique> getObjectBasique() {
		return pieces;
	}

	public MeubleContenant() {
		super();
		pieces = new HashSet<>();
	}
	
	
	public void ajouter(ObjectBasique e){
		pieces.add(e);
	}


}