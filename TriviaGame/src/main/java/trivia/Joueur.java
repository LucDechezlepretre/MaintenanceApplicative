package trivia;

public class Joueur {
    private String name;
    private int place;
    private int purse;
    private boolean inPenaltyBox;

    public Joueur(String name) {
        this.name = name;
        this.place = 1;
        this.purse = 0;
        this.inPenaltyBox = false;
    }

    public void addToPlace(int i){
        this.place += i;
        if(this.place > 12) this.place = this.place - 12;
    }

    public void addToPurse(){
        this.purse += 1;
    }

    public String getName() {
        return name;
    }

    public int getPlace() {
        return place;
    }

    public int getPurse() {
        return purse;
    }

    public void setPurse(int purse) {
        this.purse = purse;
    }

    public boolean isInPenaltyBox() {
        return inPenaltyBox;
    }

    public void setInPenaltyBox(boolean inPenaltyBox) {
        this.inPenaltyBox = inPenaltyBox;
    }

    @Override
    public String toString() {
        return name;
    }
}
