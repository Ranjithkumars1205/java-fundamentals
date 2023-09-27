package Inheritance.HAS_A_relationship;

import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Department> department;

    public University(String name) {
        this.name = name;
        department = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        this.department.add(department);
        System.out.println("department " + this.department);
    }
}
