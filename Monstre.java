package JeuxLabyrinthe;

public class Monstre extends Individu {
	/*
	
	private int force
	public Monstre(Piece p, int num, Position pos,int force)
	{
		super(p, num, pos);
		final int MINFORCE = 5;
		final int  MAXFORCE = 20;
		force = MINFORCE;
		force += (int) (Math.random()*( MAXFORCE - MINFORCE +1)); // entre 5 et MAXFORCE
	}
	
	public void affiche()
	{
		System.out.println("Monstre de force : "+force);
	}
	
	public int getForce()
	{
		return force;
	}
	*/
	private int forceMonstre;
	
	public Monstre(Piece piece, int forceMonstre) {
		super(piece);
		this.forceMonstre = forceMonstre;
	}
	
	public Monstre(Piece piece) {
		this(piece, (int)(Math.random()*5+1)); // Ici forceMonstre est un nombre choisi aléatoirement entre 1 et 5
	}


	@Override
	public void executeOp(Joueur j) {
		if(this.getNbOpmax()>0) {
			j.decrPtForce(forceMonstre);
			super.decrNbOpMax();
//			Après avoir donné des coups au Joueur, le monstre diparaît
			this.getMaCase().resetObjet();
			this.setMaCase(null);
		}
	}
}
