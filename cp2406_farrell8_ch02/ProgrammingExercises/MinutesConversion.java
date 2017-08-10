import javax.swing.JOptionPane;

public class MinutesConversion
{
    public static void main(String args[]) {
        float totalHours, totalDays;
        String totalMinutes;
        totalMinutes = JOptionPane.showInputDialog(null, "Input number of minutes", "Minutes Converter", JOptionPane.QUESTION_MESSAGE);
        totalHours = Float.parseFloat(totalMinutes) / 60;
        totalDays = Float.parseFloat(totalMinutes) / 60 / 24;
        System.out.println(totalMinutes + " minutes equals " + totalHours + " and equals " + totalDays + " days.");
    }
}
