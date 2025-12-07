package exercice2;

import exercice1.Deplcable;

public class Rectangle extends Forme implements Deplcable {
	private double largeur;
	private double hauteur;
	public Rectangle(int x, int y , double largeur, double hauteur) {
		super(x, y);
		this.hauteur=hauteur;
		this.largeur=largeur;
	}
	public double getLargeur() {
		return largeur;
	}
	public double getHauteur() {
		return hauteur;
	}
	public void setLargeur(double largeur) {
		this.largeur=largeur;
	}
	public void setHauteur(double hauteur) {
		this.hauteur=hauteur;
	}
	@Override
	public double aire() {
		return hauteur*largeur ;
	}
	@Override
	public double perimetre() {
		return (hauteur +  largeur)*2 ;
	}
	@Override
	public void deplacer(int dx, int dy) {
		x+=dx;
		y+=dy;
	}
}
