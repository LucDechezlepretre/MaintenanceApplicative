package Action;

import calendar.CalendarManager;
import utilisateur.Utilisateur;

import java.util.List;
import java.util.Scanner;

public class Connexion implements Action{
    private List<Utilisateur> utilisateurs;
    private Utilisateur utilisateur;
    protected CalendarManager cm;
    protected Scanner sc;

    public Connexion(CalendarManager cm, Scanner sc, List<Utilisateur> users, Utilisateur u) {
        this.cm = cm;
        this.sc = sc;
        this.utilisateurs = users;
        this.utilisateur = u;
    }
    @Override
    public void execute() {
        System.out.print("Nom d'utilisateur: ");
        String utilisateurNom = sc.nextLine();

        System.out.print("Mot de passe: ");
        String motDePasse = sc.nextLine();
        Utilisateur utilisateurTemp = new Utilisateur(utilisateurNom, motDePasse);
        for (int i = 0; i < utilisateurs.size(); i = i + 1) {
            if (utilisateurs.get(i).equals(utilisateurTemp)) {
                utilisateur.setNom(utilisateurs.get(i).getNom());
                utilisateur.setMdp(utilisateurs.get(i).getMdp());
                utilisateur.setConnected(true);
            }
        }
        System.out.println(this.utilisateur);
    }
}