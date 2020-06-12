package structural.compositeExamples;

public class CompositePatternDemo {
    public static void main(String[] args) {

        Employee CEO = new Employee("John", "CEO", 3000000);
        Employee headSales = new Employee("Robert", "Head Sales", 200000);
        Employee headMarketing = new Employee("Micheal", "Head Marketing", 100000);

        Employee clerk1 = new Employee("Laura", "Marketing", 25000);
        Employee clerk2 = new Employee("Jane", "Marketing", 25000);

        Employee salesExecutive1 = new Employee("Richard", "Sales", 30000);
        Employee salesExecutive2 = new Employee("Rob", "Sales", 30000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        // Print all employees of the organization
        System.out.println("CEO is:: " + CEO);

        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println("CEO Subordinates:: " + headEmployee);

            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println("Head Employee Subordinates:: " + employee);
            }
        }

   }
}
