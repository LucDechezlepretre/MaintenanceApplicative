package EventDonnees;

public final class EventTitle {
    private String title;

    public EventTitle(String title) {
        if(!title.equals("")){
            this.title = title;
        }
    }

    public String getTitle() {
        return title;
    }
}
