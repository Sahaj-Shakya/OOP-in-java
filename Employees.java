class Employee {
    public void work(){
        System.out.println("Employee is working.");
    }

    public void getSalary(){
        System.out.println("Employee gets salary.");
    }
}

class HRManager extends Employee{
    
    public void work() {
        System.out.println("The HR manager is working.");
    }

    public void addEmployee(){
        System.out.println("Employee add!");
    }
}

public class Employees{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.work();
        emp.getSalary();

        HRManager HR = new HRManager();
        HR.work();
        HR.addEmployee();
    }
}


