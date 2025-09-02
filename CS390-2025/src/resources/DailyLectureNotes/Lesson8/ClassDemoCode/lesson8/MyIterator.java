package lesson8;

import java.util.Iterator;

public class MyIterator implements Iterable<String> {
    String[] arr;
    @Override
    public Iterator<String> iterator() {
        return new GetIterator();
    }

    class GetIterator implements Iterator<String>{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public String next() {
            return "";
        }
    }

}
