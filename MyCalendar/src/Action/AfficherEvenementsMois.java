package Action;

import EventDonnees.EventDate;
import calendar.CalendarManager;
import utilisateur.Utilisateur;

import java.util.Scanner;

import static Events.Event.afficherListe;

public class AfficherEvenementsMois extends ActionUtilisateur {

    public AfficherEvenementsMois(CalendarManager cm, Scanner sc, Utilisateur user) {
        super(cm, sc, user);
    }

    @Override
    public void execute() {
        System.out.print("Entrez l'année (AAAA) : ");
        int anneeMois = Integer.parseInt(sc.nextLine());
        System.out.print("Entrez le mois (1-12) : ");
        int mois = Integer.parseInt(sc.nextLine());

        EventDate debutMois = new EventDate(anneeMois, mois, 1, 0, 0);
        EventDate finMois = debutMois.ajouterMois(1);
        finMois = finMois.moinsSecondes(1);

        afficherListe(cm.eventsDansPeriode(debutMois, finMois));
    }
}
