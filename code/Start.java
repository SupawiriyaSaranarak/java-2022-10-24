import java.util.Iterator;
class Start {
    public static void main (String[] data) {
        System.out.println("Welcome back to java");
        Chain<Element> chain = new Chain();
        chain.add("David B", 42000);
        chain.add("Michael O", 40000);
        chain.add("Frank L", 36000);
        System.out.println(chain.latest.name);
        //Iterator was design to work with while
        while (chain.hasNext()) {
            Element current = chain.next();
            System.out.println(current.name);
        }
        System.out.println(chain.hasNext());
         //but for is not different from while
        for (;chain.hasNext();) { 
            Element current = chain.next();
            System.out.println(current.name);
        }
        //Iterator cannot use enhace for loop
        //but if class implements iterable it make this class can use enhance for loop
        for (Element e: chain) {
            System.out.println(e.name);
        }
        
    }
}
// class - data type
// interface - class that allow to create multiple direct superclasses
// enum - enumeration data
// record - class written shortly

// In java, interface usually ending with -able or -ible

// Iterator / Iterable

//interface Iterator {
//    Object next(); //must be written
//    boolean hasNext(); //must be written
//    default void remove(){};
//    default void forEachRemaining(Consumer<? super E> action) {}
//}

class Chain<T> implements Iterator<T>, Iterable<T> {
    public Iterator<T> iterator() { // will allow class to use enhance for loop
        index = latest; // if not have this line for loop is enable only 1 time
        return this;
    }
    public T next() {
        T temporary = index;
        index =(T)((Element)index).back;
        return temporary;
    }
    T index;
    public boolean hasNext() {
        return index != null;
    }
    T latest;
    void add (String name, double salary) {
        Element e = new Element();
        e.name = name; e.salary = salary;
        e.back = (Element)latest;
        latest = (T)e;
        index = latest;
    }
}

class Element {
    String name;
    double salary;
    Element back;
}


