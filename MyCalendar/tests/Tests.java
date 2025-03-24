import Events.Event;
import Events.EventPersonnalise;
import Events.EventRdv;
import calendar.CalendarManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utilisateur.Utilisateur;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    private CalendarManager cm;
    @BeforeEach
    public void init(){
        this.cm = new CalendarManager();
    }
    @Test
    public void testEvenementsPersonnalise(){
        this.cm.ajouterEvent(new EventPersonnalise("Anniversaire", "Anniversaire de julie", new Utilisateur("Luc", "123"),
                2025, 1, 2, 15, 20, 90));
        assertEquals("Anniversaire de julie le 2025-01-02T15:20 pendant 90 minutes", this.cm.events.getEventsList().getFirst().description());
    }

    @Test
    public void testChevauchementHoraires(){
        Utilisateur user = new Utilisateur("luc", "123");
        Event e = new EventRdv("Event1", user, 2025, 2, 1, 10, 30, 90);
        Event e2 = new EventRdv("Event2", user, 2025, 2, 1, 11, 0, 30);
        this.cm.ajouterEvent(e);
        this.cm.ajouterEvent(e2);
        this.cm.afficherEvenements();
        assertEquals(1, this.cm.events.getNombreEvent(), "Les deux évènements se chevauchent ils ne devrait pas y avoir 2 events dans le calendrier");
    }

    @Test
    public void testSuppressionAvecID(){
        this.cm.ajouterEvent(new EventRdv("Test", new Utilisateur("luc", "123"), 2025, 1, 1, 1, 1, 10));
        this.cm.supprimer(1);
        assertEquals(0, this.cm.events.getNombreEvent(), "L'évènement devrait être supprimé");
    }
    @Test
    public void testMauvaiseSuppression(){
        this.cm.ajouterEvent(new EventRdv("Test", new Utilisateur("luc", "123"), 2025, 1, 1, 1, 1, 10));
        this.cm.supprimer(2);
        assertEquals(1, this.cm.events.getNombreEvent(), "L'évènement ne devrait pas être supprimé");
    }
}
