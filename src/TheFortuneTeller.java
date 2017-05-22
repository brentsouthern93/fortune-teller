import java.util.Scanner;

public class TheFortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int retireYears;
		String moneyInBank;
		String vacationSpot;
		String typeOfCar = " ";
		
		
		System.out.println("Enter your first name");
		String firstName = input.nextLine();
		
		System.out.println("Enter your last name");
		String lastName = input.nextLine();
		
		System.out.println("Enter your age");
		int age = input.nextInt();
		
		if(age % 2 == 0) {
			retireYears = 20;
		} else {
			retireYears = 35;
		}
		
		System.out.println("Enter your birth month number");
		int month = input.nextInt();
		
		switch(month) {
		case 1:
		case 2:
		case 3:
		case 4:
			moneyInBank = "$1,000,000.00";
			break;
		case 5:
		case 6:
		case 7:
		case 8:
			moneyInBank = "$10,000,000.00";
			break;
		case 9:
		case 10:
		case 11:
		case 12:
			moneyInBank = "$1,000.00";
			break;
		default:
			moneyInBank = ("$0.00");
		}
		
		
		System.out.println("Enter your number of siblings");
		int sibs = input.nextInt();
		
		if(sibs == 0) {
			vacationSpot = "Boca Raton, FL";
		} else if(sibs == 1) {
			vacationSpot = "Naples, Italy";
		} else if(sibs == 2) {
			vacationSpot = "Aspen, CO";
		} else if(sibs == 3) {
			vacationSpot = "Ibiza, Spain";
		} else if(sibs > 3) {
			vacationSpot = "Nic, France";
		} else {
			vacationSpot = "The 7th level of hell";
		}	
		
		
		System.out.println("Enter your favorite ROYGBIV color. Enter 'help' to see ROYGBIV colors");
		String color = input.next();
		
		if(color.toLowerCase().equals("help")) {
			System.out.println("red.orange.yellow.green.blue.indigo.violet\nEnter your favorite color");
			color = input.nextLine();
		}
		
		if(color.equals("red")) {
			typeOfCar = "Infiniti.";
		} else if(color.equals("orange")) {
			typeOfCar = "Audi";
		} else if(color.equals("yellow")) {
			typeOfCar = "Tesla";
		} else if(color.equals("green")) { 
			typeOfCar = "BMW";
		} else if(color.equals("blue")) {
			typeOfCar = "Lexus";
		} else if(color.equals("indigo")) {
			typeOfCar = "Mercedes";
		} else if(color.equals("violet")) {
			typeOfCar = "Bentley";
		} 
		
		
		
		System.out.println(firstName + " " + lastName + " will retire in " + retireYears + " years with " + moneyInBank + " in the bank, a vacation home in "
+ vacationSpot + ", and travel by " + typeOfCar);

				
	}

}
