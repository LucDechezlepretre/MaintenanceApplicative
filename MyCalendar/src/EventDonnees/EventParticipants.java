package EventDonnees;

import java.util.ArrayList;
import java.util.List;

public class EventParticipants {
    private List<Participant> participantList;

    public EventParticipants() {
        this.participantList = new ArrayList<>();
    }

    public void ajouterParticipant(Participant p){
        this.participantList.add(p);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Participant p : this.participantList){
            sb.append(p.toString());
            sb.append(" ");
        }
        return sb.toString();
    }
}
