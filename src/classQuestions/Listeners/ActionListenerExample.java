import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ActionListenerExample extends JFrame implements ActionListener {
    JLabel lblData;
    JButton btnOk, btnCancel;

    ActionListenerExample() {
        setLayout(new FlowLayout());
        lblData = new JLabel("Click any button to display data");
        btnOk = new JButton("OK");
        btnCancel = new JButton("Cancel");
        // Register the current(this);
        btnOk.addActionListener(this);
        btnCancel.addActionListener(this);
        add(lblData);
        add(btnOk);
        add(btnCancel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOk)
            lblData.setText("OK Button is Clicked ");
        else
            lblData.setText("Cancel Button is Clicked ");
    }

    public static void main(String args[]) {
        ActionListenerExample frame = new ActionListenerExample();
        frame.setTitle("ActionListener in Java Swing Examples");
        frame.setBounds(200, 150, 500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
