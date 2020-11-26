public class HR implements Employee {

    private String name;

    public HR(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void work() {

    }

    static void getAllStaff(EmployeeDB employeeDB) {//передать общее кол-во сотрудников в организации
        System.out.println("Колличество сотрудников в организации: " + employeeDB.getListEmployee().size() + " человек");
    }
}