package LLD.Patterns.behavioral.iterator;

import LLD.Patterns.behavioral.iterator.collections.Group;
import LLD.Patterns.behavioral.iterator.collections.Library;
import LLD.Patterns.behavioral.iterator.types.Book;
import LLD.Patterns.behavioral.iterator.types.Person;

public class Main {
    public static void main(String[] args) {
        //? Iterator pattern
        Group personGroup= new Group();
        personGroup.add(new Person("Sidharth",22, false));

        personGroup.add(new Person("Sid",82, true));
        personGroup.add(new Person("arth",22, false));
        personGroup.add(new Person("parth",24, false));
        personGroup.add(new Person("Sp",23, false));
        personGroup.add(new Person("Abhi",22, false));
        personGroup.add(new Person("Sidharth",22, false));

        Iterators<Person> iterators= personGroup.createIterator();
        while (iterators.hasNext()){
            System.out.println(iterators.next().toString());
        }

        Library library= new Library();
        library.add(new Book("J1", 344, 23));
        library.add(new Book("J2", 34, 2));
        library.add(new Book("J3", 44, 3));
        library.add(new Book("J4", 354, 230));
        library.add(new Book("J6", 4, 63));
        library.add(new Book("J5", 3488, 5));

        Iterators<Book> bookIterators= library.createIterator();
        while (bookIterators.hasNext()){
            System.out.println(bookIterators.next().toString());
        }


    }
}
