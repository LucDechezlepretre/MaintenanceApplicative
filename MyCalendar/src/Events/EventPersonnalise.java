package Events;

import EventDonnees.EventType;
import utilisateur.Utilisateur;

public class EventPersonnalise extends Event {
    private EventType type;
    public EventPersonnalise(String type, String title, Utilisateur proprietaire, int annee, int mois, int jour, int heure, int minute, int dureeMinutes) {
        super(title, proprietaire, annee, mois, jour, heure, minute, dureeMinutes);
        this.type = new EventType(type);
    }

    @Override
    public String description() {
        return "";
    }
}
