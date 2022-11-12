package com.ineuron;

import java.util.Scanner;
	class Gesseer {

		int gessNum;
		int numInRange;

		int gessNumber() {

			System.out.println("Gesser please guess the number in Range between 1 to 10");
			Scanner scan = new Scanner(System.in);

			int gessNum = scan.nextInt();

			if (gessNum >= 1 && gessNum <= 10) {
				numInRange = gessNum;
			} else {
				System.out.println("Number is out of range!!! Please enter the number in the range of 1 to 10");
				Scanner scan1 = new Scanner(System.in);

				gessNum = scan.nextInt();

				if (gessNum >= 1 && gessNum <= 10) {
					numInRange = gessNum;
				}
			}
			return numInRange;
		}

	}

	class Player1 {

		int gessNum;
		int numInRange;

		int gessNumberForPlayer1() {

			System.out.println("player1 please guess the number");
			Scanner scan = new Scanner(System.in);

			int gessNum = scan.nextInt();

			if (gessNum >= 1 && gessNum <= 10) {
				numInRange = gessNum;
			} else {
				System.out.println("Please enter the number in the range of 1 to 10");

				Scanner scan1 = new Scanner(System.in);

				gessNum = scan.nextInt();

				if (gessNum >= 1 && gessNum <= 10) {
					numInRange = gessNum;
				}
			}

			return numInRange;
		}

	}

	class Player2 {

		int gessNum;
		int numInRange;

		int gessNumberForPlayer2() {

			System.out.println("player2 please guess the number");
			Scanner scan = new Scanner(System.in);

			int gessNum = scan.nextInt();

			if (gessNum >= 1 && gessNum <= 10) {
				numInRange = gessNum;
			} else {
				System.out.println("Please enter the number in the range of 1 to 10");
				Scanner scan1 = new Scanner(System.in);

				gessNum = scan.nextInt();

				if (gessNum >= 1 && gessNum <= 10) {
					numInRange = gessNum;
				}

			}
			return numInRange;
		}

	}

	class Player3 {

		int gessNum;
		int numInRange;

		int gessNumberForPlayer3() {

			System.out.println("player3 please guess the number");
			Scanner scan = new Scanner(System.in);

			int gessNum = scan.nextInt();
			if (gessNum >= 1 && gessNum <= 10) {
				numInRange = gessNum;
			} else {
				System.out.println("Please enter the number in the range of 1 to 10");
				Scanner scan1 = new Scanner(System.in);

				gessNum = scan.nextInt();

				if (gessNum >= 1 && gessNum <= 10) {
					numInRange = gessNum;
				}
			}
			return numInRange;
		}

	}

	class Umpire {

		int numFromGuesser;
		int numFromGuessertemp;
		int numFromPlayer1;
		int numFromPlayer2;
		int numFromPlayer3;

		
		
		void collectNumFromGuesser() {

			Gesseer num = new Gesseer();
			numFromGuesser = num.gessNumber();
			
		}

		void collectNumFromPlayer() {

			Player1 p1 = new Player1();
			Player2 p2 = new Player2();
			Player3 p3 = new Player3();

			numFromPlayer1 = p1.gessNumberForPlayer1();
			numFromPlayer2 = p2.gessNumberForPlayer2();
			numFromPlayer3 = p3.gessNumberForPlayer3();
			
			
		}

		void compare() {
			if (numFromGuesser == numFromPlayer1) {
				if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {

					System.out.println("All players won the game.Game Tie.We can move to semiFinal");

				} else if (numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer2) {
					System.out.println(numFromGuesser);
					System.out.println(numFromPlayer1);
					System.out.println(numFromPlayer2);
					
					System.out.println("Player 1 & 2 won the game.Game Tie.");
					System.out.println("Final round will start between 1 & 2:");
	                            
					Player1 p4 = new Player1();
					Player2 p5 = new Player2();
					
					numFromPlayer1 = p4.gessNumberForPlayer1();
					numFromPlayer2 = p5.gessNumberForPlayer2();
					
					System.out.println(numFromGuesser);
					System.out.println(numFromPlayer1);
					System.out.println(numFromPlayer2);
					
					if (numFromGuesser == numFromPlayer1) {
						System.out.println("Player1 Won the game");
					}
					else if(numFromGuesser == numFromPlayer2) {
						System.out.println("Player2 Won the game");
					}
					

				} else if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
					System.out.println("Player 2 & 3 won the game. Game Tie");
					System.out.println("Final round will start between 2 & 3:");
	                
					Player2 p6 = new Player2();
					Player3 p7 = new Player3();
					
					numFromPlayer1 = p6.gessNumberForPlayer2();
					numFromPlayer2 = p7.gessNumberForPlayer3();
					
					System.out.println(numFromGuesser);
					System.out.println(numFromPlayer2);
					System.out.println(numFromPlayer3);
					
					if (numFromGuesser == numFromPlayer2) {
						System.out.println("Player2 Won the game");
					}
					else if(numFromGuesser == numFromPlayer3) {
						System.out.println("Player3 Won the game");
					}
					
					
				} else if (numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer3) {
					System.out.println("Player 1 & 3 won the game");
	                System.out.println("Final round will start between 1 & 3:");
	                
					Player1 p8 = new Player1();
					Player3 p9 = new Player3();
					
					numFromPlayer1 = p8.gessNumberForPlayer1();
					numFromPlayer3 = p9.gessNumberForPlayer3();
					
					System.out.println(numFromGuesser);
					System.out.println(numFromPlayer1);
					System.out.println(numFromPlayer3);
					
					if (numFromGuesser == numFromPlayer1) {
						System.out.println("Player1 Won the game");
					}
					else if(numFromGuesser == numFromPlayer3) {
						System.out.println("Player3 Won the game");
					}
				} else {
					System.out.println("Player1 won the game");
				}
			}

			else if (numFromGuesser == numFromPlayer2) {
				if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
					System.out.println("Player 2 & 3 won the game");
					
					 System.out.println("Final round will start between 2 & 3:");
		                
						Player2 p10 = new Player2();
						Player3 p11= new Player3();
						
						numFromPlayer1 = p10.gessNumberForPlayer2();
						numFromPlayer2 = p11.gessNumberForPlayer3();
						
						System.out.println(numFromGuesser);
						System.out.println(numFromPlayer2);
						System.out.println(numFromPlayer3);
						
						if (numFromGuesser == numFromPlayer2) {
							System.out.println("Player1 Won the game");
						}
						else if(numFromGuesser == numFromPlayer3) {
							System.out.println("Player3 Won the game");
						}
					
					
					
				} else {
					System.out.println("Player2 won the game");
				}
			} else if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player3 won the game");
			} else {
				System.out.println("No player won the game.Please try Again!!!");
			}
		}

	}

	public class GuesserGame {

		public static void main(String[] args) {

			Gesseer g = new Gesseer();
			g.gessNumber();
			Umpire um = new Umpire();
			um.collectNumFromGuesser();
			um.collectNumFromPlayer();
			um.compare();
			

		}

	}




