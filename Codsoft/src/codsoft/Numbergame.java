package codsoft;

import java.util.Random;
import java.util.Scanner;

public class Numbergame {
	public static void main(String[] args){

		boolean guesscorrect=false;

		System.out.println("Guess the Number Challenge.....");
		System.out.println("Enter the Number you Guess");
			

			Scanner sc=new Scanner(System.in);

			Random r = new Random();
			int randomNumber = r.nextInt(100) + 1; 
			int attempt=0;
		        while(guesscorrect==false){

		System.out.println("Enter your Guess and your guess should be in 1-100 range");
			
			int guessNumber=sc.nextInt();
			attempt++;

			if(randomNumber>guessNumber)
			{
				System.out.println("The Number you Guessed is low");
			}
			else if(randomNumber<guessNumber)
			{
				System.out.println("The Number you Guessed is High");
			}
			else
			{
				guesscorrect = true;
				System.out.println("YOU WIN !!!!!!!!!!!!!");
				System.out.println("The Number you have guessed is" +guessNumber +" it is correct in  "+attempt+" attempts taken" );
			}
		}
		sc.close();
		}
		}

