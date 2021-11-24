package be.intec;
import java.util.Scanner;

public class positiefOfNiet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geef nummer voor a:");
        int a = input.nextInt();

        while (a != 0){
            if (a > 0) {
                System.out.println("Positief");
            } else {
                System.out.println("Negatief");
            }
            System.out.println("Geef nummer voor a:");
            a = input.nextInt();
        }
    }
}
