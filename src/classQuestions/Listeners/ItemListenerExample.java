import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 class ItemListenerExample extends JFrame implements ItemListener
 {
     JLabel lblData;
     JComboBox cbofont;
     ItemListenerExample()
     {
         setLayout(new FlowLayout());
         lblData = new JLabel("Font Displayed");
         String[] fontData ={"Arial","Courier New", "Arial Black", "Times New Roman"};
         cbofont = new JComboBox(fontData);
         cbofont.addItemListener(this);
         add(lblData);
         add(cbofont);
     }
      public void itemStateChanged(ItemEvent e)
      {
          String fontName = (String) cbofont.getSelectedItem();
          Font font = new Font(fontName, Font.PLAIN, 12);
          lblData.setFont(font);
      }

      public static void main(String[] args)
      {
         ItemListenerExample frame = new ItemListenerExample();
         frame.setTitle("ItemListener Java Example");
         frame.setBounds(200,150,400,300);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setResizable(false);
         frame.setVisible(true);
     }
 }
