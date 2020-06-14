import java.util.Scanner;
public class CellPhoneService
{
    public static void main(String args[])
    {
        int talk, text, data;
        Scanner inputTalk = new Scanner(System.in);
        System.out.println("How much talk minutes would you like?");
        talk = inputTalk.nextInt();
        Scanner inputText = new Scanner(System.in);
        System.out.println("How many texts would you like?");
        text = inputText.nextInt();
        Scanner inputData = new Scanner(System.in);
        System.out.println("How much data (GB) would you like?");
        data = inputData.nextInt();
        if (talk < 500 && text == 0 && data == 0)
            System.out.println("You should try data Plan A for $49 a month?");
        else if (talk < 500 && text > 0 && data == 0)
            System.out.println("You should try data Plan B for $55 a month?");
        else if (talk >= 500 && text < 100 && data == 0)
            System.out.println("You should try data Plan C for $61 a month?");
        else if (talk < 500 && text > 100 && data == 0)
            System.out.println("You should try data Plan D for $70 a month?");
        else if (data < 2)
            System.out.println("You should try data Plan E for $79 a month?");
        else if (data >= 2)
            System.out.println("You should try data Plan F for $87 a month?");
    }
}
