import javax.swing.JOptionPane;

public class DecisionControlStructure2_JOption {
    public static void main(String[] args) {

        String data = JOptionPane.showInputDialog("Enter hourly pay rate:");
        double rate = Double.parseDouble(data);

        data = JOptionPane.showInputDialog("Enter hours worked: ");
        double hours = Double.parseDouble(data);

        double gross = hours * rate;
        double tax;

        if (gross <= 2000) {
            tax = gross * 0.10;
        } else if (gross <= 4000) {
            tax = gross * 0.12;
        } else if (gross <= 10000) {
            tax = gross * 0.15;
        } else {
            tax = gross * 0.20;
        }
        double net = gross - tax;

        JOptionPane.showMessageDialog(null, "Gross Pay: " + gross);
        JOptionPane.showMessageDialog(null, "Withholding Tax: " + tax);
        JOptionPane.showMessageDialog(null, "Net Pay: " + net);
    }
}