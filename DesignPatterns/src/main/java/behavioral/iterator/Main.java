package behavioral.iterator;

public class Main {

    public static void main(String[] args) {
        MyCollection collection = new MyCollection();

        collection.addElem(new Element());
        collection.addElem(new Element());
        collection.addElem(new Element());

        MyCollection.Iterator iterator = collection.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.getNext().toString());
        }
    }
}
