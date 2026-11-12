import java.util.Arrays; // dito tayo nag import arrays para maka deeptostring

public class cinema { // name ng class
    public static void main(String[] args) {

        String[][] seats = { // 2d array na may text na seat
                {"Alice", "Bob", "Charlie"}, // name ng unang row
                {"David", "Emma", "Frank"} // second row naman
        };
        System.out.println("SEcond row, third column: " + seats[1][2]); //pinakita

        seats[0][1] = "Vacant"; //pinalitan yung bob ng Vacant

        System.out.println(Arrays.deepToString(seats)); // pinakita yung whole na laman ng 2d array

    }
}