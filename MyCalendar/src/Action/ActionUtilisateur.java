package Action;

import calendar.CalendarManager;
import utilisateur.Utilisateur;

import java.util.Scanner;

public abstract class ActionUtilisateur implements Action {
    protected CalendarManager cm;
    protected Scanner sc;
    protected Utilisateur utilisateur;

    public ActionUtilisateur(CalendarManager cm, Scanner sc, Utilisateur u) {
        this.cm = cm;
        this.sc = sc;
        this.utilisateur = u;
    }

    public abstract void execute();
}
