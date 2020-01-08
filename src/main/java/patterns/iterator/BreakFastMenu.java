package patterns.iterator;

import com.google.common.collect.Lists;

import java.util.Iterator;
import java.util.List;

public class BreakFastMenu implements Menu{
    List<String> items = Lists.newArrayList("1","2","3");


    @Override
    public Iterator createIterator() {
        return items.iterator();
    }
}
