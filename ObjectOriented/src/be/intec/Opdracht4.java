package be.intec;

public class Opdracht4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("First string");
        StringBuilder stringBuilder = new StringBuilder("Second string");

        System.out.println(sb);
        System.out.println(stringBuilder);

        System.out.println(sb.append(". some other text"));
        System.out.println(stringBuilder.reverse());
        for (int i = 0; i < sb.length(); i++){
            if (sb.charAt(i) == ' '){
                sb.deleteCharAt(i);
            }
        }
        System.out.println(sb);

        for (int i = 0; i < sb.length(); i++){
            System.out.println(i);
            System.out.println(stringBuilder.charAt(i));
            if (stringBuilder.charAt(i) == 't'){
                stringBuilder.replace(i, i, "0");
            }
        }
        System.out.println(stringBuilder);
    }
}
