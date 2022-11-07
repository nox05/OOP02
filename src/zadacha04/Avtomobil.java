package zadacha04;

public class Avtomobil {
	public String marka;
	public String model;
	public int pominatiKm;
	
	//Default Constructor
	public Avtomobil () {
		
	}
	
	//Dynamic Constructor
	public Avtomobil (String marka, String model, int pominatiKm) {
		this.marka = marka;
		this.model = model;
		this.pominatiKm = pominatiKm;
	}
}
