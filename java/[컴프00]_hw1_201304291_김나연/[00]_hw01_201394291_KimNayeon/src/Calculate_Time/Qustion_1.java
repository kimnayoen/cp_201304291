package Calculate_Time;

import java.util.Scanner;

public class Qustion_1 {
	public static void main(String[] args) {
		int num1; // time
		int hour;
		int min;
		int sec;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("변환할 초 입력:");
		num1 = sc.nextInt();
		
		hour = num1 / 3600;
		min = (num1 % 3600) / 60;
		sec = (num1 % 3600) % 60;
		
		System.out.println(num1 + "초는 " + hour + "시간 " + min + "분 " + sec + "초 입니다. " );
		sc.close();
		
		
		
	}
	

}
