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
        this.cm.ajouterEvent(new EventRdv("Event1", user, 2025, 1, 1, 10, 30, 90));
        this.cm.ajouterEvent(new EventRdv("Event2", user, 2025, 1, 1, 11, 0, 30));
        assertEquals(1, this.cm.events.getNombreEvent(), "Les deux évènements se chevauchent ils ne devrait pas y avoir 2 events dans le calendrier");
    }
}
