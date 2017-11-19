package lab03_201304291_kimnayeon;

import java.util.Scanner;

public class Question_02 {
	public static void main(String[] args) {
		int year;
		int month;
		int day;
		int tod = 0; // tod == Total of day
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please write the year(1900 ~) : ");
		year = sc.nextInt();
		
		System.out.println("Month?:");
		month = sc.nextInt();
		
		System.out.println("Last number is day:");
		day = sc.nextInt();
		
		tod = tod + (year - 1900)*365;
		tod = tod + (year - 1900)/4;
		
		if(((year % 4) == 0 && (year % 100) != 0) || (year % 400) == 0){
			if((month == 1) || (month == 2))
				tod += -1;
		}
		
		switch(month){
			case 1 :
				tod = tod + day;
				break;
			case 2 :
				tod = tod + 31 + day;
				break;
			case 3 :
				tod = tod + 31 + 28 + day;
				break;
			case 4 : 
				tod = tod + 31 + 28 + 31 + day;
				break;
			case 5 : 
				tod = tod + 31 + 28 + 31 + 30 + day;
				break;
			case 6 :
				tod = tod + 31 + 28 + 31 + 30 + 31 + day;
				break;
			case 7 :
				tod = tod + 31 + 28 + 31 + 30 + 31 + 30 + day;
				break;
			case 8 :
				tod = tod + 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
				break;
			case 9 :
				tod = tod + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
				break;
			case 10 :
				tod = tod + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
				break;
			case 11 : 
				tod = tod + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
				break;
			case 12 :
				tod = tod + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
				break;
			default : 
				System.out.println("Check on more please. You got the wrong number.");
				break;	
		}
		
		System.out.print("The day of the week is ");
		switch(tod % 7) {
		case 0 :
			System.out.println("Sunday.");
			break;
		case 1 : 
			System.out.println("Monday.");
			break;
		case 2 :
			System.out.println("Tuesday.");
			break;
		case 3 :
			System.out.println("Wendseday.");
			break;
		case 4 :
			System.out.println("Thursday.");
			break;
		case 5 :
			System.out.println("Friday.");
			break;
		case 6 :
			System.out.println("Saturday.");
			break;
			
		
		}
				
		
	}

}
