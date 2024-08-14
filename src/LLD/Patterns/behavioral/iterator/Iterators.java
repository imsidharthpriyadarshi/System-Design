package LLD.Patterns.behavioral.iterator;

public interface Iterators<T> {
    boolean hasNext();
    <T> T next();
}
