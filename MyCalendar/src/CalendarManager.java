import EventDonnees.Evements;
import EventDonnees.EventDate;
import Events.EventPeriodique;
import EventDonnees.*;
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

    public boolean conflit(Event e1, Event e2) {
        EventDate fin1 = e1.dateDebut.ajouterminutes(e1.dureeMinutes.getDuree());
        EventDate fin2 = e2.dateDebut.ajouterminutes(e2.dureeMinutes.getDuree());

        if (e1 instanceof EventPeriodique || e2 instanceof EventPeriodique) {
            return false; // Simplification abusive
        }

        if (e1.dateDebut.estAvant(fin2) && fin1.estApres(e2.dateDebut)) {
            return true;
        }
        return false;
    }

    public void afficherEvenements() {
        for (Event e : events.getEventsList()) {
            System.out.println(e.description());
        }
    }
}