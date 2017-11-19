package lab03_201304291_kimnayeon;

import java.util.Scanner;

public class Question_01 {
	public static void main(String[] args) {
		int UserWin = 0;
		int ComWin = 0;

		System.out.println("Let's start Rock Paper Scissor");
		
		for(int i = 0; i < 7; i++) {
			
			int UserNum; // parameter
			
			System.out.println("Stage " + i + " Start!");
			System.out.println("Choice!");
			Scanner s = new Scanner(System.in);
			System.out.println("1.Rock, 2.Paper, 3.Scissor:");
			UserNum = s.nextInt();
			
			int ComNum = (int)(Math.random()*10)+1;
			System.out.println(ComNum);
			
			if (UserNum == 3) {
				if ((ComNum == 3) || (ComNum == 6) || (ComNum == 9) ) {
					System.out.println(" You WIN!!");
					UserWin += 1;
				}
				else if ((ComNum == 2) || (ComNum == 5) || (ComNum == 8)) {
					System.out.println("You Lose");
					ComWin += 1;
				}
				else if ((ComNum == 1) || (ComNum == 4) || (ComNum == 7)) 
					System.out.println("Draw");
				else
					System.out.println("Error");
			}
		
			else if(UserNum == 2) {
				if ((ComNum == 2) || (ComNum == 5) || (ComNum == 8) ) {
					System.out.println(" You WIN!!");
					UserWin += 1;
				}
				else if ((ComNum == 1) || (ComNum == 4) || (ComNum == 7)) {
					System.out.println("You Lose");
					ComWin += 1;
				}
				else if ((ComNum == 3) || (ComNum == 6) || (ComNum == 9)) 
					System.out.println("Draw");
				else
					System.out.println("Error");
			}
			
			else {
				if ((ComNum == 1) || (ComNum == 4) || (ComNum == 7) ) {
					System.out.println(" You WIN!!");
					UserWin += 1;
				}
				else if ((ComNum == 3) || (ComNum == 6) || (ComNum == 9)) {
					System.out.println("You Lose");
					ComWin += 1;
				}
				else if ((ComNum == 2) || (ComNum == 5) || (ComNum == 8)) 
					System.out.println("Draw");
				else
					System.out.println("Error");
			}
			System.out.println("Stage" + i + " >> " + "User : " + UserWin + " vs " + "Computer : " + ComWin );
			System.out.println();
			
		}
	}

}
