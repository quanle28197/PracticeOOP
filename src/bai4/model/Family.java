package bai4.model;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private String address;
    private List<Person> persons;

    public Family() {
        this.persons = new ArrayList<>();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    @Override
    public String toString() {
        return "Family{" +
                "address='" + address + '\'' +
                ", number of persons=" + persons.size() + '\'' +
                ", persons=" + persons +
                '}';
    }
}
