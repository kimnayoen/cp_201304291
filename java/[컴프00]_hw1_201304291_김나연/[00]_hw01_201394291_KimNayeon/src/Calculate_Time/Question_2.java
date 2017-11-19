package Calculate_Time;

import java.util.Scanner;

public class Question_2 {
	public static void main(String[] args) {
		int num1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하시오:");
		num1 = sc.nextInt();
		
		if(((num1 % 4) == 0 && (num1 % 100) != 0) || (num1 % 400) == 0)
			System.out.println(num1 + "년은 윤년 입니다.");
		
		else
			System.out.println(num1 + "년은 윤년이 아닙니다.");
		
		sc.close();
	}

}
