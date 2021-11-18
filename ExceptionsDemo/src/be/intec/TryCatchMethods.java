package be.intec;

public class TryCatchMethods {
    public static void main(String[] args) {
        System.out.println("Before exception");

        try {
            someMethod();
        } catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bound");
        } catch (NullPointerException e) {       //als opgegooid exception niet bij de eerste catch hoort gaat het naar de tweede catch
            System.out.println("NPE error");
//        } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) { // || zal stoppen bij eerste true. | zal alles controlleren
//            System.out.println("Array of String index out of bound");                  // extends index out of bound dus is nu nutteloos
        } catch (Exception e) {             // "Default" catch statemnt voor als de error bij geen van bovenstaande hoort
            System.out.println("You got an error my friend");
        }
        System.out.println("After catch");
    }

    public static void someMethod(){
        int[] arr = new int[5];
        arr[5] = 5;
    }
}