import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPizza extends JFrame implements ItemListener {
    FlowLayout flow = new FlowLayout();
    JLabel companyName = new JLabel("YEAHH PIZZA FOR THE BOYS");
    final int [] sizePrice = {7, 9, 14};
    final int [] toppingPrice = {0, 0, 1, 1, 1, 1};
    int totalPrice = 0;
    int sizeNum, toppingNum;
    int sPrice, tPrice, sumPrice;
    JComboBox<String> sizeBox = new JComboBox<String>();
    JLabel sizeList = new JLabel("Size List");
    JComboBox<String> toppingBox = new JComboBox<String>();
    JLabel toppingList = new JLabel("Toppings");
    JTextField totalPriceField = new JTextField(10);
    String output;
    public JPizza(){
        super("Pizza Price Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(companyName);
        sizeBox.addItem("Small");
        sizeBox.addItem("Medium");
        sizeBox.addItem("Large");
        toppingBox.addItem("Cheese");
        toppingBox.addItem("Onion");
        toppingBox.addItem("Basel");
        toppingBox.addItem("Bacon");
        toppingBox.addItem("Chilli Flakes");
        toppingBox.addItem("Oregano");
        add(sizeList);
        add(sizeBox);
        sizeBox.addItemListener(this);
        add(toppingList);
        add(toppingBox);
        toppingBox.addItemListener(this);
        add(totalPriceField);
    }
    public static void main(String[] arguments)
    {
        JPizza aFrame = new JPizza();
        aFrame.setSize(320,150);
        aFrame.setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent check){
        Object source = check.getSource();
        if(source == sizeBox){
            sizeNum = sizeBox.getSelectedIndex();
            sPrice = sizePrice[sizeNum];
            sumPrice = sPrice + tPrice;
            output = "Total Price $" + sumPrice;
            totalPriceField.setText(output);
        }
        else if(source == toppingBox) {
            toppingNum = toppingBox.getSelectedIndex();
            tPrice = toppingPrice[toppingNum];
            sumPrice = sPrice + tPrice;
            output = "Total Price $" + sumPrice;
            totalPriceField.setText(output);
        }
    }
}

