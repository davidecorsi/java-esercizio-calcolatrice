/*
 * Creare una classe main che utilizza i 4 metodi della calcolatrice.
 */
public class Main {
	public static void main(String[] args) {
		Calcolatrice calcolatrice = new Calcolatrice();
		System.out.println(calcolatrice.addizione(3, 2));
		System.out.println(calcolatrice.sottrazione(3, 2));
		System.out.println(calcolatrice.moltiplicazione(4, 5));
		System.out.println(calcolatrice.divisione(15, 3));
	}
}
