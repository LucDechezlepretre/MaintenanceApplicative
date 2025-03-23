package EventDonnees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EventType {
    private String eventType;

    public EventType(String t) {
        this.eventType = t;
    }
    public boolean egal(EventType e){
        return this.eventType.equals(e.toString());
    }

    @Override
    public String toString() {
        return this.eventType;
    }
}
