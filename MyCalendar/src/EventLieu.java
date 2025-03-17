public final class EventLieu {
    private String lieu;

    public EventLieu(String lieu) {
        if(!lieu.equals("")){
            this.lieu = lieu;
        }else {
            throw new RuntimeException("Erreur dans le nom du lieu");
        }
    }
}
