import java.util.Scanner;
public class MetricConversion {
    public static void main (String args[])
    {
        int UserInput;
        UserInput = GetInput();
        ConvertInches(UserInput);
        ConvertGallons(UserInput);
    }

    public static int GetInput()
    {
        int UserInput;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number you would like to convert >> ");
        UserInput = input.nextInt();
        return UserInput;
    }

    public static void ConvertInches(int UserInput)
    {
        double conversion = 2.54;
        double output;
        output = UserInput * conversion;
        System.out.println(UserInput + "inches equals " + output + "centimeters.");
    }

    public static void ConvertGallons(int UserInput)
    {
        double conversion = 3.7854;
        double output;
        output = UserInput * conversion;
        System.out.println("\n" + UserInput + "gallons equals " + output + "litres.");
    }
}
