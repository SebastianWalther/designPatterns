package verhaltensmuster.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IterableContainer implements Iterable<String> {
    String[] records;

    IterableContainer(String[] records) {
        this.records = records;
    }

    @Override
    public java.util.Iterator<String> iterator() {
        return new Iterator();
    }

    public class Iterator implements java.util.Iterator<String> {

        private int aktuellePosition = 0;

        @Override
        public boolean hasNext() {
            return aktuellePosition < records.length;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return records[aktuellePosition++];
        }
    }
}
