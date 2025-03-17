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
}
