import java.util.Scanner;

public class PismoGlava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tastatura = new Scanner(System.in);
		int pismo = 0;
		int brojBacanja = 0;
		int ishodBacanja = 0;
		int brojPisma = 0;
		int brojGlava = 0;
//		double kolicnkZaPismo = (double) brojPisma/brojBacanja;
//		double kolicnikZaGlavu = (double) brojGlava/brojBacanja;
		//ne moze ovde
		
		while (true) {
			System.out.print("Koliko puta zelite da bacite novcic: ");
			brojBacanja = tastatura.nextInt();
			
			if(brojBacanja == 0) break; 
				brojPisma = 0;
				brojGlava = 0;
		
			for (int i = 0; i<brojBacanja; i++) {
				ishodBacanja = (int) (Math.random() + 0.5);
				if(ishodBacanja == pismo)
					brojPisma++; 
					//++ znaci ako je u zagradi tacno izvrsava se to nesti++
				else 
					brojGlava++;	
			}
			
			double kolicnkZaPismo = (double) brojPisma/brojBacanja; //obavezno 2x double
			double kolicnikZaGlavu = (double) brojGlava/brojBacanja;
			
			System.out.println("Kolicnik za pisma: " + kolicnkZaPismo);
			System.out.println("Kolicnik za glavu: " + kolicnikZaGlavu);
			System.out.println("Pismo je palo " + brojPisma +" puta");
			System.out.println("Glava je pala " + brojGlava + " puta");
			
			System.out.println("***Za izlaz ukucajte 0 ***");
			
//          u zadatku			
//			System.out.print("Broj pisma   Broj glava");
//			System.out.print(" Broj pisma / Broj bacanja");
//			System.out.println(" Broj glava / Broj bacanja");
//			
//			System.out.printf("%8d %12d %17.2f %25.2f\n " , 
//					brojPisma, brojGlava,
//					(double) brojPisma / brojBacanja,
//					(double) brojGlava / brojBacanja);
		}
	}

}
