//Danielle DiLoreto
//Assignment 9

import java.util.Scanner;
public class UseTime {
	

	public static void main(String[] args) {
		// create new instance of time object
		Time time = new Time();
		String userTime = "";
	
		Scanner scan = new Scanner(System.in);
		boolean valid = false;
		while (!valid) {
			System.out.println("Enter a valid time in the format 'hh:mm': ");
		    userTime = scan.nextLine();
			valid = time.isValidTimeString(userTime);			
		}
		
		Time validTime = new Time(userTime);
		System.out.println(validTime.toString());
		
		
		
		
		
			
		}
		
		
	    
		
		

	}

