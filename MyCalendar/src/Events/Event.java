package Events;

import EventDonnees.EventDate;
import EventDonnees.EventDuree;
import EventDonnees.EventProprietaire;
import EventDonnees.EventTitle;
import utilisateur.Utilisateur;

import java.util.List;

public abstract class Event {
    public EventTitle title;
    public Utilisateur proprietaire;
    public EventDate dateDebut;
    public EventDuree dureeMinutes;

    public Event(String title, Utilisateur proprietaire, int annee, int mois, int jour, int heure, int minute, int dureeMinutes) {
        this.title = new EventTitle(title);
        this.proprietaire = proprietaire;
        this.dateDebut = new EventDate(annee, mois, jour, heure, minute);
        this.dureeMinutes = new EventDuree(dureeMinutes);
    }

    public abstract String description();

    public static void afficherListe(List<Event> evenements) {
        if (evenements.isEmpty()) {
            System.out.println("Aucun événement trouvé pour cette période.");
        } else {
            System.out.println("Événements trouvés : ");
            for (Event e : evenements) {
                System.out.println("- " + e.description());
            }
        }
    }
}