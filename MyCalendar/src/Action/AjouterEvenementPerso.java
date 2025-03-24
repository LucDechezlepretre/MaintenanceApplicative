package Action;

import Events.EventFactory;
import calendar.CalendarManager;
import utilisateur.Utilisateur;

import java.util.Scanner;

public class AjouterEvenementPerso extends ActionUtilisateur {
    public AjouterEvenementPerso(CalendarManager calendar, Scanner scanner, Utilisateur utilisateur) {
        super(calendar, scanner, utilisateur);
    }

    @Override
    public void execute() {
        System.out.println("Type d'événement : ");
        String type = sc.nextLine();
        System.out.print("Titre de l'événement : ");
        String titre = sc.nextLine();
        System.out.print("Année (AAAA) : ");
        int annee = Integer.parseInt(sc.nextLine());
        System.out.print("Mois (1-12) : ");
        int mois = Integer.parseInt(sc.nextLine());
        System.out.print("Jour (1-31) : ");
        int jour = Integer.parseInt(sc.nextLine());
        System.out.print("Heure début (0-23) : ");
        int heure = Integer.parseInt(sc.nextLine());
        System.out.print("Minute début (0-59) : ");
        int minute = Integer.parseInt(sc.nextLine());
        System.out.print("Durée (en minutes) : ");
        int duree = Integer.parseInt(sc.nextLine());

        this.cm.ajouterEvent(EventFactory.createPerso(type, titre, utilisateur,annee, mois, jour, heure, minute, duree));
    }
}
