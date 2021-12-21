package be.intec;

import java.util.Comparator;

public interface BoxComparator {
    class LengthBoxComparator implements Comparator<Box>{

        @Override
        public int compare(Box o1, Box o2) {
            return o1.getLength() - o2.getLength();
        }
    }

    class WidthBoxComparator implements Comparator<Box>{

        @Override
        public int compare(Box o1, Box o2) {
            return o1.getWidth() - o2.getWidth();
        }
    }

    class ReverseLengthBoxComparator implements Comparator<Box>{

        @Override
        public int compare(Box o1, Box o2) {
            return o2.getLength() - o1.getLength();
        }
    }
}
