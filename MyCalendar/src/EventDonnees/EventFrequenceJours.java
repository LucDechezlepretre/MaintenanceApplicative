package EventDonnees;

public final class EventFrequenceJours {
    private int frequenceJours;

    public EventFrequenceJours(int frequenceJours) {
        if(this.frequenceJours >= 0){
            this.frequenceJours = frequenceJours;
        }else{
            throw new RuntimeException("Erreur dans le format de la frequence jours");
        }
    }

    @Override
    public String toString() {
        return frequenceJours+"";
    }

    public int getFrequence() {
        return frequenceJours;
    }
}
