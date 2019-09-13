import java.util.Scanner;

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
		System.out.println("Input the number 8. You will be asked to enter some numbers.");
		int numbers = intInput.nextInt();
		
		int[] myArray = new int[numbers];
		
		for(int i = 0; i < numbers; i++)
		{
			System.out.println("Enter number " + (i+1));
			myArray[i] = intInput.nextInt();
		}
		intInput.close();
	
		int even = 0; 
	    int odd = 0;
	    
	    for (int i = 0; i < numbers; i++) 
	    { 
	        if (i % 2 == 0)
	        {
	        	System.out.println(even += myArray[i]);
	        }
	        else
	        {
	        	System.out.println(odd += myArray[i]); 
	        }
	    } 
	}

	private static void randomTwoDigit() 
	{
		System.out.println("Generating five random two-digit numbers and printing them out.");
		
		int[] myArray = new int[5];
		
		for(int i = 0; i < myArray.length; i++)
		{
			 myArray[i] = (int)(Math.random()*20 + 1);
			 System.out.println(myArray[i]);
		}
		
		System.out.println("Here are the numbers backwards.");
		for (int i = myArray.length-1; i >= 0; i--) 
		{  
            System.out.println(myArray[i]);  
		}
	}
}
