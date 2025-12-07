package exercice3;

import exercice1.Deplcable;

public class Produit extends Article implements Deplcable {
	private double prix ;
	public Produit(String nom, int stock, double prix ) {
		super(nom, stock);
		this.prix=prix;
	}
	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	@Override
	public void afficherInfos() {
		System.out.println("nom="+ nom +"stock="+stock+"prix="+prix);
	}
	@Override
	public void deplacer(int dx, int dy) {
		System.out.println("le deplacement de produit a les cordoonees de x="+dx+"y="+dy);
	}
	public void retirerStock(int quantite) throws StockInsuffisantException {
		if(quantite > stock) {
			throw new StockInsuffisantException("quantite invalide ");
		}
		setStock(stock-quantite);
	}
}
