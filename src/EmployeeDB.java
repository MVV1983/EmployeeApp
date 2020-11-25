import java.util.HashMap;

public class EmployeeDB {//класс для сохранения сотрудников в ДБ \HashMap либо List  в зависимости от потребности

    int personalNumber = 0;//переменная пихается в порядковый номер запись сотрудника в HashMap
    private HashMap<Integer, Employee> listEmployee = new HashMap<>();

    public HashMap<Integer, Employee> getListEmployee() {
        return listEmployee;
    }

    void saveEmployee(Employee employee) {
        listEmployee.put(personalNumber, employee);
        personalNumber++;
    }
}