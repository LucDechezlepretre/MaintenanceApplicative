package Events;

import EventDonnees.EventFrequenceJours;
import utilisateur.Utilisateur;

public class EventPeriodique extends Event {
    public EventFrequenceJours frequenceJours; // uniquement pour PERIODIQUE

    public EventPeriodique(String title, Utilisateur proprietaire, int annee, int mois, int jour, int heure, int minute, int dureeMinutes, int frequenceJours) {
        super(title, proprietaire, annee, mois, jour, heure, minute, dureeMinutes);
        this.frequenceJours = new EventFrequenceJours(frequenceJours);
    }

    @Override
    public String description() {
        return "Événement périodique : " + title + " tous les " + frequenceJours + " jours";
    }
}
