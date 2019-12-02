package JeuxLabyrinthe;

public abstract class Individu {

    private Piece position;
    private int individuId;
    private Position pos;

    public Individu(Piece p,int num,Position pos) {
        position = p;
        this.individuId=num;
        this.pos=pos;
    }

    public void affiche() {
        position.affiche();
    }

    public void setPosition(Piece position) {
		this.position = position;
	}
    

	public int getIndividuId() {
		return individuId;
	}

	public void setIndividuId(int individuId) {
		this.individuId = individuId;
	}

	public Position getPos() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
	}

	public void deplacer(char r) {
    	position = position.pieceVoisine(r);
    }

    public Piece getPosition() {
        return position;
    }
}
