import javax.swing.JOptionPane;

public class DecisionControlStructure_Assignment3Decision_JOption {
    public static void main(String[] args) {

        String JOPTION = JOptionPane.showInputDialog("Enter your nsat score! ");
        double nsat = Double.parseDouble(JOPTION);

        JOPTION = JOptionPane.showInputDialog("Enter your parents monthly salary! ");
        double salary = Double.parseDouble(JOPTION);

        JOPTION = JOptionPane.showInputDialog("Enter your Exam Score! ");
        double exam = Double.parseDouble(JOPTION);

        if (salary > 10000 || nsat < 90 || exam < 85) {
            JOptionPane.showMessageDialog(null, "REJECTED!");
        } else if (salary <= 3500 && nsat + exam >= 182) {
            JOptionPane.showMessageDialog(null, "ACCEPTED!");
        } else {
            JOptionPane.showMessageDialog(null, "FOR FURTHER STUDY!");

        }

    }
}