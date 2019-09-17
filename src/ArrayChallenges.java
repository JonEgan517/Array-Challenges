import java.util.Scanner;

public class ArrayChallenges 
{
	static Scanner intInput = new Scanner(System.in);
	static Scanner stringInput = new Scanner(System.in);
	public static void main(String[] args) 
	{
		favoriteSweets();
		totalOfOddAndEven();
		randomTwoDigit();
	}

	private static void favoriteSweets() 
	{
		System.out.println("How many favorite sweets do you like.");
		int numberOfSweets = intInput.nextInt();
		
		String[] myArray = new String[numberOfSweets]; 
		
		for(int i = 0; i < numberOfSweets; i++)
		{
			System.out.println("Enter the name of the sweet " +(i+1));
			myArray[i] = stringInput.next();
		}
			
		System.out.println("You favorite sweets are ");
		for(int i = 0; i < numberOfSweets; i++)
		{
			System.out.println(myArray[i]);
		}
	}

	private static void totalOfOddAndEven()
	{
		System.out.println("Input the number 8. You will be asked to enter some numbers.");
		int numbers;
		numbers = intInput.nextInt();
		
		int[] myArray = new int[numbers];
		
		for(int i = 0; i < numbers; i++)
		{
			System.out.println("Enter number " + (i+1));
			myArray[i] = intInput.nextInt();
		}
		
	
		int odd = 0; 
	    int even = 0;
	    
	    for (int i = 0; i < numbers; i++) 
	    { 
	        if (i % 2 == 0)
	        {
	        	odd += myArray[i];
	        }
	        else
	        {
	        	even += myArray[i];
	        }
	    } 
	    System.out.println("Total of the Even Numbers is " + even + ".");
	    System.out.println("Total of the Odd Numbers " + odd + ".");
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
