package edu.bdeb.a13.patron;

public class Main {
    public static void main(String[] args) {
        Employee dev1 = new Developer("Alice", "Frontend Developer");
        Employee dev2 = new Developer("Bob", "Backend Developer");
        Employee designer = new Designer("Eve", "UX Designer");

        Manager techLead = new Manager("John", "Tech Lead");
        techLead.addSubordinate(dev1);
        techLead.addSubordinate(dev2);

        Manager projectManager = new Manager("Emma", "Project Manager");
        projectManager.addSubordinate(techLead);
        projectManager.addSubordinate(designer);


        // Affiche la hiérarchie
        projectManager.showDetails();
    }
}