package JeuxLabyrinthe;

public class Medicament extends Objet {

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
}
