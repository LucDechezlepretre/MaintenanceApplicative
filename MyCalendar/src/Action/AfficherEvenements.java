package Action;


import calendar.CalendarManager;
import utilisateur.Utilisateur;

import java.util.Scanner;

public class AfficherEvenements extends ActionUtilisateur {
    public AfficherEvenements(CalendarManager cm, Scanner sc, Utilisateur user) {
        super(cm, sc, user);
    }

    @Override
    public void execute() {
        cm.afficherEvenements();
    }
}
