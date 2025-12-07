package exercice2;

public abstract class Forme {
	protected int x;
	protected int y;
	public Forme (int x, int y) {
		this.x=x;
		this.y=y;
	}
	 public int getX() {
		return x;
	}
	 public int getY() {
		return y;
	 }
	 public void setX(int x) {
		 this.x=x;
	 }
	 public void setY(int y) {
		 this.y=y;
	 }
	 public abstract double aire();
	 public abstract double perimetre();
	 protected abstract void deplacer(int i, int j);
}
