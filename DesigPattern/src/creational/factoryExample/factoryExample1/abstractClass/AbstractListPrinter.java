package creational.factoryExample.factoryExample1.abstractClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class AbstractListPrinter {
    public void printList(List<String> list) {
        Comparator<String> comparator = createComparator();
        list = new ArrayList<String>(list);

        Collections.sort(list, comparator);

        for(String item: list) {
            System.out.println(item);
        }
    }
    protected abstract Comparator<String> createComparator();
}
