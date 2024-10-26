class Employee {
    public void display() {
        System.out.println("This is from employee class");
    }

    public void calcSalary() {
        System.out.println("Salary of employee is 50000");
    }
}

class Engineer extends Employee {
    public void calcSalary() {
        super.calcSalary();
        System.out.println("Salary of engineer is 80000");
    }
}

public class P8Override {
    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        engineer.display();
        engineer.calcSalary();
    }
}
