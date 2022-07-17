package bai7.model;

public class Teacher extends Person{
    private int id;
    private int salary;
    private int bonus;
    private int penaty;

    public Teacher(String fullName, int age, String country, int id, int salary, int bonus, int penaty) {
        super(fullName, age, country);
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
        this.penaty = penaty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public double getPenaty() {
        return penaty;
    }

    public void setPenaty(int penaty) {
        this.penaty = penaty;
    }

    public int getRealSalary() {
        return salary + bonus - penaty;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", real salary=" + this.getRealSalary() +
                '}';
    }
}
