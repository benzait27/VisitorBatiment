
public class ConcreteVisitor_Prefixe implements Visitor {

	@Override
	public void visit(Universe e) {
		System.out.println(e.getName());
		for (Pieces p:e.getPieces())
		{
			p.accept(this);
		}
		
		
	}


	@Override
	public void visit(Lamp l) {
		System.out.println("Je suis une lampe");
	}
	@Override
	public void visit(Pieces p) {
		// TODO Auto-generated method stub
		System.out.println(p.getName());
		for (ObjectMobile o:p.getPieces())
		{
			o.accept(this);
		}
	}

	@Override
	public void visit(Bureau b) {
		System.out.println("Je suis un Bureau");
		for (ObjectBasique o:b.getObjectBasique())
		{
			o.accept(this);
		}
		
	}

	@Override
	public void visit(Lit l) {
		System.out.println("Je suis un Lit");
		
	}

	@Override
	public void visit(CollectionDesLivre c) {
		System.out.println("Je suis un Collection de "+c.nb+"Livres");
		
	}

	@Override
	public void visit(GardeRobe g) {
		System.out.println("Je suis une GardeRobe");
		for (ObjectBasique o:g.getObjectBasique())
		{
			o.accept(this);
		}
		
	}

	@Override
	public void visit(Vetments v) {
		System.out.println("Je suis"+v.getName());
		
	}


}
