package Visitor;
public class CollectionDesLivre extends ObjectBasique implements Visitable {

      public  int nb;
     
   
	
	public CollectionDesLivre(int nb) {
		super();
		this.nb = nb;
	}



	public  void setNb(int nb) {
	this.nb = nb;
}



	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
