public class TestFitnessTracker
{
    public static void main(String[] args)
    {
        FitnessTracker activity1 = new FitnessTracker();
        System.out.println("Activity is: " + activity1.getActivity());
        System.out.println("Date is: " + activity1.getDate());
        System.out.println("Minutes are: " + activity1.getMinutes());
    }
}
