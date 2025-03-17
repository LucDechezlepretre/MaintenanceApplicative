import java.time.LocalDateTime;

public class EventDate {
    private LocalDateTime date;

    public EventDate(int annee, int moisRdv, int jourRdv, int heure, int minute) {
        if((moisRdv > 0 && moisRdv <= 12) || (jourRdv > 0 && jourRdv <= 31) || (heure >= 0 && heure < 24) || (minute >= 0 && minute < 60)){
            this.date = LocalDateTime.of(annee, moisRdv, jourRdv, heure, minute);
        }
        else{
            throw new RuntimeException("Erreur de format pour la date");
        }
    }

    public void ajouterMois(int nbMois){
        this.date = this.date.plusMonths(nbMois);
    }
    public void ajouterJour(int jour){
        this.date = this.date.plusDays(jour);
    }
    public void moinsSecondes(int secondes){
        this.date = this.date.minusSeconds(secondes);
    }
}
