package creational.factoryExample.factoryExample1.orderComparator;

import java.util.Comparator;

public class LengthOrderComparator implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return str1.length() - str2.length();
    }
}
