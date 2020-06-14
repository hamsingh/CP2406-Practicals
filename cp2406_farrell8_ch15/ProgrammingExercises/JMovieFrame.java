import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JMovieFrame extends JFrame implements ActionListener
{
    JButton northButton = new JButton("Movie 1");
    JButton southButton = new JButton("Movie 2");
    JButton eastButton = new JButton("Movie 3");
    JButton westButton = new JButton("Movie 4");
    JButton centerButton = new JButton("Movie 5");
    JLabel northLabel = new JLabel(" XXXX, Actor 1");
    JLabel southLabel = new JLabel(" XXXX, Actor 2");
    JLabel eastLabel = new JLabel(" XXXX, Actor 3");
    JLabel westLabel = new JLabel(" XXXX, Actor 4");
    JLabel centerLabel = new JLabel(" XXXX, Actor 5");
    public JMovieFrame()
    {
        setTitle("JMovieFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(westButton,"West");
        add(centerButton,"Center");
        add(eastButton,"East");
        add(northButton,"North");
        add(southButton,"South");
        eastButton.addActionListener(this);
        centerButton.addActionListener(this);
        westButton.addActionListener(this);
        northButton.addActionListener(this);
        southButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == northButton) {
            remove(northButton);
            add(northLabel, BorderLayout.NORTH);
        }
        else
        if(source == southButton) {
            remove(southButton);
            add(southLabel, BorderLayout.SOUTH);
        }
        else
        if(source == eastButton) {
            remove(eastButton);
            add(eastLabel, BorderLayout.EAST);
        }
        else
        if(source == westButton) {
            remove(westButton);
            add(westLabel, BorderLayout.WEST);
        }
        else {
            remove(centerButton);
            add(centerLabel, BorderLayout.CENTER);
        }
        invalidate();
        validate();
    }
    public static void main(String[] args) {
        JMovieFrame movieFrame = new JMovieFrame();
        movieFrame.setSize(650,300);
        movieFrame.setVisible(true);
    }
}