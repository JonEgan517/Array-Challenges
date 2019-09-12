import java.util.Scanner;
import java.util.ArrayList;

public class ArrayChallenges 
{
	public static void main(String[] args) 
	{
		//favoriteSweets();
		inputEight();
		//randomTwoDigit();
	}

	private static void favoriteSweets() 
	{
		Scanner stringInput = new Scanner(System.in);
		System.out.println("How many favorite sweets do you like.");
		int numberOfSweets = stringInput.nextInt();
		
		String[] myArray = new String[numberOfSweets]; 
		
		
		for(int i = 0; i < numberOfSweets; i++)
		{
			System.out.println("Enter the name of the sweet " +(i+1));
			myArray[i] = stringInput.next();
		}
		stringInput.close();
		System.out.println("You favorite sweets are ");
		for(int i = 0; i < numberOfSweets; i++)
		{
			System.out.println(myArray[i]);
		}
		
	}

	private static void inputEight() 
	{
		Scanner intInput = new Scanner(System.in);
		System.out.println("Input eight numbers ");
		int numbers = intInput.nextInt();
		
		int[] myArray = new int[numbers];
		
		for(int i = 0; i < numbers; i++)
		{
			myArray[i] = intInput.nextInt();
		}
		intInput.close();
	}

	private static void randomTwoDigit() 
	{
		
		
	}
}
