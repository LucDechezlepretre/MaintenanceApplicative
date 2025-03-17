import java.time.LocalDateTime;

public class Event {
    public EventType type; // "RDV_PERSONNEL", "REUNION", "PERIODIQUE"
    public EventTitle title;
    public EventProprietaire proprietaire;
    public LocalDateTime dateDebut;
    public EventDuree dureeMinutes;
    public EventLieu lieu; // utilisé seulement pour REUNION
    public EventParticipants participants; // séparés par virgules (pour REUNION uniquement)
    public EventFrequenceJours frequenceJours; // uniquement pour PERIODIQUE

    public Event(String type, String title, String proprietaire, LocalDateTime dateDebut, int dureeMinutes,
                 String lieu, EventParticipants participants, int frequenceJours) {
        this.type = new EventType(type);
        this.title = new EventTitle(title);
        this.proprietaire = new EventProprietaire(proprietaire);
        this.dateDebut = dateDebut;
        this.dureeMinutes = new EventDuree(dureeMinutes);
        this.lieu = new EventLieu(lieu);
        this.participants = participants;
        this.frequenceJours = new EventFrequenceJours(frequenceJours);
    }

    public String description() {
        String desc = "";
        if (type.egal(new EventType("RDV_PERSONNEL"))) {
            desc = "RDV : " + title + " à " + dateDebut.toString();
        } else if (type.egal(new EventType("REUNION"))) {
            desc = "Réunion : " + title + " à " + lieu + " avec " + participants;
        } else if (type.egal(new EventType("PERIODIQUE"))) {
            desc = "Événement périodique : " + title + " tous les " + frequenceJours + " jours";
        }
        return desc;
    }
}