package JeuxLabyrinthe;

public class Position {
private int x;
private int y;
public static final double Epsilon=1/10000000;
	public Position(int x,int y) {
		this.x=x;
		this.y=y;
		// TODO Auto-generated constructor stub
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
public boolean egalitePosition(Position po) {
	if((Math.abs(x-po.getX())<Epsilon) &&(Math.abs(y-po.getY())<Epsilon))
		return true;
	else 
		return false;
}
}
