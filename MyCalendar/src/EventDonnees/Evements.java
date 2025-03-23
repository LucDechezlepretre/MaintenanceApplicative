package EventDonnees;

import Events.Event;
import Events.EventPeriodique;

import java.util.ArrayList;
import java.util.List;

public class Evements{
    private List<Event> eventsList;

    public Evements() {
        this.eventsList = new ArrayList<>();
    }

    public void ajouter(Event e){
        if(chevaucheAucunEvent(e)){
            this.eventsList.add(e);
        }
    }

    public List<Event> getEventsList() {
        return eventsList;
    }

    public void afficher() {
        if (eventsList.isEmpty()) {
            System.out.println("Aucun événement trouvé pour cette période.");
        } else {
            System.out.println("Événements trouvés : ");
            for (Event e : eventsList) {
                System.out.println("- " + e.description());
            }
        }
    }
    public int getNombreEvent(){
        return this.eventsList.size();
    }

    public boolean chevaucheAucunEvent(Event event){
        for(Event e : this.eventsList){
            if(conflit(event, e)){
                return false;
            }
        }
        return true;
    }

    public boolean conflit(Event e1, Event e2) {
        EventDate fin1 = e1.dateDebut.ajouterminutes(e1.dureeMinutes.getDuree());
        EventDate fin2 = e2.dateDebut.ajouterminutes(e2.dureeMinutes.getDuree());

        if (e1 instanceof EventPeriodique || e2 instanceof EventPeriodique) {
            return false; // Simplification abusive
        }
        //System.out.println(e1.dateDebut.estAvant(fin2)+" et "+fin1.estApres(e2.dateDebut)+" "+(e1.dateDebut.estAvant(fin2) && fin1.estApres(e2.dateDebut)));
        return e1.dateDebut.estAvant(fin2) && fin1.estApres(e2.dateDebut);
    }
}
