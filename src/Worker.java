
public class Worker extends Person implements Employee {


    public Worker(String name, int age, String gender) {
        super(name, age, gender);

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void work() {
        System.out.println("Мое имя: " + name + ", я работаю в ");
    }

}
