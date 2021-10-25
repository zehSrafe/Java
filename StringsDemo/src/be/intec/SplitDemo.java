package be.intec;

public class SplitDemo {
    public static void main(String[] args) {
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";

        String[] textSplit = text.split(" ");

//        for (String word : textSplit){
//            System.out.println(word);
//        }

        String csv = "Lorem,Ipsum,is\n" +
                "dummy,text,of\n" +
                "and,typesetting,industry.";

        String[] people = csv.split("\n");
        for (String person : people) {
            String[] values = person.split(",");
            String name = values[0];
            String age = values[1];
            String adress = values[2];
            System.out.println("Name: " + name + " Age: " + age + " Adress: " + adress);
        }
    }
}
