public final class EventFrequenceJours {
    private int frequenceJours;

    public EventFrequenceJours(int frequenceJours) {
        if(this.frequenceJours >= 0){
            this.frequenceJours = frequenceJours;
        }else{
            throw new RuntimeException("Erreur dans le format de la frequence jours");
        }
    }

    public int getFrequence() {
        return frequenceJours;
    }
}
