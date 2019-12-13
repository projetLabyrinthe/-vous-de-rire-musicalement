package JeuxLabyrinthe;

public class Medicament extends Objet {/*
    private int vie;
    public Medicament(Piece p, int numero, Position po) {
		super(p, numero, po);
		vie = (int) (Math.random() * 3 + 1);
	}
    public void affiche() {
        System.out.println("Medicament de " + vie + " point(s) ");
    }

    public int getVie() {
        return vie;
    }

    @Override
    public String toString() {
        return "Medic " + vie + " point(s)";
    }
    */private int ptVieRendus
	public Medicament(Piece piece, int ptVieRendus) {
		super(piece);
		this.ptVieRendus = ptVieRendus;
	}
	
	public Medicament(Piece piece) {
		super(piece);
		int ptVR = (int) (Math.random()*5 + 1); // Valeur choisie aléatoirement entre 1 et 5
		this.ptVieRendus = ptVR;
	}

	public int getPtVieRendus() {
		return ptVieRendus;
	}
	
	@Override
	public void executeOp(Joueur j) {
		if(!this.estConsomme()) {
			super.addToPlayerObjects(j);
			j.incrPtVie(this.ptVieRendus);
		}
	}
}
