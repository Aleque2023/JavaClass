import javax.swing.*;

public class AQ_JavaSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Clicking");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click");
        frame.add(button);

        frame.setVisible(true);
    }
}
