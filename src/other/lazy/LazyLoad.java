package jarai.patterns.other.lazy;

import java.util.function.Supplier;

public class LazyLoad<T> {

    private final Supplier<T> supplier;
    boolean isLoaded = false;
    T value;

    public LazyLoad(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public T getValue() {
        if (!isLoaded) {
            value = supplier.get();
            isLoaded = true;
        }

        return value;
    }
}
