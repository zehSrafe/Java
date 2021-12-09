package be.intec.ex1;

public class TextApp {
    public static void main(String[] args) {
        TextPrinter textPrinter = new TextPrinter("I get eve knocked down, but I get up again");

        textPrinter.printFilteredWord((String w) -> w.contains("e"));
        System.out.println("");
        textPrinter.printFilteredWord((String w) -> w.length() > 4);
        System.out.println("");
        textPrinter.printFilteredWord((String w) -> w.startsWith("a"));
        System.out.println("");
        textPrinter.printFilteredWord(new WordFilter() {
            @Override
            public boolean isValid(String s) {
                if (s.length() > 1){
                    return s.charAt(1) == 'e';
                }
                return false;
            }
        });
        System.out.println("");
        textPrinter.printFilteredWord(new WordFilter() {
            @Override
            public boolean isValid(String s) {
                if (s.contains("e")){
                    int amount = 0;
                    int count = 0;
                    while (count < s.length() && amount < 2){
                        if (s.charAt(count) == 'e'){
                            amount++;
                        }
                        count++;
                    }
                    return amount == 2;
                }
                return false;
            }
        });
    }
}
