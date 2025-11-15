public class EmployeeBook {

    Employee[] employees = new Employee[10];

    public void obtainingAllEmployeeInformation() {

            for (Employee employee : employees) {
                if (employee != null) {
                    System.out.println(employee);
                }
            }

    }

    public void findAverageSalary() {
        int sumSalary = 0;
        int countOfWorkers = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sumSalary = sumSalary + employee.getSalary();
                countOfWorkers++;
            } else {break;}
        }
        System.out.println("Средняя зарплата " + (float) sumSalary / countOfWorkers);
    }

    public void calculationTaxes(String type) {
        switch (type) {
            case ("PROPORTIONAL"):
                for (Employee employee : employees) {
                    if (employee != null) {
                        float tax = ((float) employee.getSalary() / 100) * 13;
                        System.out.println(employee.getName() + " " + employee.getSecondName() +
                                " " + employee.getLastName() + " налог составил " + tax);
                    } else {break;}
                }
                break;

            case ("PROGRESSIVE"):
                for (Employee employee : employees) {
                    if (employee != null) {
                        if (employee.getSalary() < 150) {
                            float tax = ((float) employee.getSalary() / 100) * 13;
                            System.out.println(employee.getName() + " " + employee.getSecondName() +
                                    " " + employee.getLastName() + " налог составил " + tax);
                        } else if (employee.getSalary() >= 150 && employee.getSalary() < 350) {
                            float tax = ((float) employee.getSalary() / 100) * 17;
                            System.out.println(employee.getName() + " " + employee.getSecondName() +
                                    " " + employee.getLastName() + " налог составил " + tax);

                        } else {
                            float tax = ((float) employee.getSalary() / 100) * 21;
                            System.out.println(employee.getName() + " " + employee.getSecondName() +
                                    " " + employee.getLastName() + " налог составил " + tax);
                        }
                    }
                }break;
        }
    }

    public void indexSalary(int department) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() != department) {
                    continue;
                } else {
                    int changeSalary = employee.getSalary() + employee.getSalary() / 100 * employee.getDepartment();
                    employee.setSalary(changeSalary);
                }
            } else {break;}
        }
    }

    public void levelSalary(int department, int salaryLevel) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() != department) {
                } else {
                    if (employee.getSalary() > salaryLevel) {
                        employee.printShortInfo();
                        System.out.println(employee.getId());
                        break;
                    }
                }
            }
        }
    }

    public void findLowestSalary(int wage, int employeeNumber){

        int i = 0;
        for (Employee employee : employees) {

                if (wage > employee.getSalary() && i < employeeNumber) {
                    System.out.println(employee);
                    i++;
                }
                break;

        }
    }

    public boolean comparisonEmployee(Employee employee){
        for (Employee employee1 : employees){
            if (employee.equals(employee1)){
                return true;
            }
        }
        return false;
    }

    public boolean addEmployee(Employee employee){
        for (int i = 0; i < employees.length; i++){
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }

        return false;
    }


    public void findById(int id){
        for (Employee employee : employees){
            if (employee.getId() == id){
                System.out.println(employee);
                break;
            }
        }
    }

}
