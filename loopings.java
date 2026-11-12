import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class loopings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number 1: ");
        int num = Integer.parseInt(br.readLine());
        int high = num;
        int low = num;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            num = Integer.parseInt(br.readLine());
            high = Math.max(high, num);
            low = Math.min(low, num);
        }

        System.out.println("Highest: " + high);
        System.out.println("Lowest: " + low);
    }
}