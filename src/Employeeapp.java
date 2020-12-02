public class Employeeapp {


    public static void main(String[] args) {

        HR hr = new HR("Kaktus23", 48, "female");
        Employee dev1 = new Developer("goose1", 32, "female");
        Employee dev2 = new Developer("goose2", 30, "male");
        Employee hiro = new Worker("Dizzer", 25, "male");

        System.out.println();
        //происходит трудоустойство сотрудников и заносятся в общую БД данные о сотрудниках
        hr.registerEmployee(hr);
        hr.registerEmployee(dev1);
        hr.registerEmployee(dev2);
        hr.registerEmployee(hiro);
        System.out.println();


        System.out.println(hiro.getName());
        hiro.work();

        System.out.println();
        hr.work();
        hr.printedNameStaff();
    }
}