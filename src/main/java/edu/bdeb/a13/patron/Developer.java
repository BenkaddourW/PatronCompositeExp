package edu.bdeb.a13.patron;

public class Developer implements Employee {
    private String name;
    private String position;

    public Developer(String name, String position) {
        this.name = name;
        this.position = position;
    }
    @Override
    public void showDetails() {
            System.out.println(name + " works as " + position);

    }
}
