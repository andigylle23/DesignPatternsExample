package creational.factoryExample.factoryExample1.listOrder;

import creational.factoryExample.factoryExample1.abstractClass.AbstractListPrinter;
import creational.factoryExample.factoryExample1.orderComparator.LengthOrderComparator;

import java.util.Comparator;

public class LengthOrderListPrinter extends AbstractListPrinter {
    @Override
    protected Comparator<String> createComparator() {
        return new LengthOrderComparator();
    }
}
