package Action;

import Events.EventFactory;
import calendar.CalendarManager;
import utilisateur.Utilisateur;

import java.util.Scanner;

public class AjouterRdvPerso extends ActionUtilisateur {
    public AjouterRdvPerso(CalendarManager cm, Scanner sc, Utilisateur utilisateur) {
        super(cm, sc, utilisateur);
    }

    @Override
    public void execute() {
        // Ajout simplifié d'un RDV personnel
        System.out.print("Titre de l'événement : ");
        String titre = sc.nextLine();
        System.out.print("Année (AAAA) : ");
        int annee = Integer.parseInt(sc.nextLine());
        System.out.print("Mois (1-12) : ");
        int moisRdv = Integer.parseInt(sc.nextLine());
        System.out.print("Jour (1-31) : ");
        int jourRdv = Integer.parseInt(sc.nextLine());
        System.out.print("Heure début (0-23) : ");
        int heure = Integer.parseInt(sc.nextLine());
        System.out.print("Minute début (0-59) : ");
        int minute = Integer.parseInt(sc.nextLine());
        System.out.print("Durée (en minutes) : ");
        int duree = Integer.parseInt(sc.nextLine());

        cm.ajouterEvent(EventFactory.createRdv(titre, utilisateur,
                annee, moisRdv, jourRdv, heure, minute, duree));

        System.out.println("Événement ajouté.");
        cm.afficherEvenements();
    }
}
