// File: FriendsList.java
// Programmer: Jennifer King
// Date: 10/19/2018

import java.util.Scanner;

public class FriendsList 
{
	public static void main(String[] args)
	{
		String[] names = {"Barney", "Charles", "Clancy", "Cletus", "Edna",
					  "Helen", "Homer", "Jimbo", "John", "Julias",
					  "Kent", "Lionel", "Martin", "Marvin", "Milhouse",
					  "Moe", "Ned", "Nelson", "Patty", "Seymour",
					  "Troy", "Waylon"};
		System.out.println("Enter a friend's name: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int position = binarySearch(names, input);
		System.out.println("Friend: " + input + " at position " + position);
		scanner.close();
	}
	
	public static int binarySearch(String[] array, String name)
	{
		int first, last, middle, position;
		boolean found;
		
		first = 0;
		last = array.length - 1;
		position = -1;
		found = false;
		
		while(!found && first <= last)
		{
			middle = (first + last)/2;
			
			if(name.compareTo(array[middle]) == 0)
			{
				found = true;
				position = middle;
			}
			else if(name.compareTo(array[middle]) < 0)
			{
				last = middle - 1;
			}
			else
			{
				first = middle + 1;
			}
			
		}
		
		return position;
	}
	
	
}
