package Action;

import Events.EventFactory;
import calendar.CalendarManager;
import utilisateur.Utilisateur;

import java.util.Scanner;

public class AjouterEvenementPeriodique extends ActionUtilisateur {
    public AjouterEvenementPeriodique(CalendarManager cm, Scanner sc, Utilisateur user) {
        super(cm, sc, user);
    }

    @Override
    public void execute() {
        // Ajout simplifié d'une réunion
        System.out.print("Titre de l'événement : ");
        String titre3 = sc.nextLine();
        System.out.print("Année (AAAA) : ");
        int annee3 = Integer.parseInt(sc.nextLine());
        System.out.print("Mois (1-12) : ");
        int moisRdv3 = Integer.parseInt(sc.nextLine());
        System.out.print("Jour (1-31) : ");
        int jourRdv3 = Integer.parseInt(sc.nextLine());
        System.out.print("Heure début (0-23) : ");
        int heure3 = Integer.parseInt(sc.nextLine());
        System.out.print("Minute début (0-59) : ");
        int minute3 = Integer.parseInt(sc.nextLine());
        System.out.print("Frequence (en jours) : ");
        int frequence = Integer.parseInt(sc.nextLine());

        cm.ajouterEvent(EventFactory.createPeriodique(titre3, utilisateur, annee3, moisRdv3, jourRdv3, heure3, minute3, 0,
                frequence));
    }
}
