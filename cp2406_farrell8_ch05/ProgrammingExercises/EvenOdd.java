import java.util.Scanner;
public class EvenOdd
{
    public static void main(String args[])
    {
        int check;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number you would like to check");
        check = input.nextInt();
        if (check % 2 == 0)
            System.out.println(input + "is an even number.");
        else
            System.out.println(input + "is an odd number.");
    }
}