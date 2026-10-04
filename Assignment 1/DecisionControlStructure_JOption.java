import javax.swing.JOptionPane;
import java.awt.*;

public class DecisionControlStructure_JOption {
    public static void main (String[] args) {

        String data = JOptionPane.showInputDialog("Enter year!");
        int year = Integer.parseInt(data);

        if (year % 400 == 0) {

            JOptionPane.showMessageDialog(null, "Leap Year");

        } else if (year % 100 == 0) {
            JOptionPane.showMessageDialog(null, "Not a leap year");

        } else if (year % 4 == 0) {
            JOptionPane.showMessageDialog(null, "Leap Year");

        } else {
            JOptionPane.showMessageDialog(null, "Not a leap year");

        }
    }
}