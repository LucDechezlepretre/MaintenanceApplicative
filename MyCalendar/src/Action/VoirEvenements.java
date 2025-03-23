package Action;

import calendar.CalendarManager;
import utilisateur.Utilisateur;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VoirEvenements extends ActionUtilisateur {
    List<ActionUtilisateur> actions;
    public VoirEvenements(CalendarManager cm, Scanner sc, Utilisateur user) {
        super(cm, sc, user);
        actions = new ArrayList<>();
        actions.add(new AfficherEvenements(cm, sc, user));
        actions.add(new AfficherEvenementsMois(cm, sc, user));
        actions.add(new AfficherEvenementsSemaine(cm, sc, user));
        actions.add(new AfficherEvenementsJour(cm, sc, user));
        actions.add(new Retour(cm, sc, user));
    }

    @Override
    public void execute() {
        String choix;
        System.out.println("\n=== Menu de visualisation d'Événements ===");
        System.out.println("1 - Afficher TOUS les événements");
        System.out.println("2 - Afficher les événements d'un MOIS précis");
        System.out.println("3 - Afficher les événements d'une SEMAINE précise");
        System.out.println("4 - Afficher les événements d'un JOUR précis");
        System.out.println("5 - Retour");
        System.out.print("Votre choix : ");

        choix = sc.nextLine();
        actions.get(Integer.parseInt(choix)-1).execute();
    }
}
