package JeuxLabyrinthe;

public class Nourriture extends Objet {

  //  int force;

    
   /* public Nourriture(Piece p) {
        super(p);
        force = (int) (Math.random() * 3 + 1);
    }*/

    public Nourriture(Piece p, int numero, Position po) {
		super(p, numero, po);
		 
	}

	public void affiche() {
        super.affiche();
    }

   /* public int getForce() {
        return force;
    }*/

    public String toString() {
    
    	return	super.toString();
       
    }
}
