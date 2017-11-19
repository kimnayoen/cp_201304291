package lab04_201304291_kimnayeon;

import java.util.Scanner;

public class Question_02 {
	public static void main(String[] args) {
		String par0 = ""; // parameter
		Scanner s = new Scanner(System.in);
		System.out.println("문자를 입력하시오.(소문자만):");
		par0 = s.nextLine();
		switch(par0) {
		case "a" : case "e" : case "i": case "o" : case "u" :
			System.out.println("모음입니다.");
			break;
		default :
			System.out.println("자음입니다.");	
			break;
		
		}
	}

}
