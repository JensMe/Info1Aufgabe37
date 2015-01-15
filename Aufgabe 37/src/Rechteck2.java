/** Klasse die ein Rechteck beschreibt.
 * Diese Klasse speichert ein Rechteck. Mit verschiedenen
 * Methoden kann man die Klasse verwenden. Genauer sind diese
 * Schnittstellen dem Klassendiagramm oder der JavaDoc zu
 * entnehmen.
 * Da es sich hierbei um Aufgabenteil b) handelt und die Klassen
 * nicht den gleichen Namen in einem Projekt haben dürfen, heißt
 * diese Klasse Rechteck2 obwohl, es sich ebenfalls um ein Recheck
 * handelt und in der Aufgabenstellung auch die Klasse den Namen
 * Rechteck trägt. Es ist somit aus Gründen von Eclipse der Klassenname
 * Rechteck mit Rechteck2 gleichzusetzen.
 * 
 * @version 1.0
 * @author Paul, Tobias, Jens
 *
 */
public class Rechteck2 {
	private double laenge;
	private double umfang;
	
	
	/** Constructor fuer ein Rechteck
	 * 
	 * Als Parameter werden die Laenge und der Umfang benoetigt.
	 * Die Attribute der Klasse werden auf die Parameter gesetzt.
	 * @param laenge als double
	 * @param beite als double
	 */
	public Rechteck2 (double laenge, double breite){
		this.laenge = laenge;
		this.umfang = 2*(breite+laenge);
	}	
	
	/** Rueckgabe der Laenge
	 * 
	 * Die Laenge des Rechteckes wird zurueck gegeben.
	 * @return laenge als double
	 */	
	public double getLaenge() {
		return laenge;
	}
	
	/** Rueckgabe des Umfangs
	 * 
	 * Der Umfang des Rechteckes wird zurueck gegeben.
	 * @return Umfang als double
	 */
	public double getUmfang() {
		return umfang;
	}

	/** Rueckgabe der Breite
	 * 
	 * Die Breite des Rechteckes wird zurueck gegeben.
	 * @return Breite als double
	 */
	public double getBreite(){
		return (umfang / 2) - laenge;
	}
	
	/** Rueckgabe der Flaeche
	 * 
	 * Die Flaeche errechnet sich aus der Multiplikation von Laenge und Breite.
	 * @return Flaeche als double
	 */
	public double getFlaeche() {
		return getLaenge() * getBreite();
	}

}
