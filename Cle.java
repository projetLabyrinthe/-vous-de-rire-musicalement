package JeuxLabyrinthe;

public class Cle extends Objet {
private int numeroP;

    public Cle(Piece p, int numero, Position po,int numeroP) {
		super(p, numero, po);
	}

    public void affiche() {
        System.out.println("cle numï¿½rotï¿½ : " + numeroP);
    }

    

    @Override
    public String toString() {
        return super.toString();
    }
}
