import java.util.HashMap;

public class Echo {


    public Echo() {

    }

    void printCountEmployee(EmployeeDB employeeDB) {
        employeeDB.getListEmployee().size();
        System.out.println(employeeDB.getListEmployee().size());
    }

    void printEmployeeList(EmployeeDB employeeDB) {
        for (int i = 0; i < employeeDB.getListEmployee().size(); i++) {
            System.out.println(employeeDB.getListEmployee().get(i).getName());
        }


        //HashMap<Integer, Employee> list = employeeDB.getListEmployee();
        //for (Employee value : list.values()) {
        //   System.out.println(value.getName());
        //}

        //for (Integer value: list.keySet()){
        //    System.out.println(value);
        //}
    }
}