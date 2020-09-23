//ethn kool
//Ethan Yu
//9/22/2020
//This class uses the RNG.java class to make a number guessing game. It's kinda addicting actually.
import java.util.Scanner;

public class RandomNumberGuesser extends RNG {

	static Scanner in = new Scanner(System.in);
	static int randNum = rand();
	static int highGuess = 100;
	static int lowGuess = 0;
	static int nextGuess;		
	static int correct;
	static char answer = 'y';
	
	public static void setGuess() { 
						
		if (inputValidation(nextGuess, lowGuess, highGuess)){
			
			if (nextGuess > randNum){
				highGuess = nextGuess;
				System.out.println("Your number of counts: "+ getCount());
				System.out.println("Your number is too high");
				System.out.println("Enter a number between "+ lowGuess + " and " + highGuess);
				nextGuess= in.nextInt();
				
			}else if (nextGuess < randNum){
				lowGuess = nextGuess;
				System.out.println("Your number of counts: "+ getCount());
				System.out.println("Your number is too low");
				System.out.println("Enter a number between "+ lowGuess + " and " + highGuess);
				nextGuess= in.nextInt();
			
			}else {
				System.out.println("Your number of counts: "+ getCount());
				correct = nextGuess;
				System.out.print("Congratulations, you got it! Wanna try again? (y/n)\n");
				answer = in.next().charAt(0);
			}
			
		}else {
		System.out.println("Enter a number between "+ lowGuess + " and " + highGuess);
		nextGuess= in.nextInt();
		}
	}
	
	public static void main(String[] args) {				
		//Program begins...
		while (answer == 'y') {
			System.out.println("Enter your first guess between 0 and 100");
			nextGuess= in.nextInt();
			while (correct != randNum) {
				setGuess();
			}
			randNum = rand();
			resetCount();
			highGuess = 100;
			lowGuess = 0;
		}
		System.out.println("Thanks for playing, this program was made by Ethan Yu (no, not you, me!)");
	}
}
