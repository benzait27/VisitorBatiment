package Visitor;
public interface Visitor {
	
	public void visit(Universe u);
	public void visit(Pieces p);
	public void visit(Bureau b);
	public void visit(Lit l);
	public void visit(CollectionDesLivre c);
	public void visit(Lamp l);
	public void visit(GardeRobe g);
	public void visit(Vetments v);

}
