import java.awt.*;
import javax.swing.*;

public class Menu extends JFrame {

    private JPanel panel;

    public Menu() {
        JFrame f = new JFrame("Experiment 14");
        f.setBackground(Color.decode("#1c0052"));
        JMenuBar bar = new JMenuBar();
        bar.setBackground(Color.decode("#1c0052"));
        JMenu m = new JMenu("Menu1");
        m.setFont(new Font("Raleway", Font.ITALIC, 16));
        m.setForeground(Color.WHITE);
        JMenuItem file = new JMenuItem("File");
        JMenuItem setting = new JMenuItem("Setting");
        JMenuItem rate = new JMenuItem("Rate");
        JMenuItem help = new JMenuItem("Help");
        m.add(file);
        m.add(setting);
        m.add(rate);
        m.add(help);
        bar.add(m);

        JMenu n = new JMenu("Menu2");
        n.setFont(new Font("Raleway", Font.ITALIC, 16));
        n.setForeground(Color.WHITE);
        JMenuItem file2 = new JMenuItem("File");
        JMenuItem setting2 = new JMenuItem("Setting");
        JMenuItem rate2 = new JMenuItem("Rate");
        JMenuItem help2 = new JMenuItem("Help");
        n.add(file2);
        n.add(setting2);
        n.add(rate2);
        n.add(help2);
        bar.add(n);
        f.setJMenuBar(bar);

        panel = new JPanel();
        JLabel name = new JLabel("Experiment 14");
        name.setFont(new Font("Raleway", Font.BOLD, 38));
        name.setForeground(Color.decode("#1c0052"));
        name.setBounds(50, 50, 375, 200);

        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(500, 750));
        // panel.setBackground(Color.decode("#dcc5f1"));
        panel.add(name);

        JScrollPane s = new JScrollPane(panel);
        f.add(s);
        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Menu();
    }
}