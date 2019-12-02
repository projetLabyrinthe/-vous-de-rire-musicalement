package JeuxLabyrinthe;


public class Porte {
	private Piece devant;
	private Piece derriere;
	private boolean ferme;
	int numeroC;

	public Porte()
	{
		ferme = false;
	}
	
	public void PorteOuvert(int i)
	{
		numeroC = i;
		this.ferme = true;
	}
	
	public void affiche()
	{
		if (ferme)
			System.out.println("porte ferm�e Num�ro"+numeroC);
		else
			System.out.println("porte ouverte");
		
	}
	
	public void ajoutPiece(Piece p1, Piece p2)
	{
		devant = p1;
		derriere = p2;
	}
	
	
	public Piece autrePiece(Piece p)
	{
		if (devant == p)
			return derriere;
		else
			return devant;
	}
	public boolean getFerme()
	{
		return ferme;
	}
	
	public int getNumeroC()
	{
		return numeroC;
	}
	public void ouvrir()
	{
		ferme = false;
	}
}
