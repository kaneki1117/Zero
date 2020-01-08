package patterns.iterator;

import java.util.Iterator;

public class DinnerMenu implements Menu {
    int index = -1;
    String[] items = new String[]{"d1","d2","d3"};


    Iterator iterator = new Iterator() {
        @Override
        public boolean hasNext() {
            return index < items.length - 1;
        }
        @Override
        public Object next() {
            index++;
            return items[index];
        }
    };


    @Override
    public Iterator createIterator() {
        return iterator;
    }
}
