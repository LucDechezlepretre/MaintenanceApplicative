package Events;

import EventDonnees.EventLieu;
import EventDonnees.EventParticipants;
import utilisateur.Utilisateur;

public class EventReunion extends Event {
    public EventLieu lieu; // utilisé seulement pour REUNION
    public EventParticipants participants; // séparés par virgules (pour REUNION uniquement)

    public EventReunion(String title, Utilisateur proprietaire, int annee, int mois, int jour, int heure, int minute, int dureeMinutes, String lieu, EventParticipants participants) {
        super(title, proprietaire, annee, mois, jour, heure, minute, dureeMinutes);
        this.lieu = new EventLieu(lieu);
        this.participants = participants;
    }

    @Override
    public String description() {
        return "Réunion : " + title + " à " + lieu + " avec " + participants;
    }
}
