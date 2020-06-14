import java.util.Scanner;

public class CountWords
{
    public static void main(String[] args)
    {
        System.out.println("Input a sentence: ");
        Scanner input = new Scanner(System.in);
        int stringLength = input.nextLine().length();
        char sentence = input.next().charAt(stringLength);
        int numWords = 0;
        for(int i = 0; i < stringLength; i++)
        {
            if(Character.isLetter(stringLength))
                continue;
            else
                numWords++;
        }
        System.out.println("There are " + numWords + " words in the sentence.");
    }
}
