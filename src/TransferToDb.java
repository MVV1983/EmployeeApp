import java.util.HashMap;


public class TransferToDb {
    Employee employee;
    //класс для сохранения сотрудников в ДБ \HashMap либо List  в зависимости от потребности

    int personalNumber = 0;//переменная пихается в порядковый номер запись сотрудника в HashMap
    private HashMap<Integer, Employee> listEmployee = new HashMap<>();

    public HashMap<Integer, Employee> getListEmployee() {
        return listEmployee;
    }

    //Добавим сотрудника
    void addEmployee(Employee employee) {
        listEmployee.put(personalNumber, employee);
        personalNumber++;
    }

    //удалим сорудника
    void deleteEmployee(Employee employee) {

    }
}