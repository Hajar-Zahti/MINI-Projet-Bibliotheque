import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Entites.Livre;

public class LivreTest {
 
	private Livre livre;
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	    

	    @BeforeEach
	    public void setUp() {
	        livre = new Livre(1, "1234567890", "Titre", "Auteur", "Description");
	    }

	    @Test
	    public void testGetId() {
	        assertEquals(1, livre.getId());
	    }

	    @Test
	    public void testGetIsbn() {
	        assertEquals("1234567890", livre.getIsbn());
	    }

	    @Test
	    public void testGetTitre() {
	        assertEquals("Titre", livre.getTitre());
	    }

	    @Test
	    public void testGetAuteur() {
	        assertEquals("Auteur", livre.getAuteur());
	    }

	    @Test
	    public void testGetDescription() {
	        assertEquals("Description", livre.getDescription());
	    }

	    @Test
	    public void testAddReservation() {
	        ReservationBibliotheque reservation = new ReservationBibliotheque();
	        livre.addReservation(reservation);
	        ArrayList<ReservationBibliotheque> reservations = livre.getReservation();
	        assertTrue(reservations.contains(reservation));
	    }

	    @Test
	    public void testToString() {
	        String expected = "Livre{id=1, isbn=1234567890, titre=Titre, auteur=Auteur, description=Description, reservations=[]}";
	        assertEquals(expected, livre.toString());
	    }
	}

