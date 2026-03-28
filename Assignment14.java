// Base class Person
class Person {
    void role() {
        System.out.println("Person's role");
    }
}

// Employee class extends Person
class Employee extends Person {
    void role() {
        System.out.println("Employee");
    }
}

// Manager class extends Employee
class Manager extends Employee {
    void role() {
        System.out.println("Manager");
    }
}

public class Assignment14 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Employee();
        Person p3 = new Manager();

        p1.role(); // Person
        p2.role(); // Employee
        p3.role(); // Manager
    }
}