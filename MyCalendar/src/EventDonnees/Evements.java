package EventDonnees;

import Events.Event;

import java.util.ArrayList;
import java.util.List;

public class Evements{
    private List<Event> eventsList;

    public Evements() {
        this.eventsList = new ArrayList<>();
    }

    public void ajouter(Event e){
        this.eventsList.add(e);
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
}
