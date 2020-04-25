import java.util.Scanner;
public class StrictlyIdentical {
    public static boolean equals(int[] array1, int[] array2)
    {
        boolean equal = true;
        for (int i=0; i < 5; i++)
        {
            if ((array1[i] == array2[i]) == false)
            {
                return false;
            }
        }
        return equal;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] list1 = new int[5];
        int[] list2 = new int[5];

        System.out.println("Enter 5 elements of list1: ");
        for (int i = 0; i < list1.length; i++)
        {
            list1[i] = input.nextInt();
        }
        System.out.println("Enter 5 elements of list2: ");
        for (int i = 0; i < list2.length; i++)
        {
            list2[i] = input.nextInt();
        }
        if (equals(list1, list2))
        {
            System.out.println("Two lists are strictly identical.");
        }
        else
            System.out.println("Two lists are not strictly identical.");
    }
}
