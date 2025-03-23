package Action;

import calendar.CalendarManager;
import utilisateur.Utilisateur;

import java.util.List;
import java.util.Scanner;

public class CreerUtilisateur implements Action{
    private List<Utilisateur> utilisateurs;
    private Utilisateur utilisateur;
    protected CalendarManager cm;
    protected Scanner sc;

    public CreerUtilisateur(CalendarManager cm, Scanner sc, List<Utilisateur> users, Utilisateur u) {
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
        System.out.print("Répéter mot de passe: ");
        if (sc.nextLine().equals(motDePasse)) {
            utilisateur.setNom(utilisateurNom);
            utilisateur.setMdp(motDePasse);
            utilisateurs.add(utilisateur);
        } else {
            System.out.println("Les mots de passes ne correspondent pas...");
            utilisateur.setNom("");
            utilisateur.setMdp("");
            utilisateur.setConnected(false);
        }
    }
}
