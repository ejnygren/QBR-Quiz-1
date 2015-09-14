import java.util.Scanner; //Scanner is in the java.util package
public class QBR1 {
	public static void main(String[]args) {
		//Declare and have user input completions
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter the number of completions: ");
		double completions = input1.nextDouble(); 
		//Declare and have user input attempts
		Scanner input2 = new Scanner(System.in);
		System.out.print("Enter the number of attempts: ");
		double attempts = input2.nextDouble(); 
		//Declare and have user input yards
		Scanner input3 = new Scanner(System.in);
		System.out.print("Enter the number of yards: ");
		double yards = input3.nextDouble(); 
		//Declare and have user input touchdowns
		Scanner input4 = new Scanner(System.in);
		System.out.print("Enter the number of touchdowns: ");
		double touchdowns = input4.nextDouble(); 
		//Declare and have user input interceptions
		Scanner input5 = new Scanner(System.in);
		System.out.print("Enter the number of interceptions: ");
		double interceptions = input5.nextDouble(); 
		//Declare and calculate calca
		double calca = (((completions/attempts)-0.3)*5.0); 
		//Declare and calculate calcb
		double calcb = (((yards/attempts)-3.0)*0.25); 
		//Declare and calculate calcc
		double calcc = ((touchdowns/attempts)*20.0); 
		//Declare and calculate calcd
		double calcd = (2.375-((interceptions/attempts)*25.0)); 
		//Declare and calculate passer rating
		double passerrating = (((calca+calcb+calcc+calcd)/6.0)*100.0); 
		//Display Results
		System.out.println("The QBR for this player is " + passerrating);
				
				
		
		
	}

}

