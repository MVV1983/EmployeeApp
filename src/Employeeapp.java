public class Employeeapp {


    public static void main(String[] args) {
        Employee dev1 = new Developer("goose1");
        Employee dev2 = new Developer("goose2");

        EmployeeDB employeeDB = new EmployeeDB();
        employeeDB.saveEmployee(dev1);
        employeeDB.saveEmployee(dev2);



        Echo echo = new Echo();
        echo.printEmployeeList(employeeDB);
        echo.printCountEmployee(employeeDB);
    }
}