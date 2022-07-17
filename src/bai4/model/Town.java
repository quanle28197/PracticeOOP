package bai4.model;

import java.util.ArrayList;
import java.util.List;

public class Town {
    List<Family> families;

    public Town() {
        this.families = new ArrayList<>();
    }

    public Town(List<Family> families) {
        this.families = families;
    }

    public List<Family> getFamilies() {
        return families;
    }

    public void setFamilies(List<Family> families) {
        this.families = families;
    }

    public void addFamily(Family family) {
        families.add(family);
    }
}
