class Employee {
    int age, salary;
    String name, address, phone;

    void printSalary() {
        System.out.println("Salary is " + salary);
    }
}

class Officer extends Employee {
    String specialization = "Marketing";
}

class Manager extends Employee {
    String department = "Sales";
}

public class P9HierarchicalInheritance {
    public static void main(String[] args) {
        Officer officer = new Officer();
        Manager manager = new Manager();

        officer.name = "Jim";
        officer.age = 32;
        officer.phone = "+918745363267";
        officer.address = "133 Street, Left Lane, One City";
        officer.salary = 68500;

        manager.name = "Bob";
        manager.age = 46;
        manager.phone = "+917345328676";
        manager.address = "Apt 214, Side Street, Spring Lake";
        manager.salary = 77800;

        System.out.println("\nOFFICER DETAILS");
        System.out.println("Name: " + officer.name);
        System.out.println("Age: " + officer.age);
        System.out.println("Phone number: " + officer.phone);
        System.out.println("Address: " + officer.address);
        System.out.println("Specialization: " + officer.specialization);
        officer.printSalary();

        System.out.println("\nMANAGER DETAILS");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone number: " + manager.phone);
        System.out.println("Address: " + manager.address);
        System.out.println("Department: " + manager.department);
        manager.printSalary();
    }
}
