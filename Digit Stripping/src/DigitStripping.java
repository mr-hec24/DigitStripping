import java.util.Scanner;

public class DigitStripping
	{
		static int userNumber;
		static Scanner userInput = new Scanner(System.in);
		
		public static void main(String[]args)
		{
			sixDigitNumber();
		}
		
		public static void sixDigitNumber()
		{
			System.out.println("Please input a 6 digit number.");
			int number = userInput.nextInt();
			
			int[] digits = new int[6];
			
			
			for (int i = 0; i < digits.length; i++)
				{
					digits[i] = number % 10;
					number /= 10;
				}
			
			System.out.println(digits[5]);
		}
		
		public static void reportNumberOfDigits()
		{
			System.out.println("Please input a number.");
			int number = userInput.nextInt();
			boolean numberGoesOn = true;
			
			while (numberGoesOn)
				{
					digits[i] = number % 10;
					number /= 10;
				}
			
		}
		
		public static void countOddNumbers()
		{
			
		}
		
		public static void addDigits()
		{
			
		}
		
		public static void roundToNearestTenth()
		{
			
		}
	}
