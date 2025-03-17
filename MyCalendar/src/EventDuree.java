public final class EventDuree {
    private int duree;

    public EventDuree(int duree) {
        if(duree > 0) {
            this.duree = duree;
        }else {
            throw new RuntimeException("Erreur dans le format de la duree");
        }
    }

    public int getDuree() {
        return duree;
    }
}
