package zadacha07;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myInput = new Scanner( System.in );			
		int a,b;
		double c;
		
		System.out.println("Vnesi gi stranite na eden pravoagolen triagolnik");
		System.out.println("Vnesi ja stranata a: ");
		a=myInput.nextInt();
		System.out.println("Vnesi ja stranata b: ");
		b=myInput.nextInt();
		c=StrictMath.hypot(a, b);
		
		Triagolnik triagolnik = new Triagolnik (a, b, c);
		
		System.out.println("Perimetarot na triagolnikot e: " + triagolnik.Perimetar()+ "cm");
		System.out.println("Plostinata na triagolnikot e: " + triagolnik.Plostina()+ "cm2");
	}

}	
