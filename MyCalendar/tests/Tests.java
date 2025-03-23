import Events.EventPersonnalise;
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
        assertEquals("Anniversaire de julie le 2025-01-02T15:20:00.000 pendant 90 minutes", this.cm.events.getEventsList().getFirst().toString());
    }
}
