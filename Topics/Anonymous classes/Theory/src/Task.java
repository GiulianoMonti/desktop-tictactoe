// You can experiment here, it won’t be checked

import javax.swing.*;

public class Task {
  public static void main(String[] args) {
    // put your code here
  }
}
 class BoxLayoutExample extends JFrame {
    public BoxLayoutExample() {
        super("Box Layout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);

        add(new JButton("First"));
        add(new JButton("Second"));
        add(new JButton("Third"));
        add(new JButton("Fourth"));
        add(new JButton("Fifth"));

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setVisible(true);
    }

    public static void main(final String[] args) {
        new BoxLayoutExample();
    }
}