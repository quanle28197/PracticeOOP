package bai1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerOfficer {
    private List<Officer> officers;

    public ManagerOfficer() {
        this.officers = new ArrayList<>();
    }

    public void addNewOfficer(Officer officer) {
        this.officers.add(officer);
    }

    public List<Officer> searchByName(String name) {
        return this.officers.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }

    public void showListOfficer() {
        this.officers.forEach(o -> System.out.println(o.toString()));
    }
}
