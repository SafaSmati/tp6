package exercice1;

public class Employe extends Personne implements Deplcable {

    private double salaire;
    private String poste;

    // Position simulée
    private int x = 0;
    private int y = 0;

    public Employe(String nom, int age, double salaire, String poste) throws AgeInvalideException {
        super(nom, age);
        this.salaire = salaire;
        this.poste = poste;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public void afficherInfos() {
        System.out.println("Nom : " + getNom());
        System.out.println("Âge : " + getAge());
        System.out.println("Salaire : " + salaire);
        System.out.println("Poste : " + poste);
        System.out.println("Position : (" + x + ", " + y + ")");
    }

    @Override
    public void deplacer(int dx, int dy) {
        x += dx;
        y += dy;
        System.out.println(getNom() + " a été déplacé à (" + x + ", " + y + ")");
    }
}
