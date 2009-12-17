/**
 * Berechnungen zur Zahlentheorie
 * 
 * @author Christoph Sch�ler
 * @version 0.1a3
 */
public class Zahlentheorie {
	// Keine Datenfelder, weil statische Klasse.

	// Kein Konstruktor, weil statische Klasse.

	/**
	 * Methode, die pr�ft, ob m n teilt. 
	 */
	public static boolean teilt(int m, int n) {
		if (n % m == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Statische Methode, die durch weitere Methodenaufrufe pr�ft, ob m eine 
	 * Primzahl ist und das Ergebniss als boolean zur�ckgibt.
	 */
	public static boolean istPrimzahl(int m) {
		int moeglTeiler = 2;
		while (moeglTeiler < m) {
			if (Zahlentheorie.teilt(moeglTeiler, m)) {
				return false;
			}
			moeglTeiler++;
		}

		return true;
	}

	/**
	 * Methode, die durch einen besprochenen Algorithmus das ggT von zwei
	 * mitgegebenen Zahlen bestimmt.
	 */
	public static int ggT(int m, int n) {
		int aktuellerRest = (n % m);
		while (aktuellerRest != 0) {
			n = m;
			m = aktuellerRest;
			aktuellerRest = (n % m);
		}
		return m;
	}

}