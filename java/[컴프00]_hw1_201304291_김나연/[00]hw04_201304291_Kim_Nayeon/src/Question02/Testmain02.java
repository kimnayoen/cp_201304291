package Question02;

import java.util.Scanner;

public class Testmain02 {
	public static void main(String[] args) {
		int index = 0, leng;
		char mutation1, mutation2, mutation3;
		String a = "", b = "", c = ""; // 문자를 문자열로 변환해줄 문자열 변수를 선언
		
		Scanner sc = new Scanner(System.in);
		String s = "";
		
		System.out.print("문자열을 입력하시오 : ");
		s= sc.nextLine();

		while (s.compareTo("0") != 0) // 입력받은 값이 0이면 루프 종료
		{
		while(index < s.length()) { // 문자열의 길이 만큼 루프실행
		leng = (int)s.charAt(index); // 대상객체에서 인덱스 index에 있는 문자를 반환하여 유니코드값으로 변환

		if(leng >= 65 && leng <= 90) { // 추출한 문자가 대문자이면
		mutation1 = (char)leng; // 유니코드값을 다시 문자로 변환
		a = "" + mutation1; // 문자를 문자열로 변환 
		System.out.print(a.toLowerCase()); // 각 문자를 소문자로 바꾸어 반환
		}

		else if(leng >=97 && leng <= 122) { // 추출한 문자가 소문자이면
		mutation2 = (char)leng; // 유니코드값을 다시 문자로 변환
		b = "" + mutation2; // 문자를 문자열로 변환
		System.out.print(b.toUpperCase()); // 각 문자를 대문자로 바꾸어 반환
				}
			}
		}
	}
}
