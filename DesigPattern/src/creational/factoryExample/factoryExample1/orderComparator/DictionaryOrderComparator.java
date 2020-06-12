package creational.factoryExample.factoryExample1.orderComparator;

import java.util.Comparator;

public class DictionaryOrderComparator implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
}
