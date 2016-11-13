package Visitor;
import java.util.HashSet;
import java.util.Set;

public class Universe implements Visitable {

	private Set<Pieces> pieces;
    private String name;
    
    
	
	public Set<Pieces> getPieces() {
		return pieces;
	}

	public Universe(String name) {
		super();
		this.name = name;
		pieces = new HashSet<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void ajouter(Pieces e){
		pieces.add(e);
	}
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}