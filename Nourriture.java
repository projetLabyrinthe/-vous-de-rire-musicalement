package JeuxLabyrinthe;

public class Nourriture extends Objet {

  //  int force;
    
   /* public Nourriture(Piece p) {
        super(p);
        force = (int) (Math.random() * 3 + 1);
    }
    public Nourriture(Piece p, int numero, Position po) {
		super(p, numero, po);
		 
	}
	public void affiche() {
        super.affiche();
    }

    public int getForce(){
        return force;
    }

    public String toString() {
    
    	return	super.toString();
    }
    */
  private int ptForceRendus;
	public Nourriture(Piece piece, int ptForceRendus) {
		super(piece);
		this.ptForceRendus = ptForceRendus;
	}
	
	public Nourriture(Piece piece) {
		super(piece);
		int ptFR = (int) (Math.random()*5 + 1); // Valeur choisie aléatoirement entre 1 et 5
		this.ptForceRendus = ptFR;
	}

	public int getPtForceRendus() {
		return ptForceRendus;
	}
	
	@Override
	public void executeOp(Joueur j) {
		if(!this.estConsomme()) {
			super.addToPlayerObjects(j);
			j.incrPtForce(this.ptForceRendus);
		}
	}
}
