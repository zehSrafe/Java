package be.intec.ex1;

@FunctionalInterface
public interface WordFilter {
    boolean isValid(String s);
}
