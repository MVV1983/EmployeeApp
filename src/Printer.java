import java.util.List;

public class Printer {


    public Printer() {

    }

    public void printCountEmployee(TransferToDb transferToDb, ConnectDb connectDb) {
        connectDb.connectDb();
        transferToDb.getListEmployee().size();
        System.out.println(transferToDb.getListEmployee().size());
        connectDb.disconnectDb();
    }

    public void printEmployeeList(TransferToDb employeeDB) {
        for (int i = 0; i < employeeDB.getListEmployee().size(); i++) {
            if (employeeDB.getListEmployee().size() == 0) {
                System.out.println("Список сотрудников пуст");
            } else {
                System.out.println(employeeDB.getListEmployee().get(i).getName());
            }
        }
    }

    //Отправка на принтер
    public void sendToPrinter(List<String> list) {
        System.out.println("********");
        for (String unit : list) {
            System.out.println(unit);
        }
        System.out.println("********");
    }
}