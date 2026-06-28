import java.util.*;
public class Prog9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Amount: ");
        int amount = sc.nextInt();

        int[] notes = {2000, 500, 200, 100};

        int i = 0;

        while (i < notes.length) {

            if (amount >= notes[i]) {
                int count = amount / notes[i];
                System.out.println(notes[i] + " x " + count);
                amount = amount % notes[i];
            }

            i++;
        }

        if (amount > 0) {
            System.out.println("Remaining Amount = " + amount);
        }
    }
}