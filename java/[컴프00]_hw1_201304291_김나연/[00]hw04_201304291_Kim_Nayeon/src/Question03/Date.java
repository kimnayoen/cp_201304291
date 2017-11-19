package Question03;

public class Date {
	public int year;
	public int month;
	public int day;
	
	public void printEastern(int year, int month, int day) {
		System.out.println(year + "." + month + "." + day);
	}
	
	public void printWestern(int year, int month, int day) {
		if (month == 1)
			System.out.println("January " + day + "," + year);
		else if (month == 2)
			System.out.println("February " + day + "," + year);
		else if (month == 3)
			System.out.println("March " + day + "," + year);
		else if (month == 4)
			System.out.println("Appril " + day + "," + year);
		else if (month == 5)
			System.out.println("May " + day + "," + year);
		else if (month == 6)
			System.out.println("June " + day + "," + year);
		else if (month == 7)
			System.out.println("July " + day + "," + year);
		else if (month == 8)
			System.out.println("August " + day + "," + year);
		else if (month == 9)
			System.out.println("September " + day + "," + year);
		else if (month == 10)
			System.out.println("October " + day + "," + year);
		else if (month == 11)
			System.out.println("November " + day + "," + year);
		else if(month == 12)
			System.out.println("December " + day + "," + year);
		else
			System.out.println("Error");		
	}
}
