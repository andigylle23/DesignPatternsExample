package creational.factoryExample.factoryExample1;

import creational.factoryExample.factoryExample1.listOrder.DictionaryOrderListPrinter;
import creational.factoryExample.factoryExample1.listOrder.LengthOrderListPrinter;

import java.util.Arrays;
import java.util.List;

public class FactoryMain {
    public static void main(String args[]) {
        List<String> list = Arrays.asList("いちご", "もも", "いちじく");

        System.out.println("五十音順で表示: ");
        new DictionaryOrderListPrinter().printList(list);

        System.out.println();

        System.out.println("長さ順で表示: ");
        new LengthOrderListPrinter().printList(list);
    }
}
