//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Employee employee1 = new Employee("a", "q", "z", 2, 1);
        Employee employee2 = new Employee("s", "a", "x", 1, 3);
        Employee employee3 = new Employee("d", "w", "c", 3, 2);
        Employee employee4 = new Employee("f", "e", "v", 5, 7);
        Employee employee5 = new Employee("g", "r", "b", 4, 5);
        Employee employee6 = new Employee("h", "t", "n", 3, 3);
        Employee employee7 = new Employee("j", "y", "m", 2, 5);
        Employee employee8 = new Employee("k", "u", "q", 3, 7);
        Employee employee9 = new Employee("l", "i", "w", 1, 1);
        Employee employee10 = new Employee("q", "o", "e", 5, 9);
        Employee employee11 = new Employee("w", "p", "r", 4, 4);

        System.out.println(EmployeeBook.addEmployee(employee1));
        System.out.println(EmployeeBook.addEmployee(employee2));
        System.out.println(EmployeeBook.addEmployee(employee3));
        System.out.println(EmployeeBook.addEmployee(employee4));
        System.out.println(EmployeeBook.addEmployee(employee5));
        System.out.println(EmployeeBook.addEmployee(employee6));
        System.out.println(EmployeeBook.addEmployee(employee7));
        System.out.println(EmployeeBook.addEmployee(employee8));
        System.out.println(EmployeeBook.addEmployee(employee9));
        System.out.println(EmployeeBook.addEmployee(employee10));
        System.out.println(EmployeeBook.addEmployee(employee11));


    }
}