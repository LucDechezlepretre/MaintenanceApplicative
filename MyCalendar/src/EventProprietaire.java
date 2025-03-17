public final class EventProprietaire {
    private String prop;

    public EventProprietaire(String p) {
        if (!p.equals("")) {
            this.prop = p;
        }
    }

    public String getProprietaire() {
        return prop;
    }
}