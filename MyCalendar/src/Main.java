import Action.ActionUtilisateur;
import calendar.CalendarManager;
import Action.*;
import utilisateur.Utilisateur;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalendarManager calendar = new CalendarManager();
        Scanner scanner = new Scanner(System.in);
        Utilisateur utilisateur = new Utilisateur("", "");
        boolean continuer = true;

        List<Utilisateur> utilisateurs = new ArrayList<>();
        utilisateurs.add(new Utilisateur("Roger", "Chat"));
        utilisateurs.add(new Utilisateur("Pierre", "KiRouhl"));

        List<ActionUtilisateur> actions = new ArrayList<>();
        actions.add(new VoirEvenements(calendar, scanner, utilisateur));
        actions.add(new AjouterRdvPerso(calendar, scanner, utilisateur));
        actions.add(new AjouterReunion(calendar, scanner, utilisateur));
        actions.add(new AjouterEvenementPeriodique(calendar, scanner, utilisateur));
        actions.add(new AjouterEvenementPerso(calendar, scanner, utilisateur));
        actions.add(new Deconnexion(calendar, scanner, utilisateur));

        List<Action> actionsConnexion = new ArrayList<>();
        actionsConnexion.add(new Connexion(calendar, scanner, utilisateurs, utilisateur));
        actionsConnexion.add(new CreerUtilisateur(calendar, scanner, utilisateurs, utilisateur));
        while (true) {
            if (!utilisateur.isConnected()) {
                System.out.println("  _____         _                   _                __  __");
                System.out.println(" / ____|       | |                 | |              |  \\/  |");
                System.out.println(
                        "| |       __ _ | |  ___  _ __    __| |  __ _  _ __  | \\  / |  __ _  _ __    __ _   __ _   ___  _ __");
                System.out.println(
                        "| |      / _` || | / _ \\| '_ \\  / _` | / _` || '__| | |\\/| | / _` || '_ \\  / _` | / _` | / _ \\| '__|");
                System.out.println(
                        "| |____ | (_| || ||  __/| | | || (_| || (_| || |    | |  | || (_| || | | || (_| || (_| ||  __/| |");
                System.out.println(
                        " \\_____| \\__,_||_| \\___||_| |_| \\__,_| \\__,_||_|    |_|  |_| \\__,_||_| |_| \\__,_| \\__, | \\___||_|");
                System.out.println(
                        "                                                                                   __/ |");
                System.out.println(
                        "                                                                                  |___/");

                System.out.println("1 - Se connecter");
                System.out.println("2 - Créer un compte");
                System.out.println("Choix : ");
                String choix = scanner.nextLine();
                actionsConnexion.get(Integer.parseInt(choix)-1).execute();
            }
            while (continuer && utilisateur.isConnected()) {
                System.out.println("\nBonjour, " + utilisateur);
                System.out.println("=== Menu Gestionnaire d'Événements ===");
                System.out.println("1 - Voir les événements");
                System.out.println("2 - Ajouter un rendez-vous perso");
                System.out.println("3 - Ajouter une réunion");
                System.out.println("4 - Ajouter un évènement périodique");
                System.out.println("5 - Ajouter un évènement personnalisé");
                System.out.println("6 - Se déconnecter");
                System.out.print("Votre choix : ");

                String choix = scanner.nextLine();
                actions.get(Integer.parseInt(choix)-1).execute();
            }
        }
    }
}
