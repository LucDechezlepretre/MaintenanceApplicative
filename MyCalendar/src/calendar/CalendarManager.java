package calendar;

import EventDonnees.Evements;
import EventDonnees.EventDate;
import Events.EventPeriodique;
import Events.*;
public class CalendarManager {
    public Evements events;

    public CalendarManager() {
        this.events = new Evements();
    }

    public void ajouterEvent(Event e) {
        events.ajouter(e);
    }

    public Evements eventsDansPeriode(EventDate debut, EventDate fin) {
        Evements result = new Evements();
        for (Event e : events.getEventsList()) {
            if (e instanceof EventPeriodique) {
                EventDate temp = e.dateDebut;
                while (temp.estAvant(fin)) {
                    if (!temp.estAvant(debut)) {
                        result.ajouter(e);
                        break;
                    }
                    temp = temp.ajouterJour(((EventPeriodique) e).frequenceJours.getFrequence());
                }
            } else if (!e.dateDebut.estAvant(debut) && !e.dateDebut.estApres(fin)) {
                result.ajouter(e);
            }
        }
        return result;
    }

    public void afficherEvenements() {
        for (Event e : events.getEventsList()) {
            System.out.println(e.description());
        }
    }
}