package zadacha05;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instanca za objekt1 so default konstruktor
		Predmet predmet1 = new Predmet ();				
		//Instanca za objekt2 so dinamicki konstruktor
		Predmet predmet2 = new Predmet ("Veb tehnologii");
		//Instanca za objekt3 so drugiot dinamicki konstruktor
		Predmet predmet3 = new Predmet ("OOP", "Ilija Jolevski", 6);
		
		//Zadavanje vrednosti na atributite na objektot1
		predmet1.ime = "Napredno programiranje";
		predmet1.profesor = "Ramona Markoska";
		predmet1.krediti = 6;
		predmet1.semestar = "II-vtor semestar";
		
		//Pecatenje na atributite na trite objekti
		System.out.println(predmet1.ime + " " + predmet1.profesor + " " + predmet1.krediti + " " + predmet1.semestar);
		System.out.println(predmet2.ime);
		System.out.println(predmet3.ime + " " + predmet3.profesor + " " + predmet3.krediti);
	}

}
