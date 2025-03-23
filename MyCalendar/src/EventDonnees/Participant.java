package EventDonnees;

public class Participant {
    private String nom;

    public Participant(String nom) {
        if(!nom.equals("")){
            this.nom = nom;
        } else{
            throw new RuntimeException("Erreur dans le nom du participants");
        }
    }

    @Override
    public String toString() {
        return nom;
    }

    public String getNom() {
        return nom;
    }
}
