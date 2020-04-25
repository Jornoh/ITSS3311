import java.util.Scanner;
public class StrictlyIdentical {
    public static boolean equals(int[] array1, int[] array2)
    {
        boolean equal = true; // Initializing boolean to true
        for (int i=0; i < 5; i++) // Initialize i as 0, loop 5 times, increment i each time it loops
        {
            if ((array1[i] == array2[i]) == false) // if array 1 does not equal array 2, return false
            {
                return false;
            }
        }
        return equal; // store boolean result of equal
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in); // Creating new scanner "input"
        int[] list1 = new int[5]; // Creating arrays
        int[] list2 = new int[5];

        System.out.println("Enter 5 elements of list1: "); // Prompts user to enter 5 elements for list1
        for (int i = 0; i < list1.length; i++) // Initialize i as 0, loop as many times as the length of list1, increment i each time it loops
        {
            list1[i] = input.nextInt(); // Stores user input for each element of list1
        }
        System.out.println("Enter 5 elements of list2: "); // Prompts user to enter 5 elements for list2
        for (int i = 0; i < list2.length; i++) // // Initialize i as 0, loop as many times as the length of list2, increment i each time it loops
        {
            list2[i] = input.nextInt(); // Stores user input for each element of list2
        }
        if (equals(list1, list2)) // Calling on the boolean method "equals" and passes list1 and list2 into the method. Checks for boolean result
        {
            System.out.println("Two lists are strictly identical."); // If "equals" returns true, then informs user that the two arrays are equal
        }
        else
            System.out.println("Two lists are not strictly identical."); // If "equals" returns false, then informs user that the two arrays are not equal
    }
}
