package Action;

import calendar.CalendarManager;
import utilisateur.Utilisateur;

import java.util.Scanner;

public class Deconnexion extends ActionUtilisateur{
    public Deconnexion(CalendarManager cm, Scanner sc, Utilisateur u) {
        super(cm, sc, u);
    }

    @Override
    public void execute() {
        this.utilisateur.setConnected(false);
    }
}
