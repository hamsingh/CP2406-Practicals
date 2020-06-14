public class FitnessTracker2
{
    private String activity, date;
    private int minutes;
    public FitnessTracker2()
    {
        //Default Constructor
        activity = "running";
        date = "January 1 2017";
        minutes = 0;
    }
    public FitnessTracker2(String activity, int minutes, String date)
    {
        this(activity, minutes, date);
    }
    public String getActivity()
    {
        return activity;
    }
    public String getDate()
    {
        return date;
    }
    public int getMinutes()
    {
        return minutes;
    }
    public void setActivity(String activity)
    {
        this.activity = activity;
    }
    public void setDate(String date)
    {
        this.date = date;
    }
    public void setMinutes(int minutes)
    {
        this.minutes = minutes;
    }
}