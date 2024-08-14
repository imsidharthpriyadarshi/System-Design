package LLD.Patterns.behavioral.iterator.collections;

import LLD.Patterns.behavioral.iterator.Aggregate;
import LLD.Patterns.behavioral.iterator.Iterators;
import LLD.Patterns.behavioral.iterator.types.Book;

import java.util.ArrayList;
import java.util.List;

public class Library implements Aggregate<Book> {

    private List<Book> bookList= new ArrayList<>();

    public void add(Book obj){
        this.bookList.add(obj);
    }

    private class LibraryItr implements Iterators<Book>{
        private List<Book> books;
        private int position;
        public LibraryItr(List<Book> books){
            this.position= 0;
            this.books=books;
        }


        @Override
        public boolean hasNext() {
            return position < books.size();
        }

        @Override
        public  Book next() {
            return this.books.get(this.position++);
        }
    }

    @Override
    public Iterators<Book> createIterator() {

        return  new LibraryItr(bookList);
    }

}
