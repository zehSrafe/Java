package be.intec.toets;

public class PrimeNumberTest {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 21; i <= 100; i += 2){
            for (int j = 3; j < i; j++){
                if ((i % j) == 0){
                    break;
                } else if (i == j + 1){
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }
}
