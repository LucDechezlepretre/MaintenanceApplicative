package Events;

public class EventRdv extends Event {
    public EventRdv(String title, String proprietaire, int annee, int mois, int jour, int heure, int minute, int dureeMinutes) {
        super(title, proprietaire, annee, mois, jour, heure, minute, dureeMinutes);
    }

    @Override
    public String description() {
        return "RDV : " + title + " à " + dateDebut.toString();
    }
}
