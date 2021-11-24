package be.intec.ifElse;

public class Exercice {
    public void ageDrinking(int age){
        if (age >= 18) {
            System.out.println("Adult");
        } else if (age >= 3){
            System.out.println("Child");
        } else {
            System.out.println("Baby");
        }
    }

    public void printAlphabet(){
        System.out.println("abcdefghijklmnopqrstuvwxyz");
    }
}
