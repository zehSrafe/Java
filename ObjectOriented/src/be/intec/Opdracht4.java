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
//        while (sb.indexOf(" ") >= 0){ // inedxof() returns -1 when done
//            sb.deleteCharAt(sb.charAt(sb.indexOf(" ")));
//        }
        System.out.println(sb);

//        sb.toString().replaceAll("t", "tt");
        int start = 0;
        while (sb.indexOf("t", start) >= 0){ // inedxof() returns -1 when done
            int foundIndex = sb.indexOf("t", start);
            sb.insert(foundIndex, "t");
            start = foundIndex + 2;
        }
        System.out.println(stringBuilder);
    }
}
