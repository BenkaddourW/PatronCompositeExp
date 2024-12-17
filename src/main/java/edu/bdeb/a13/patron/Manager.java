package edu.bdeb.a13.patron;
import java.util.ArrayList;
import java.util.List;
public class Manager implements Employee {
    private String name;
    private String position;
    private List<Employee> subordinates = new ArrayList<>();
    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }
    public void addSubordinate(Employee employee) {
        subordinates.add(employee);}
    public void removeSubordinate(Employee employee) {
        subordinates.remove(employee);
    }
    @Override
    public void showDetails() {
        System.out.println(name + " is a " + position);
        System.out.println("Subordinates:");
        for (Employee e : subordinates) {
            e.showDetails();

        }
    }
}