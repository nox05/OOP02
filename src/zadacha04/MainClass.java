package zadacha04;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avtomobil automobil1 = new Avtomobil ();
		automobil1.marka = "Volkswagen";
		automobil1.model = "Golf5";
		automobil1.pominatiKm = 187000;
		
		Avtomobil automobil2 = new Avtomobil ("Suzuki", "Alto", 52000);
		
		System.out.println(automobil1.marka + " " + automobil1.model + " " +automobil1.pominatiKm);
		System.out.println(automobil2.marka + " " + automobil2.model + " " +automobil2.pominatiKm);
		
		
	}

}
