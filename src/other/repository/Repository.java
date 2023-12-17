package jarai.patterns.other.repository;

import java.util.function.Predicate;

public interface Repository<T> {

    void add(T newRecord);

    void delete(T recordToDelete);

    void update(T recordToUpdate);

    Iterable<T> getWhere(Predicate<T> filter);

    T getById(int key);

}



