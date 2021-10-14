package be.intec;

public class StringbuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Potato");
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.charAt(2));
        System.out.println(sb.indexOf("a"));
    }
}
