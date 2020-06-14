import java.util.Scanner;
public class BookstoreCredit {
    public static void main (String args[])
    {
        String userName;
        int userGrade;
        userName = getName();
        userGrade = getGrade();
        printCredits(userName, userGrade);
    }

    public static String getName()
    {
        String userName;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        userName = input.nextLine();
        return userName;
    }

    public static int getGrade()
    {
        int userGrade;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter grade point average: ");
        userGrade = input.nextInt();
        return userGrade;
    }

    public static void printCredits(String userName, int userGrade)
    {
        int creditConversion = 10;
        int credits;
        credits = creditConversion * userGrade;
        System.out.println("Hi, " + userName + "you have " + credits + "book store credits.");
    }
}
