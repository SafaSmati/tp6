package exercice3;

public abstract class Article {
	protected String nom;
	protected int stock;
	Article(String nom, int stock){
		this.nom=nom;
		this.stock=stock;
	}
	public String getNom() { return nom; }
	public int getstock() { return stock;}
	public void setStock(int stock) {
		this.stock=stock;
	}
	public abstract void afficherInfos(); 
	
}
