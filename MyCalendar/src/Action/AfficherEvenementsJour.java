package Action;

import EventDonnees.EventDate;
import calendar.CalendarManager;
import utilisateur.Utilisateur;

import java.util.Scanner;

import static Events.Event.afficherListe;

public class AfficherEvenementsJour extends ActionUtilisateur {
    public AfficherEvenementsJour(CalendarManager cm, Scanner sc, Utilisateur user) {
        super(cm, sc, user);
    }

    @Override
    public void execute() {
        System.out.print("Entrez l'année (AAAA) : ");
        int anneeJour = Integer.parseInt(sc.nextLine());
        System.out.print("Entrez le mois (1-12) : ");
        int moisJour = Integer.parseInt(sc.nextLine());
        System.out.print("Entrez le jour (1-31) : ");
        int jour = Integer.parseInt(sc.nextLine());

        EventDate debutJour = new EventDate(anneeJour, moisJour, jour, 0, 0);
        EventDate finJour = debutJour.ajouterJour(1);
        finJour = finJour.moinsSecondes(1);

        afficherListe(cm.eventsDansPeriode(debutJour, finJour));
    }
}
