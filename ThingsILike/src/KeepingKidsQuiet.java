import java.util.Scanner;
import java.text.DecimalFormat;


public class KeepingKidsQuiet {
	
	private static DecimalFormat cents;
	private static Scanner howMany;

	public static void divideGumballs() { 
		cents = new DecimalFormat("0.00");
		howMany = new Scanner(System.in);
	
		int gumballs;
		int kids;
		int gumballsPerKid;

		double costOfGumballs;
		double totalPrice;
		
		// Separate by a blank space
		System.out.print("How many gumballs? How many kids? Cost of each gumball? ");
		
		gumballs = howMany.nextInt();
		kids = howMany.nextInt();
		costOfGumballs = howMany.nextDouble();
		
		totalPrice = ((double)gumballs * costOfGumballs);
		gumballsPerKid = (gumballs / kids);

		
		System.out.print("Each kid gets " + gumballsPerKid + " gumballs ");
		
		System.out.println("and it's gonna cost you $" + cents.format(totalPrice)
				+ " so no haircut for you.");
	}
	
	
	public static void makeChangeFromCents() {
		howMany = new Scanner(System.in);
		int quarters, dimes, nickels, cents;
		int whatsLeft, total;
		
		System.out.print("How many cents do you have? ");
		total = howMany.nextInt();
		
		quarters = (total / 25);
		whatsLeft = (total % 25);
		
		dimes = (whatsLeft / 10);
		whatsLeft = (whatsLeft % 10);
		
		nickels = (whatsLeft / 5);
		whatsLeft = (whatsLeft % 5);
		
		cents = whatsLeft;
		
		System.out.println();
		System.out.println("From " + total + " cents you get");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println(cents + " cents"); 
	}
	
		public static void makeChangeFromDollars() {
		howMany = new Scanner(System.in);
		int quarters, dimes, nickels, cents;
		int whatsLeft, total;
		
		System.out.print("How many dollars do you have? ");
		total = howMany.nextInt();
		
		quarters = (total / 25) * 100;
		whatsLeft = (total % 25) * 100;
		
		dimes = (whatsLeft / 10) * 100;
		whatsLeft = (whatsLeft % 10) * 100;
		
		nickels = (whatsLeft / 5) * 100;
		whatsLeft = (whatsLeft % 5) * 100;
		
		cents = whatsLeft;
		
		System.out.println();
		System.out.println("From " + total + " cents you get");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println(cents + " cents"); 
		} 
}
