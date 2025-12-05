package exercice1;

public abstract class Personne {
    protected String nom;
    protected int age;

    public Personne(String nom, int age) throws AgeInvalideException {
        this.nom = nom;

        // Vérification de la validité de l'âge
        if (age < 0 || age > 120) {
            throw new AgeInvalideException("Âge invalide : " + age);
        }

        this.age = age;
    }
    public String getNom() { return nom ;}
    public int getAge() { return age ; }

    public void setAge(int age) throws AgeInvalideException {
        if (age <= 0 || age > 120) {
            throw new AgeInvalideException("Âge invalide : " + age);
        }
        this.age = age;
    }
}


