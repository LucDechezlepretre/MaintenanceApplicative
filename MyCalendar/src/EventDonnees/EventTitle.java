package EventDonnees;

public final class EventTitle {
    private String title;

    public EventTitle(String title) {
        if(!title.equals("")){
            this.title = title;
        }
    }

    @Override
    public String toString() {
        return title;
    }

    public String getTitle() {
        return title;
    }
}
