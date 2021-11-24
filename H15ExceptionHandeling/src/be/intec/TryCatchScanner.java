package be.intec;

import java.util.Scanner;

public class TryCatchScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int givenNumber = 0;

        do {
            try {
                System.out.println("Enter number");
                givenNumber = input.nextInt();
                break;
            } catch (Exception e){
                input.nextLine();   // anders blijft bij fout invoer een enter in de input steken en dan oneindige loop
                                    // niet altijd het meest leesbare maar wel het meest performante
                System.out.println("Invalid input. try again.");
            }
        } while (true);

        input.close();
        System.out.printf("Given number is %d", givenNumber);
    }
}
