package Visitor;
import java.util.HashSet;
import java.util.Set;

public class Pieces  implements Visitable {

	Set<ObjectMobile> ObjetMobiles;
    private String name;
    
    
	
	public Set<ObjectMobile> getPieces() {
		return ObjetMobiles;
	}

	public Pieces(String name) {
		super();
		this.name = name;
		ObjetMobiles = new HashSet<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void ajouter(ObjectMobile e){
		ObjetMobiles.add(e);
	}
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
