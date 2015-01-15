/** Klasse die ein Rechteck beschreibt.
 * Diese Klasse speichert ein Rechteck. Mit verschiedenen
 * Methoden kann man die Klasse verwenden. Genauer sind diese
 * Schnittstellen dem Klassendiagramm oder der JavaDoc zu
 * entnehmen.
 *  
 * @version 1.0
 * @author Paul, Tobias, Jens
 *
 */
public class Rechteck {
	private double laenge;
	private double breite;
	
	/** Constructor fuer ein Rechteck
	 * 
	 * Als Parameter werden die Laenge und die Breite benoetigt.
	 * Die Attribute der Klasse werden auf die Parameter gesetzt.
	 * @param laenge als double
	 * @param breite als double
	 */
	
	public Rechteck(double laenge, double breite){
		this.laenge = laenge;
		this.breite = breite;
	}
	
	/** Rueckgabe der Laenge
	 * 
	 * Die Laenge des Rechteckes wird zurueck gegeben.
	 * @return laenge als double
	 */
	public double getLaenge() {
		return laenge;
	} 
	
	/** Rueckgabe der Breite
	 * 
	 * Die Breite des Rechteckes wird zurueck gegeben.
	 * @return Breite als double
	 */
	public double getBreite() {
		return breite;
	}
	
	/** Rueckgabe des Umfanges
	 * 
	 * Die Laenge und Breite werden summiert und anschliessend mit dem Faktor 2 multipliziert.
	 * @return Umfang als double
	 */
	public double getUmfang() {
		return 2*(laenge + breite);
	}
	
	/** Rueckgabe der Flaeche
	 * 
	 * Die Flaeche errechnet sich aus der Multiplikation von Laenge und Breite.
	 * @return Flaeche als double
	 */
	public double getFlaeche() {
		return laenge * breite;
	}	
}
