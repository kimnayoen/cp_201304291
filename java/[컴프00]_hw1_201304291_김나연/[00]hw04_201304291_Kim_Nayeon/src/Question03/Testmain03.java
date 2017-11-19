package Question03;

import java.util.Scanner;

public class Testmain03 {
	public static void main(String[] args) {
		int year;
		int month;
		int day;
		
		Date date1 = new Date();
		Scanner sc = new Scanner(System.in);
		System.out.print("연도 입력 : ");
		year = sc.nextInt();
		
		System.out.print("월 입력 : ");
		month = sc.nextInt();
		
		System.out.print("일 입력 : ");
		day = sc.nextInt();
		
		System.out.print("동양식 날짜 표현 : ");
		date1.printEastern(year,month,day);
		System.out.print("서양식 날짜 표현 : ");
		date1.printWestern(year,month,day);	
	}
}
