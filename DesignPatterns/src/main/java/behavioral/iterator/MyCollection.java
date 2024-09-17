package behavioral.iterator;

public class MyCollection {

    int size = 0;
    Element[] array = new Element[100];

    boolean addElem(Element element) {
        if (size == 100) {
            return false;
        }
        array[size++] = element;

        return true;
    }

    Iterator createIterator() {
        return new Iterator();
    }

    class Iterator {
        private int currentIndex = 0;

        boolean hasNext() {
            return currentIndex < size;
        }

        Element getNext() {
            return array[currentIndex++];
        }

        void reset() {
            currentIndex = 0;
        }
    }
}
