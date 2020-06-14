import java.util.Scanner;
public class Factorials
{
    public static void main(String args[])
    {
        int a, b, factorial = 1;
        for (a = 1; a < 11; a++)
        {
            for(b = a; b < a + 1; b++)
            {
                factorial = factorial * a;
            }
            System.out.println("Factorial " + a + " is equal to " + b);
            factorial = 0;
        }
    }
}
