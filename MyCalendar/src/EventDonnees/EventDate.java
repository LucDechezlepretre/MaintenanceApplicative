package EventDonnees;

import java.time.LocalDateTime;

public final class EventDate{
    private LocalDateTime date;

    public EventDate(int annee, int mois, int jour, int heure, int minute) {
        if((mois > 0 && mois <= 12) || (jour > 0 && jour <= 31) || (heure >= 0 && heure < 24) || (minute >= 0 && minute < 60)){
            this.date = LocalDateTime.of(annee, mois, jour, heure, minute, 0);
        }
        else{
            throw new RuntimeException("Erreur de format pour la date");
        }
    }

    public EventDate(LocalDateTime ldt){
        this.date = ldt;
    }

    public EventDate ajouterMois(int nbMois){
        return new EventDate(this.date.plusMonths(nbMois));
    }
    public EventDate ajouterJour(int jours){
        return new EventDate(this.date.plusDays(jours));
    }

    public EventDate ajouterminutes(int minutes){
        return new EventDate(this.date.plusMinutes(minutes));
    }

    public EventDate moinsSecondes(int secondes){
        return new EventDate(this.date.minusSeconds(secondes));
    }

    public boolean estAvant(EventDate fin) {
        return this.date.isBefore(fin.getDate());
    }

    public boolean estApres(EventDate ed){
        return this.date.isAfter(ed.getDate());
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return date.toString();
    }
    public EventDate clone(){
        return new EventDate(this.date);
    }
}
