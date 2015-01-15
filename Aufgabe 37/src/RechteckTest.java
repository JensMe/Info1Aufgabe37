import static org.junit.Assert.*;

import org.junit.Test;

public class RechteckTest {

    double epsilon = 0.000000001;

    @Test
    public void testGetLaenge() {
	Rechteck2 einRechteck = new Rechteck2(5.2, 0.8);
		
	assertEquals("Laenge des Rechtecks wird nicht korrekt zurueck gegeben.",
		     5.2,   //  erwarteter Wert
		     einRechteck.getLaenge(),
		     epsilon); 

    }

    @Test
    public void testGetBreite() {
	Rechteck2 einRechteck = new Rechteck2(5.2, 0.8);
		
	assertEquals("Breite des Rechtecks wird nicht korrekt zurueck gegeben.",
		     0.8,   //  erwarteter Wert
		     einRechteck.getBreite(),
		     epsilon); 
    }

    @Test
    public void testGetUmfang() {
	Rechteck2 einRechteck = new Rechteck2(5.2, 0.8);
		
	assertEquals("Umfang des Rechtecks wird nicht korrekt zurueck gegeben.",
		     12.0,   //  erwarteter Wert
		     einRechteck.getUmfang(),
		     epsilon); 
    }

    @Test
    public void testGetFlaeche() {
	Rechteck2 einRechteck = new Rechteck2(5.2, 0.8);
		
	assertEquals("Flaeche des Rechtecks wird nicht korrekt zurueck gegeben.",
		     4.16,   //  erwarteter Wert
		     einRechteck.getFlaeche(),
		     epsilon); 
    }

}
