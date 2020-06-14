import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JCapitals extends JFrame implements ItemListener
{
    FlowLayout flow = new FlowLayout();
    JLabel countryLabel = new JLabel("Select a country");
    JComboBox<String> countryBox = new JComboBox<String>();
    JTextField capitalField = new JTextField(25);
    String[] countries = {"Australia", "India", "England", "USA", "Netherlands", "Sweden", "Croatia"};
    String[] capitals = {"Canberra", "New Dehli", "London", "Washington", "Amsterdam", "Stockholm", "Zagreb"};
    String myCountry;
    String output;
    int countryNum;
    public JCapitals()
    {
        super("Capitals of Countries");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        countryBox.addItemListener(this);
        countryBox.addItem(countries[0]);
        countryBox.addItem(countries[1]);
        countryBox.addItem(countries[2]);
        countryBox.addItem(countries[3]);
        countryBox.addItem(countries[4]);
        countryBox.addItem(countries[5]);
        countryBox.addItem(countries[6]);
        add(countryLabel);
        add(countryBox);
        add(capitalField);
    }
    public static void main(String[] arguments)
    {
        JCapitals cframe = new JCapitals();
        cframe.setSize(300, 100);
        cframe.setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent list)
    {
        Object source = list.getSource();
        if(source == countryBox)
        {
            countryNum = countryBox.getSelectedIndex();
            myCountry = countries[countryNum];
            output = "The capital of " + myCountry + " is " + capitals[countryNum];
            capitalField.setText(output);
        }
    }
}