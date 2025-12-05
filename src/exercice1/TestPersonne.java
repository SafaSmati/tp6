package exercice1;

public class TestPersonne {
    public static void main(String[] args) {

        try {
            Employe emp1 = new Employe("Alice", 30, 2500.0, "Développeur");
            Employe emp2 = new Employe("Bob", 45, 4000.0, "Manager");
            Employe emp3 = new Employe("Charlie", 28, 2200.0, "Technicien");

            emp1.afficherInfos();
            System.out.println();
            emp2.afficherInfos();
            System.out.println();
            emp3.afficherInfos();
            System.out.println();

            emp1.deplacer(5, 3);
            emp2.deplacer(-2, 4);
            emp3.deplacer(0, -3);

        } catch (AgeInvalideException e) {
            System.out.println("Erreur lors de la création d'un employé : " + e.getMessage());
        }
    }
}

