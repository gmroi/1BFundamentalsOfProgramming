import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bufferedlooping {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double balance = 20000;
        double amount;
        for (;;) {

            System.out.print("Enter amount (0 to stop): ");
            amount = Double.parseDouble(input.readLine());
            if (amount > 0) {
                balance = balance + amount;
            }
            else if (amount < 0) {
                if (balance >= -amount) {
                    balance = balance + amount;
                }
                else {
                    System.out.println("INSUFFICIENT FUNDS!");
                }
            }
            System.out.println("Outstanding Balance: " + balance);
            if (amount == 0) {
                break;
            }
        }
    }
}