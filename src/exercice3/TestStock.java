package exercice3;

public class TestStock {
	public static void main (String[] args) {
		Produit p1 = new Produit("PC Portable", 10, 1500.0);
        Produit p2 = new Produit("Souris", 5, 25.0);
        Produit p3 = new Produit("Clavier", 3, 45.0);

        System.out.println("=== Informations des produits ===");
        p1.afficherInfos();
        p2.afficherInfos();
        p3.afficherInfos();

        System.out.println("\n=== Test déplacement ===");
        p1.deplacer(2, 3);
        p2.deplacer(-1, 4);
        p3.deplacer(0, 5);

        System.out.println("\n=== Test du retrait de stock ===");

        try {
            p1.retirerStock(3);
            System.out.println("Retrait OK pour p1");
        } catch (StockInsuffisantException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        try {
            p3.retirerStock(10); 
            System.out.println("Retrait OK pour p3");
        } catch (StockInsuffisantException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        try {
            p2.retirerStock(2);
            System.out.println("Retrait OK pour p2");
        } catch (StockInsuffisantException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        System.out.println("\n=== Stock après retraits ===");
        p1.afficherInfos();
        p2.afficherInfos();
        p3.afficherInfos();
    }
}

