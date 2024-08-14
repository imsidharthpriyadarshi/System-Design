package LLD.Patterns.behavioral.iterator;

public interface Aggregate<T> {
    <T> Iterators<T> createIterator();
}
