package EventDonnees;

public final class EventDuree {
    private int duree;

    public EventDuree(int duree) {
        if(duree >= 0) {
            this.duree = duree;
        }else {
            throw new RuntimeException("Erreur dans le format de la duree :"+duree+" est inferieur à 0");
        }
    }

    @Override
    public String toString() {
        return duree+"";
    }

    public int getDuree() {
        return duree;
    }
}
