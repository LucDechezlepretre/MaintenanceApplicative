package Events;

import EventDonnees.EventDate;
import EventDonnees.EventDuree;
import EventDonnees.EventProprietaire;
import EventDonnees.EventTitle;

public abstract class Event {
    public EventTitle title;
    public EventProprietaire proprietaire;
    public EventDate dateDebut;
    public EventDuree dureeMinutes;

    public Event(String title, String proprietaire, int annee, int mois, int jour, int heure, int minute, int dureeMinutes) {
        this.title = new EventTitle(title);
        this.proprietaire = new EventProprietaire(proprietaire);
        this.dateDebut = new EventDate(annee, mois, jour, heure, minute);
        this.dureeMinutes = new EventDuree(dureeMinutes);
    }

    public abstract String description();
}