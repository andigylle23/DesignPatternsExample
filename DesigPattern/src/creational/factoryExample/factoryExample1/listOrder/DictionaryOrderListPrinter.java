package creational.factoryExample.factoryExample1.listOrder;

import creational.factoryExample.factoryExample1.abstractClass.AbstractListPrinter;
import creational.factoryExample.factoryExample1.orderComparator.DictionaryOrderComparator;

import java.util.Comparator;

public class DictionaryOrderListPrinter extends AbstractListPrinter {

    @Override
    protected Comparator<String> createComparator() {
        return new DictionaryOrderComparator();
    }
}
