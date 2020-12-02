import java.util.ArrayList;
import java.util.List;

public class HR extends Person implements Employee {
    ConnectDb connectDb = new ConnectDb();
    TransferToDb transferToDb = new TransferToDb();
    Printer printer = new Printer();

    List<String> listNameAllStaff = new ArrayList<>();//HR сохраняет из базы себе в лист имена всех сотрудников допустим в txt файл

    int countEmployee;

    private String name;

    public HR(String name, int age, String gender) {
        super(name, age, gender);
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void work() {
        getAllStaff();
    }

    //Добавление\Трудоустройство нового сотрудника
    void registerEmployee(Employee employee) {
        connectDb.connectDb();
        transferToDb.addEmployee(employee);
        System.out.println("Сотрудник внесен в БД");
        connectDb.disconnectDb();
    }

    //передать общее кол-во сотрудников в организации
    void getAllStaff() {
        connectDb.connectDb();
        countEmployee = transferToDb.getListEmployee().size();
        System.out.println("Колличество сотрудников в организации: " + countEmployee + " человек");
        saveToListName();
        connectDb.disconnectDb();
    }

    //HR сохраняет из базы себе в лист имена всех сотрудников допустим в txt файл
    void saveToListName() {
        for (int i = 0; i < transferToDb.getListEmployee().size(); i++) {
            listNameAllStaff.add(transferToDb.getListEmployee().get(i).getName());
        }
    }

    //Отправка на принтер в офисе печати списка имен сотрудников организации
    void printedNameStaff() {
        System.out.println("Отправка на печать");
        printer.sendToPrinter(listNameAllStaff);
        System.out.println("Распечаталось, заберите из принтера");
    }
}