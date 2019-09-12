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
		ArrayList<String> myArray = new ArrayList<String>();
		Scanner stringInput = new Scanner(System.in);
		System.out.println("How many favorite sweets.");
		
		while(stringInput.hasNextLine())
		{
			myArray.add(stringInput.next());
		}
		
		for(String sweets : myArray)
		{
			System.out.println(sweets);
		}
	}

	private static void inputEight() 
	{
		ArrayList<Double> myArray = new ArrayList<Double>();
		Scanner intInput = new Scanner(System.in);
		System.out.print("Input eight numbers ");
		
		while(intInput.hasNextDouble())
		{
			myArray.add(intInput.nextDouble());
		}
		System.out.println(myArray);
	}

	private static void randomTwoDigit() 
	{
		
		
	}
}
