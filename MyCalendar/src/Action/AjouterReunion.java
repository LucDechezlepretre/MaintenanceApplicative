package Action;

import EventDonnees.EventParticipants;
import EventDonnees.Participant;
import Events.EventFactory;
import calendar.CalendarManager;
import utilisateur.Utilisateur;

import java.util.Scanner;

public class AjouterReunion extends ActionUtilisateur {
    public AjouterReunion(CalendarManager cm, Scanner sc, Utilisateur utilisateur) {
        super(cm, sc, utilisateur);
    }

    @Override
    public void execute() {
        // Ajout simplifié d'une réunion
        System.out.print("Titre de l'événement : ");
        String titre2 = sc.nextLine();
        System.out.print("Année (AAAA) : ");
        int annee2 = Integer.parseInt(sc.nextLine());
        System.out.print("Mois (1-12) : ");
        int moisRdv2 = Integer.parseInt(sc.nextLine());
        System.out.print("Jour (1-31) : ");
        int jourRdv2 = Integer.parseInt(sc.nextLine());
        System.out.print("Heure début (0-23) : ");
        int heure2 = Integer.parseInt(sc.nextLine());
        System.out.print("Minute début (0-59) : ");
        int minute2 = Integer.parseInt(sc.nextLine());
        System.out.print("Durée (en minutes) : ");
        int duree2 = Integer.parseInt(sc.nextLine());
        System.out.println("Lieu :");
        String lieu = sc.nextLine();

        EventParticipants participants = new EventParticipants();
        participants.ajouterParticipant(new Participant(utilisateur.getNom()));

        boolean encore = true;
        System.out.println("Ajouter un participant ? (oui / non)");
        while (sc.nextLine().equals("oui"))
        {
            System.out.print("Participants : " + participants);
            Participant p = new Participant(sc.nextLine());
            participants.ajouterParticipant(p);
            System.out.println("Ajouter un participant ? (oui / non)");
        }

        cm.ajouterEvent(EventFactory.createReunion(titre2, utilisateur, annee2, moisRdv2, jourRdv2, heure2, minute2, duree2,
                lieu, participants));

        System.out.println("Événement ajouté.");

    }
}
