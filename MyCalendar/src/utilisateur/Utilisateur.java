package utilisateur;

import java.util.Objects;

public class Utilisateur {
    private String nom;
    private String mdp;
    private boolean isConnected;

    public Utilisateur(String nom, String mdp) {
        this.nom = nom;
        this.mdp = mdp;
        this.isConnected = false;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Utilisateur that = (Utilisateur) o;
        return Objects.equals(nom, that.nom) && Objects.equals(mdp, that.mdp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, mdp);
    }

    @Override
    public String toString() {
        return nom;
    }
}
