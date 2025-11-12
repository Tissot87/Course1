public class EmployeeBook {

    static Employee[] all = new Employee[10];

    public static void allEmployeeInformation() {
        if (all != null) {
            for (Employee employee : all) {
                if (employee != null) {
                    System.out.println(employee);
                }
            }
        }
    }

    public static void avgSalary() {
        int sumSalary = 0;
        int countOfWorkers = 0;
        for (Employee employee : all) {
            if (employee != null) {
                sumSalary = sumSalary + employee.getSalary();
                countOfWorkers++;
            } else break;
        }
        System.out.println("Средняя зарплата " + (float) sumSalary / countOfWorkers);
    }

    public static void taxes(String type) {
        switch (type) {
            case ("PROPORTIONAL"):
                for (Employee employee : all) {
                    if (employee != null) {
                        float tax = ((float) employee.getSalary() / 100) * 13;
                        System.out.println(employee.getName() + " " + employee.getSecondName() +
                                " " + employee.getLastName() + " налог составил " + tax);
                    } else break;
                }
                break;

            case ("PROGRESSIVE"):
                for (Employee employee : all) {
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

    public static void indexSalary(int department) {
        for (Employee employee : all) {
            if (employee != null) {
                if (employee.getDepartment() != department) {
                    continue;
                } else {
                    int changeSalary = employee.getSalary() + employee.getSalary() / 100 * employee.getDepartment();
                    employee.setSalary(changeSalary);
                }
            } else break;
        }
    }

    public static void levelSalary(int department, int salaryLevel) {
        for (Employee employee : all) {
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

    public static void lowSalary(int wage, int employeeNumber){

        int i = 0;
        for (Employee employee : all) {

            while (i < employeeNumber) {

                if (wage > employee.getSalary()) {
                    System.out.println(employee);
                    i++;
                }
                break;
            }
        }
    }

    public static boolean eqemployee(Employee employee){
        boolean flag = false;
        for (Employee employee1 : all){
            if (employee.equals(employee1)){
                flag = true;
            }
        }
        return flag;
    }

    public static boolean addEmployee(Employee employee){
        for (int i = 0; i < all.length; i++){
            if (all[i] == null) {
                all[i] = employee;
                return true;
            }
        }

        return false;
    }


    public static void findById(int id){
        for (Employee employee : all){
            if (employee.getId() == id){
                System.out.println(employee);
                break;
            }
        }
    }

}
