package exercice2;

import exercice1.Deplcable;

public class Cercle extends Forme implements Deplcable {
	private double rayon;
	public Cercle(int x, int y, double rayon) {
		super(x, y);
		this.setRayon(rayon) ;
	}
	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	@Override
	public double aire() {
		return(rayon*rayon*3.1456);
	}

	@Override
	public double perimetre() {
		return (2*rayon*3.1456);
	}
	@Override
	public void deplacer(int dx, int dy) {
		x+=dx;
		y+=dy;
	}
}
