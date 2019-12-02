package JeuxLabyrinthe;


public class Tresor extends Objet {
	
	public Tresor(Piece p, int numero, Position po) {
		super(p, numero, po);
	}
	
	public void affiche()
	{
		System.out.println("Tresor");
	}

}
