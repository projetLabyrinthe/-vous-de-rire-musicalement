package JeuxLabyrinthe;

import java.util.*;

public class Joueur extends Individu {
 public static final int debut=10;
 private int force;
 private int vie;
 private List<Objet> objet;

public Joueur(Piece p, int num, Position pos,int debut,int force,int vie,List<Objet> objet) {
	super(p, num, pos);
	this.force=force;
		this.vie=vie;
		this.objet=objet;
}
 
	public int getForce() {
		  return force;
	 }
	 public int getVie() {
		  return vie;
	 }
	

	 public void setForce(int force) {
		  this.force=force;
	 }
	 public void setVie(int vie) {
		  this.vie=vie;
	 }
	 public void affiche() {
		 System.out.println("force: "+this.force+" vie :"+this.vie);
	 }
	 public boolean prendreObjet(Objet o) {
		 if(this.getPos().egalitePosition(o.getPo())) {
			 objet.add(o);
			 return true;
		 }
		 else 
			 return false;
	 }
	public void manger(Nourriture n) {
		if(prendreObjet(n)) {
			if(force<debut)
			force++;
			else
				force=debut;
		}
			
	}
	public void soigner(Medicament m) {
		if(prendreObjet(m))
			if(vie<debut)
				vie++;
				else
					vie=debut;
	}
	public void combat(Monstre montre) {
		
	}
	public void guerrir() {
		if(vie<debut)
			vie++;
			else
				vie=debut;
	}
	public void nourir() {
		if(force<debut)
			force++;
			else
				force=debut;
	}
	public boolean peutOuvrir(Porte p) {
		Iterator<Objet> iter = objet.iterator();
		boolean ouvre=false;
		while(iter.hasNext()) {
			Objet obj=iter.next();
			if(obj.getClass().equals("Cle")) {
				p.PorteOuvert( obj.numero);
			ouvre=true;
			}
		}
		return ouvre;
	}
	public boolean monstrePiece(Piece p,Monstre m) {
		return m.getPosition().equals(p);
	}
	public boolean repondreEnigme() {
		return true;
	}
}
 