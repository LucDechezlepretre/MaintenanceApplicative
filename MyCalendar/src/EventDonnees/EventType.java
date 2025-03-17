package EventDonnees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EventType {
    private List<String> types;
    private String eventType;

    public EventType(String t) {
        this.types = new ArrayList<>(Arrays.asList("RDV_PERSONNEL", "REUNION", "PERIODIQUE"));
        if(this.types.contains(t)){
            this.eventType = t;
        }
    }
    public boolean egal(EventType e){
        return this.eventType.equals(e.toString());
    }

    @Override
    public String toString() {
        return this.eventType;
    }
}
