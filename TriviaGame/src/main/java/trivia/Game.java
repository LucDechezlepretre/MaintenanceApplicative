package trivia;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

// REFACTOR ME
public class Game implements IGame {
    List<Joueur> players = new ArrayList<>();

    LinkedList popQuestions = new LinkedList();
    LinkedList scienceQuestions = new LinkedList();
    LinkedList sportsQuestions = new LinkedList();
    LinkedList rockQuestions = new LinkedList();

    int currentPlayer = 0;
    boolean isGettingOutOfPenaltyBox;

    public Game() {
        for (int i = 0; i < 50; i++) {
            popQuestions.addLast("Pop Question " + i);
            scienceQuestions.addLast(("Science Question " + i));
            sportsQuestions.addLast(("Sports Question " + i));
            rockQuestions.addLast("Rock Question " + i);
        }
    }

    public boolean isPlayable() {
        return (howManyPlayers() >= 2);
    }

    public boolean add(String playerName) {
        players.add(new Joueur(playerName));

        System.out.println(playerName + " was added");
        System.out.println("They are player number " + players.size());
        return true;
    }

    public int howManyPlayers() {
        return players.size();
    }

    public void roll(int roll) {
        Joueur joueur = players.get(currentPlayer);
        System.out.println(joueur.getName() + " is the current player");
        System.out.println("They have rolled a " + roll);

        if (joueur.isInPenaltyBox()) {
            if (roll % 2 == 0) {
                System.out.println(joueur + " is not getting out of the penalty box");
                return;
            }
            System.out.println(joueur + " is getting out of the penalty box");
            joueur.setInPenaltyBox(false);
        }
        joueur.addToPlace(roll);
        System.out.println(joueur
                + "'s new location is "
                + joueur.getPlace());
        System.out.println("The category is " + currentCategory());
        askQuestion();
    }

    private void askQuestion() {
        if (currentCategory() == "Pop") {
            System.out.println(popQuestions.removeFirst());
        }
        if (currentCategory() == "Science") {
            System.out.println(scienceQuestions.removeFirst());
        }
        if (currentCategory() == "Sports") {
            System.out.println(sportsQuestions.removeFirst());
        }
        if (currentCategory() == "Rock") {
            System.out.println(rockQuestions.removeFirst());
        }
    }


    private String currentCategory() {
        Joueur joueur = players.get(currentPlayer);
        if (joueur.getPlace() - 1 == 0) return "Pop";
        if (joueur.getPlace() - 1 == 4) return "Pop";
        if (joueur.getPlace() - 1 == 8) return "Pop";
        if (joueur.getPlace() - 1 == 1) return "Science";
        if (joueur.getPlace() - 1 == 5) return "Science";
        if (joueur.getPlace() - 1 == 9) return "Science";
        if (joueur.getPlace() - 1 == 2) return "Sports";
        if (joueur.getPlace() - 1 == 6) return "Sports";
        if (joueur.getPlace() - 1 == 10) return "Sports";
        return "Rock";
    }

    public boolean handleAnswer(boolean correct) {
        Joueur joueur = players.get(currentPlayer);
        boolean notAwinner = true;
        if (!joueur.isInPenaltyBox()) {
            if (correct) {
                System.out.println("Answer was correct!!!!");
                joueur.addToPurse();
                System.out.println(joueur
                        + " now has "
                        + joueur.getPurse()
                        + " Gold Coins.");
                notAwinner = didPlayerWin();

            } else {
                System.out.println("Question was incorrectly answered");
                System.out.println(joueur + " was sent to the penalty box");
                joueur.setInPenaltyBox(true);
            }
        }
        this.incrementCurrentPlayer();
        return notAwinner;
    }

    private void incrementCurrentPlayer() {
        currentPlayer++;
        if (currentPlayer == players.size()) currentPlayer = 0;
    }

    private boolean didPlayerWin() {
        Joueur joueur = players.get(currentPlayer);
        return !(joueur.getPurse() == 6);
    }
}
