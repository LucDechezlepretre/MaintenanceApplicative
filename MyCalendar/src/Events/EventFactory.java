package Events;

import EventDonnees.EventParticipants;
import utilisateur.Utilisateur;

public class EventFactory {
    public static final String REUNION = "REUNION";
    public static final String RDV_PERSONNEL = "RDV_PERSONNEL";
    public static final String PERIODIQUE = "PERIODIQUE";

    public static EventReunion createReunion(String title, Utilisateur proprietaire, int annee, int mois, int jour, int heure, int minute, int dureeMinutes,
                                             String lieu, EventParticipants participants){
                return new EventReunion(title, proprietaire, annee, mois, jour, heure, minute, dureeMinutes, lieu, participants);
        }

    public static EventRdv createRdv(String title, Utilisateur proprietaire, int annee, int mois, int jour, int heure, int minute, int dureeMinutes) {
        return new EventRdv(title, proprietaire, annee, mois, jour, heure, minute, dureeMinutes);
    }

    public static EventPeriodique createPeriodique(String title, Utilisateur proprietaire, int annee, int mois, int jour, int heure, int minute, int dureeMinutes, int frequenceJours) {
        return new EventPeriodique(title, proprietaire, annee, mois, jour, heure, minute, dureeMinutes, frequenceJours);
    }

    public static EventPersonnalise createPerso(String type, String title, Utilisateur proprietaire, int annee, int mois, int jour, int heure, int minute, int dureeMinutes) {
        return new EventPersonnalise(type, title, proprietaire, annee, mois, jour, heure, minute, dureeMinutes);
    }

}
