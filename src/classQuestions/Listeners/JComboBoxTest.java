import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JComboBoxTest {

    private static class MyComboBox extends JComboBox<String> implements ActionListener, ItemListener {
        static int count = 0;

        public MyComboBox(String[] l) {
            super(l);
            addActionListener(this);
            addItemListener(this);
            this.setSelectedIndex(-1);

        lblData = new JLabel("Click any button to display data");

        }

        public void actionPerformed(ActionEvent e) {
            count++;
            System.out.println(count + ": Action performed - ");
        }

        public void itemStateChanged(ItemEvent e) {
            count++;
            System.out.println(count + ": Item state changed - ");
        }

    }

    public static void main(String[] a) {
        JFrame f = new JFrame("My Combo Box");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel color = new JLabel("Colors:");
        f.getContentPane().add(color, BorderLayout.NORTH);
        String[] options = { "Red", "Green", "Blue" };
        MyComboBox list = new MyComboBox(options);
        list.setSelectedIndex(-1);
        f.getContentPane().add(list, BorderLayout.SOUTH);

        f.pack();
        f.setVisible(true);
    }
}