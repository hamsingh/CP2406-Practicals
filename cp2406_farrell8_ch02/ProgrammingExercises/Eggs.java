import javax.swing.JOptionPane;

public class Eggs
{
   public static void main(String args[])
   {
      final double dozenCost = 3.25, looseCost = 0.45;
      double totalCost;
      String totalEggs;
      int totalDozen;
      int totalLoose;
      totalEggs = JOptionPane.showInputDialog(null,"How many eggs would you like to purchase?", "Order Eggs",JOptionPane.QUESTION_MESSAGE);
      totalDozen = Integer.parseInt(totalEggs) / 12;
      totalLoose = Integer.parseInt(totalEggs) % 12;
      totalCost = totalDozen * dozenCost + totalLoose * looseCost;
      System.out.println("You ordered " + totalEggs + " eggs. That's " + totalDozen + " dozen at $"+ dozenCost + " per dozen and " + totalLoose + " loose eggs at $" + looseCost + " each for a total of $" + totalCost + ".");
    }
}