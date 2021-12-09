package be.intec.ex1;

public class TextAppWithComments {
    public static void main(String[] args) {
        TextPrinter textPrinter = new TextPrinter("I get knocked down, but I get up again");

//        textPrinter.printFilteredWord(new WordFilter() {
//            @Override
//            public boolean isValid(String w) {
//                return w.contains("o");
//            }
//        });

        textPrinter.printFilteredWord((String w) -> w.contains("o"));   // does the same as above

//        textPrinter.printFilteredWord(new WordFilter() {
//            @Override
//            public boolean isValid(String s) {
//                return s.length() >= 5;
//            }
//        });

        textPrinter.printFilteredWord((String w) -> w.length() >= 5);   // does the same as above
    }
}
