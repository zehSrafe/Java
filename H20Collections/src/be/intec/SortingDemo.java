package be.intec;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SortingDemo {
    public static void main(String[] args) {
        Set<Box> boxes = new TreeSet<>();
        boxes.add(new Box(420, 69, 42069));
        boxes.add(new Box(6, 123, 23));
        boxes.add(new Box(4, 3, 78));
        boxes.add(new Box(43, 89, 5));

        boxes.forEach(System.out::println); // automatically sorts data according to volume bcs box implements comparable
        // works with Box file.

        System.out.println("");

        //Works with BoxComparator file
        Set<Box> boxes1 = new TreeSet<>(new BoxComparator.ReverseLengthBoxComparator());
        boxes1.add(new Box(420, 69, 42069));
        boxes1.add(new Box(6, 123, 23));
        boxes1.add(new Box(4, 3, 78));
        boxes1.add(new Box(43, 89, 5));

        boxes1.forEach(System.out::println);

        System.out.println("");

        Set<Box> streamBoxes = boxes.stream()
                .filter(box -> box.getLength() > 90)
                .filter(box -> box.getWidth() > 50)
                .collect(Collectors.toSet());

        streamBoxes.forEach(System.out::println);
    }
}
