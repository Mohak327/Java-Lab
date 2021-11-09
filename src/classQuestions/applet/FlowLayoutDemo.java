// import java.awt.*;
// import java.awt.event.*;
// import java.applet.*;

// /*
//  <applet code="FlowLayoutDemo" width=400 height=200>
//  </applet>
// */

// public class FlowLayoutDemo extends Applet implements ItemListener, ActionListener {
//     String msg = " ";
//     Checkbox windows, android;
//     Button b1, b2;

//     public void init() {
//         // set left-aligned flow layout

//         setLayout(new FlowLayout(FlowLayout.LEFT, 20, 45)); // added layout manager

//         windows = new Checkbox("Windows", null, true);
//         android = new Checkbox("Android");
//         b1 = new Button("1");
//         b2 = new Button("2");

//         add(windows);
//         add(b1);
//         add(android);
//         add(b2);

//         // register to receive item events
//         windows.addItemListener(this);
//         android.addItemListener(this);
//         b1.addActionListener(this);
//         b2.addActionListener(this);
//     }

//     public void itemStateChanged(ItemEvent ie) {
//         repaint();
//     }

//     public void actionPerformed(ActionEvent ae) {
//         if (ae.getSource() == b1) {
//             msg = msg + "b1";
//         } else {
//             msg = msg + "b2";
//         }
//         repaint();
//     }

//     public void paint(Graphics g) {
//         msg = "Current state: ";
//         g.drawString(msg, 6, 80);
//         msg = " Windows: " + windows.getState();
//         g.drawString(msg, 6, 100);
//         msg = " Android: " + android.getState();
//         g.drawString(msg, 6, 120);
//         if (b1.getLabel() == "1") {
//             b1.setLabel("Hello");
//         } else {
//             msg = msg + "b2";
//             g.drawString(msg, 6, 120);
//         }

//     }
// }

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class FlowLayoutDemo extends JFrame {

static JFrame f;

public static void main(String[] args) {
f = new JFrame("frame");

f.setLayout(new FlowLayout());

JCheckBox c1 = new JCheckBox("checkbox 1");
JCheckBox c2 = new JCheckBox("checkbox 2");
JButton b1 = new JButton("button 1");
JButton b2 = new JButton("button 2");

JPanel p = new JPanel();

p.add(c1);
p.add(c2);
p.add(b1);
p.add(b2);

f.add(p);

f.setSize(600, 300);
f.show();
}
}