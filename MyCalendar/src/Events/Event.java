package Events;

import EventDonnees.*;
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

    public static void afficherListe(Evements evenements) {
        evenements.afficher();
    }
}