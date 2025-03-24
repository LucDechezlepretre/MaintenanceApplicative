package EventDonnees;

import Events.Event;
import Events.EventPeriodique;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Evements{
    private Map<Integer, Event> eventsList;

    public Evements() {
        this.eventsList = new HashMap<>();
    }

    public void ajouter(Event e){
        if(chevaucheAucunEvent(e)){
            this.eventsList.put(this.eventsList.size()+1, e);
            System.out.println("Événement ajouté.");
        }else{
            System.out.println("L'événement n'as pas été ajouté à cause du chevauchement horaire");
        }
    }

    public List<Event> getEventsList() {
        return eventsList.values().stream().toList();
    }

    public void afficher() {
        if (eventsList.isEmpty()) {
            System.out.println("Aucun événement trouvé pour cette période.");
        } else {
            System.out.println("Événements trouvés : ");
            for (Event e : this.getEventsList()) {
                System.out.println("- " + e.description());
            }
        }
    }
    public int getNombreEvent(){
        return this.eventsList.size();
    }

    public boolean chevaucheAucunEvent(Event event){
        for(Event e : this.getEventsList()){
            if(conflit(event, e)){
                return false;
            }
        }
        return true;
    }
    public void supprimer(int id){
        this.eventsList.remove(id);
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
