package be.intec.ex1;

public class TextPrinter {

    private String sentence;

    public TextPrinter(String sentence) {
        this.sentence = sentence;
    }

    public void printFilteredWord(WordFilter wordFilter){
        for (String w : sentence.split(" ")){
            if (wordFilter.isValid(w)){
                System.out.println(w);
            }
        }
    }
}
