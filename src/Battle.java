import java.util.Scanner;

public class Battle  {
	
	public static void main(String[] args) {
		Charmander charman = new Charmander();
		Squirtle squirt = new Squirtle();
		Turtwig turt = new Turtwig();
		//Scanner console = new Scanner(System.in);
		//System.out.print("Which Pokemon Would you like to play?");
		//String x = console.next();
		doBattle(charman, squirt);
	}
	
	
	public static void doBattle(Pokemon attacker, Pokemon defense)	{
		System.out.println("Current attacker stats: ");
		attacker.dispalyMethod();
		System.out.println();
		
		System.out.println("Current defender stats: ");
		defense.dispalyMethod();
		
	}
	
}
