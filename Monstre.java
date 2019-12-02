package JeuxLabyrinthe;

public class Monstre extends Individu {
	
	private int force;

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
	
	
}
