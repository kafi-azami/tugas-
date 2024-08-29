//Object Class
class Employee {
    String name;
    double salary;

    // Constructor Parameter
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // method 
    public void print() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}