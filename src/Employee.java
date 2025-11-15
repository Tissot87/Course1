public class Employee {

    private static int countOfEmployee = 1;

    private final int id;

    private String name;

    private String secondName;

    private String lastName;

    private int department;

    private int salary;






    public Employee(String name, String secondName, String lastName, int department, int salary) {
        this.id = countOfEmployee;
        this.name = name;
        this.secondName = secondName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        countOfEmployee++;
    }

    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {
            return false;}

        Employee employee = (Employee) o;
        if (salary == employee.salary){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "ФИО " + name + " " + secondName + " " + lastName + ", ID "
                + id + ", отдел " + department + ", зарплата " + salary;
    }

    public void printShortInfo(){
        System.out.println("ФИО " + name + " " + secondName + " " + lastName + ", зарплата " +
                salary);
    }
}
