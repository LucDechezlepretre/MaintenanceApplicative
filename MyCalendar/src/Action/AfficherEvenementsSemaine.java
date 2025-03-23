package Action;

import EventDonnees.EventDate;
import calendar.CalendarManager;
import utilisateur.Utilisateur;

import java.time.LocalDateTime;
import java.time.temporal.WeekFields;
import java.util.Locale;
import java.util.Scanner;

import static Events.Event.afficherListe;

public class AfficherEvenementsSemaine extends ActionUtilisateur {
    public AfficherEvenementsSemaine(CalendarManager cm, Scanner sc, Utilisateur user) {
        super(cm, sc, user);
    }

    @Override
    public void execute() {
        System.out.print("Entrez l'année (AAAA) : ");
        int anneeSemaine = Integer.parseInt(sc.nextLine());
        System.out.print("Entrez le numéro de semaine (1-52) : ");
        int semaine = Integer.parseInt(sc.nextLine());

        EventDate debutSemaine = new EventDate(LocalDateTime.now()
                .withYear(anneeSemaine)
                .with(WeekFields.of(Locale.FRANCE).weekOfYear(), semaine)
                .with(WeekFields.of(Locale.FRANCE).dayOfWeek(), 1)
                .withHour(0).withMinute(0));

        EventDate finSemaine = debutSemaine.ajouterJour(7);
        finSemaine = finSemaine.moinsSecondes(1);

        afficherListe(cm.eventsDansPeriode(debutSemaine, finSemaine));

    }
}
