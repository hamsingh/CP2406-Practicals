import java.util.Arrays;
import java.util.Collections;

public class ArrayMethodDemo
{
    public static void main(String[] args)
    {
        Integer[] array = new Integer[] {5,17,6,9,20,2,15,10,19,11,14,12};
        System.out.println(array);
        Arrays.sort(array);
        System.out.println(array);
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(array);
    }
}
