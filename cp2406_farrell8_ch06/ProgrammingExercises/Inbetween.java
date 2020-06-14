import java.util.Scanner;

public class Inbetween
{
    public static void main(String args[])
    {
        int a, low, high;
        System.out.print("Enter low number: ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter high number: ");
        Scanner input1 = new Scanner(System.in);
        low = input.nextInt();
        high = input1.nextInt();
        for(a = low + 1; a <= high; a++)
        {
            System.out.print(a);
        }
    }
}
