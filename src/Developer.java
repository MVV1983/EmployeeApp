

public class Developer extends Person implements Employee {

    double workTime;

    public Developer(String name, int age, String gender) {
        super(name, age, gender);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void work() {

    }

    public void writeCode() {

    }
}