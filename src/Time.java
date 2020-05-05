//Danielle DiLoreto
//Assignment9
//Modified 24 hour clock 

public class Time {
	
	//instance variables
	private int hour;
	private int minute;
	
	//no arg constructor
	public Time() {
	  this.hour = 0;
      this.minute = 0;
	}
	// two arg constructor
	public Time(int hr, int min) {
		  this.hour = hr;
	      this.minute = min;
		}
	// one arg constructor
	public Time(String time) {
		//convert time variable of hh:mm to hour and minute
		int colon = time.indexOf(':'); 
		String hour = time.substring(0, colon); // find hour
		String min = time.substring(colon + 1, time.length()); // find minute
		
		//convert user input to integers 
		
		int hourInt = Integer.parseInt(hour);
		int minInt = Integer.parseInt(min);
		this.hour = hourInt;
	    this.minute = minInt;
		}
			
		

	
	//Mutator
	public boolean setTime(int h, int m) {
		//check if hour is between 0 and 23
		if ((h>0) && (h<24) && (m>0) && (m<60)) { //assignment states that both variables must be valid in order to set the instance variables
			this.hour = h;
			this.minute = m;
			return true;	
		} else {
			return false;
		}
	}
	
	//Accessor
	public int getHour() {
		return this.hour;
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public String toString() {
		String newHour;
		String newMin;
	
	    newHour = String.valueOf(this.hour);
	    newMin = String.valueOf(this.minute);
	    
		//deal with the minute
		if (this.minute < 10) {
			newMin = "0" + this.minute; //Concatenate a '0' so that the minute reads correctly
		} else {
			newMin = String.valueOf(this.minute);
		}
		
			
		String finalTime = newHour + ":" + newMin;
		return finalTime;
		
	}
	
	
	
	public boolean isValidTimeString(String time) {
		String hour = "";
		String min = "";
		try {    //https://www.w3schools.com/java/java_try_catch.asp- learned about try and catch from this website so that there could be 2 separate error messages for invalid string and invalid time
			int colon = time.indexOf(':'); 
			hour = time.substring(0, colon); // find hour
			min = time.substring(colon + 1, time.length());
		} catch (Exception e) {
			System.out.println("This is an invalid time string");
			return false;
		}
		
		//convert user input to integers
		
		int hourInt = Integer.parseInt(hour);
		int minInt = Integer.parseInt(min);
		
		if ((hourInt>0) && (hourInt<24) && (minInt>0) && (minInt<60)) { //assignment states that both variables must be valid in order to set the instance variables
			return true;	
		} else {
			System.out.println("This is an invalid input. Minute should be between 01-59, hour should be between 1-23");
			return false;
		}

		
	}
	//testing 
	public static void main(String[] args) {
		 
		Time now = new Time();
		now.setTime(8, 30);
		
		String correctTime = now.toString();
		
		System.out.println(correctTime);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
