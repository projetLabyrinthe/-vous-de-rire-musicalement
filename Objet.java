package JeuxLabyrinthe;


public class Objet {
	
	Piece position;
	int numero;
	Position po;
	
	public Objet(Piece p,int numero,Position po)
	{
		this.position = p;
		this.numero=numero;
		this.po=po;
	}
	
	public void affiche()
	{
		position.affiche();
	}

	public Piece getPosition()
	{
		return position;
	}
	
	public void setPosition(Piece p)
	{
		position = p;
	}
	
	
	public Position getPo() {
		return po;
	}

	public void setPo(Position po) {
		this.po = po;
	}

	public void pris()
	{
		position = null;
	}
	
	public int getNumero(){
		return numero;
	}
}
