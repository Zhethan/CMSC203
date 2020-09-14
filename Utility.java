import java.util.Scanner;

//ethan is cool
public class Utility {
	
	static void Diagnosis() {
		Scanner in = new Scanner(System.in);
		char answer;
		
		//Introduction
		System.out.println("Hello and welcome to Ethan's troubleshooting service. I have no idea how WiFi works, and even less on how to fix it. With all that being said, I charge 127$ an hour. Let's get into it!\n");
		System.out.println("Ok, first reboot the computer and try to reconnect?\nDid it work? (y/n)");
		answer = in.next().charAt(0);
		
		//Diagnosis
		if (answer == 'n') {
			System.out.println("Alright, then try to reboot the router and try to reconnect\nDid it work? (y/n)");
			answer = in.next().charAt(0);
			if (answer == 'n') {
				System.out.println("Ok then make sure the cables are connecting the router are firmly connected and that power is getting to the router\nDid it work? (y/n)");
				answer = in.next().charAt(0);
				if (answer == 'n') {
					System.out.println("Hmmmm. Maybe try to move the computer closer to the router to try and connect.\n Did it work? (y/n)");
					answer = in.next().charAt(0);
					if (answer == 'n') {
						System.out.println("Well then.... Alright I'm just gonna contact my ISP");
					}
				}
			}
		}else {
			System.out.println("Wow, I can't believe that worked, never tried that before.... Anyways, pay up!");
			
		}
	}
}
