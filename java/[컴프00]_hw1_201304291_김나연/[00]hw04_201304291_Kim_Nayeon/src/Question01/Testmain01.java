package Question01;

import java.util.Scanner;

public class Testmain01 {
	public static void main(String[] args) {
		char ch;
		int vowels = 0;
	    int consonants = 0;
	    
		Scanner sc = new Scanner(System.in);
		String s = "";
		
		System.out.print("문자열을 입력하시오 : ");
		s= sc.nextLine();
		for(int i = 0; i<s.length(); i++) {
			ch = s.charAt(i);
			if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' ||  
					ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
				vowels ++;
			else
				consonants++;
		}
		System.out.println("모음의 개수 : " + vowels);
		System.out.println("자음의 개수 : " + consonants);	
	}

}
