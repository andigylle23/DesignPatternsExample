package creational;

import creational.abstractExample.example1.abstractFactory.AbstractFactory;
import creational.abstractExample.example1.abstractproduct.AbstractProduct1;
import creational.abstractExample.example1.abstractproduct.AbstractProduct2;
import creational.abstractExample.example1.abstractproduct.AbstractProduct3;
import creational.builderExample.example1.Director;
import creational.builderExample.example1.HouseBuilder.AmericanHouseBuilder;
import creational.builderExample.example1.HouseBuilder.Building;
import creational.builderExample.example1.HouseBuilder.JapaneseHouseBuilder;
import creational.factoryExample.factoryExample1.listOrder.DictionaryOrderListPrinter;
import creational.factoryExample.factoryExample1.listOrder.LengthOrderListPrinter;
import creational.prototypeExample.example1.PrototypeFactory;
import creational.prototypeExample.example1.PrototypeImpl;
import creational.prototypeExample.example1.PrototypeMain;
import creational.singletonExample.SingletonObject;

import java.util.*;

public class MainDemo {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int inputChoice = 0;
        while(inputChoice != 6) {
            displayMenu();
            inputChoice = getChoice();
            processChoice(inputChoice);
        }
    }

    public static void displayMenu() {
        System.out.println("Select below what type of structural design you want to display the output:");
        System.out.println("1: Abstract Pattern");
        System.out.println("2: Factory Pattern");
        System.out.println("3: Builder");
        System.out.println("4: Prototype");
        System.out.println("5: Singleton");
        System.out.println("6: Exit");

    }

    private static int getChoice() {
        int getChoice = 0;
        System.out.print("Make your choice: ");
        int choice = input.nextInt();
        System.out.println("###########################################\n");

        return choice;

    }

    private static void processChoice(int choice) {
        switch (choice) {
            case 1:
                abstractPatternDemo();
                break;
            case 2:
                factoryPatternDemo();
                break;
            case 3:
                builderPatternDemo();
                break;
            case 4:
                prototypePatternDemo();
                break;
            case 5:
                singletonPatternDemo();
                break;
            case 6:
                input.close();
                break;
            default:
                System.out.println("The number that you inputted is not in the list.");
        }
    }

    public static void abstractPatternDemo() {
        System.out.println("Abstract Factory Example");
        System.out.println("###########################################\n");
        // initialize abstract factory
        List<AbstractFactory> factories = new ArrayList<AbstractFactory>();

        // Add the concrete factory
        factories.add(AbstractFactory.createFactory());
        // Iterate the added factories
        Iterator<AbstractFactory> it = factories.iterator();

        // Initialize new abstract factory based on length of the factories added
        AbstractFactory factory = it.next();

        // Assign to new parameter the productname that it gets from creational.abstractExample.example1.concreateFactory.ConcreteFactory
        AbstractProduct1 product1 = factory.createProduct1();
        AbstractProduct2 product2 = factory.createProduct2();
        AbstractProduct3 product3 = factory.createProduct3();

        // Execute the method from AbstractProduct where it was overridden in ConcreteProduct
        product1.execute();
        product2.run();
        product3.action();
        System.out.println("\n###########################################\n");
    }

    public static void builderPatternDemo() {
        System.out.println("Builder Factory Example");
        System.out.println("###########################################\n");
        // Initialization of different categories of Builders
        Director d1 = new Director(new JapaneseHouseBuilder());
        Director d2 = new Director(new AmericanHouseBuilder());

        // Assign the initialize object
        Building b1 = d1.construct();
        Building b2 = d2.construct();

        // Display the output
        System.out.println("Japanese Builder: " + b1);
        System.out.println("Alaska Builder: " + b2);

        System.out.println("\n###########################################\n");
    }

    public static void factoryPatternDemo() {
        System.out.println("Factory Example");
        System.out.println("###########################################\n");
        List<String> list = Arrays.asList("いちご", "もも", "いちじく");

        System.out.println("五十音順で表示: ");
        new DictionaryOrderListPrinter().printList(list);

        System.out.println();

        System.out.println("長さ順で表示: ");
        new LengthOrderListPrinter().printList(list);

        System.out.println("\n###########################################\n");
    }

    public static void prototypePatternDemo() {
        System.out.println("Prototype Example");
        System.out.println("###########################################\n");
        try {
            PrototypeFactory tempExample = null;
            int num = 1000;
            PrototypeFactory proto = new PrototypeImpl(1000);
            PrototypeMain cm = new PrototypeMain(proto);
            for (int i = 0; i < 10; i++) {
                tempExample = cm.makeCopy();
                tempExample.prototypeFactory(i * num);
                tempExample.printValue();
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("\n###########################################\n");
    }
    public static void singletonPatternDemo() {
        System.out.println("Singleton Example");
        System.out.println("###########################################\n");
        SingletonObject object  = SingletonObject.getInstance();
        // Show message
        object.showMessage();
        System.out.println("\n###########################################\n");
    }
}
