import javax.swing.JOptionPane;

public class Bsixthjava {
    public static void main (String[] args){
        String name = "";
        name = JOptionPane.showInputDialog("Please enter your name");

        String msg = "Hello " + name + "! Pogi!";
        JOptionPane.showMessageDialog(null, msg);


    }
}
