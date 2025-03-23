package EventDonnees;

public final class EventProprietaire {
    private String prop;

    public EventProprietaire(String p) {
        if (!p.equals("")) {
            this.prop = p;
        }
    }

    @Override
    public String toString() {
        return prop;
    }

    public String getProprietaire() {
        return prop;
    }
}